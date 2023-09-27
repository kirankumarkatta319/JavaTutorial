public class ReverseAnInteger {

    public static void main(String[] args) {

        int a = 1234;

       int reverse =0;
       while(a!=0)
       {
           int reminder = a%10;
           reverse = reverse*10+reminder;
           a = a/10;
       }

        System.out.println(reverse);
    }
}
