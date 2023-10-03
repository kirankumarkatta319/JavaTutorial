package Collections;

import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ArrayList {
    public static void main(String[] args) {
        String [] s = {"Green", "Blue","White"};
//        List<String> l = new java.util.ArrayList<>();
//        for(String str: s)
//        {
//            l.add(str);
//        }
//        System.out.println(l);

        Stack<String> sta = new Stack<>();
        for(String str: s) {
            sta.add(str);
        }
        System.out.println(sta);

//        System.out.print("[");
//        for (int i = s.length-1;i>=0;i--)
//        {
//            System.out.print(s[i] + " ");
//        }
//        System.out.print("]");
    }
}
