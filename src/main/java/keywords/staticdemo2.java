package keywords;

class A
{
    static int i = 100;
    static void classA()
    {
        System.out.println("This is the static method of class A");
    }

}


public class staticdemo2 {
    public static void main(String[] args) {
        System.out.println(A.i);
        A.classA();
    }
}
