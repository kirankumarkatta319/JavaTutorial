package ArraysDemo;

import java.util.*;

public class DuplicteNumbersArray {
    public static void main(String[] args) {
        int []a = {1,1,1,2,3,3,4,4,5,5,6,6,6,6,7,7,7,7,7};
        DuplicateNumbers(a);
    }

    public static void DuplicateNumbers(int a[])
    {
        Set<Integer> duplicateset = new LinkedHashSet();
        List<Integer> list = new ArrayList();
        for(Integer number: a)
        {
            if(!duplicateset.add(number))
            {
                if((!list.contains(number))) {
                    list.add(number);
                }
            }
        }
        System.out.println(list);

    }
}
