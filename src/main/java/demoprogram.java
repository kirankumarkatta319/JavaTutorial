import java.util.LinkedList;
import java.util.List;

public class demoprogram {

    public static void main(String[] args) {


//        String s = new String("5");
//        System.out.println(1 + 10 + s );
//        System.out.println(s + 1 + 10);

//        int []a = {1,2,3,4,5};
//        int temp;
//        for(int i =0;i<a.length;i++)
//        {
//            for(int j=i+1;j<a.length;j++)
//            {
//                temp = a[i];
//                a[i]=a[j];
//                a[j]=temp;
//            }
//        }
//
//        System.out.println(a);


        int []a = {1,4,9,5,10,3};
        int result;
        for(int i = 0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                result = a[i] + a[j];

                if(result == 14)
                {
                    System.out.println(a[i] + " " + a[j]);
                }
            }
        }
    }
}
