package hakerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        //Write code to filter duplicate elements from an array and print as a list.

        int a[] = {1,2,3,4,3,2,3,4,7,8,};

//        for(int i =0;i<a.length;i++)
//        {
//            for(int j=i+1;j<a.length;j++)
//            {
//                if(a[i]>a[j])
//                {
//                    int b = a[i];
//                    a[i]=a[j];
//                    a[j] = b;
//
//                }
//            }
//
//        }
        List<Integer> duplicates = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++) {
                if (i!=j && a[i]==a[j] && !duplicates.contains(a[i]))
                {
                    duplicates.add(a[i]);
                }
            }
        }
        System.out.println(duplicates);

        //Reverse a string
//       String s = "Kiran";
//
//       char [] c = s.toCharArray();
//
//       for(int i=c.length-1; i>=0;i--)
//        {
//            System.out.print(c[i]);
//        }


    }
}
