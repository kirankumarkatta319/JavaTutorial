package hakerRank;

import com.github.dockerjava.api.model.Link;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Testing {
    public static void main(String[] args) {

//        String str = "bla bla Blue BLACK bLA blue Black bee Buble";
//        String st[] = str.split(" ");
//        try {
//            for (int i = 0; i < st.length-1; i++) {
//
//                if (st[i].contains(st[i+1])) {
//                    System.out.println("duplicate  : " + st[i]);
//
//                }
//
//            }
//
//
//        }
//        catch(ArrayIndexOutOfBoundsException ex)
//        {
//            System.out.println(ex.getMessage());
//        }

        String str = "JavaPrograming";

//        char[] c = str.toCharArray();
//        for(int i=0;i<c.length;i++)
//        {
//            for(int j=i+1;j<c.length;j++)
//            {
//                if(c[i]==c[j])
//                {
//                    System.out.println(c[j]);
//                    break;
//                }
//            }
//        }


//        char [] c = str.toCharArray();
//
//        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
//
//        for(char ch:c) {
//            if (hmap.containsKey(ch))
//            {
//                hmap.put(ch,hmap.get(ch)+1);
//            }
//            else
//            {
//                hmap.put(ch,1);
//            }
//        }
//        System.out.println(hmap);


//        char[] c= str.toCharArray();
//
//        LinkedHashSet<Character> hascar = new LinkedHashSet<>();
//
//        for(char ch:c)
//        {
//            hascar.add(ch);
//        }
//        System.out.println(hascar);//[P, a, r, v, g, i, J, m, n, o]




        String arrstr[] = {"blue", "blu", "BLU", "blu", "BLU"};
        //String [] arrstr = newstr.split(",");

        //Remove duplicates
//        LinkedHashSet<String> lshset= new LinkedHashSet<String>();
//
//        for(String loopstr: arrstr)
//        {
//            lshset.add(loopstr);
//        }
//        System.out.println(lshset);

//        System.out.println(arrstr.length);
//
//        for(int i=0;i< arrstr.length;i++)
//        {
//            for(int j=i+1;j< arrstr.length;j++)
//            {
//                if(arrstr[i]==arrstr[j])
//                {
//                    System.out.println(arrstr[i]);
//                }
//            }
//        }

        String newstr= "blue blu BLU blu BLU bla bla";
        String array[] = newstr.split(" ");

        for(int i = 0;i<array.length;i++)
        {
            int count = 1;
            for(int j = i+1;j<array.length;j++)
            {
                if(array[i].equals(array[j]))
                {
                    //count++;
                    //array[j]="0";
                    System.out.println(array[i]);
                }
            }
//            if(count>1)
//            {
//                System.out.println(array[i]);
//            }
        }

    }

}
