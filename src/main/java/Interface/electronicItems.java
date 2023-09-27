package Interface;

interface features
{
    void call();
    default void message()
    {
        chat();//private method
        System.out.println("This is default method");
    }

    static void add(int a, int b)
    {
        System.out.println(a+b);
    }
    private void chat()
    {
        System.out.println("This is private method");
    }
}

class landline implements features
{
    public void call()
    {
        System.out.println("Calling from Interface.landline");
    }
}
class mobile implements features
{
    @Override
    public void call() {
        System.out.println("Calling from Interface.mobile");
    }

//    @Override
//    public void message() {
//        System.out.println("This is message method from Interface.mobile class");
//    }
}
public class electronicItems {
    public static void main(String[] args) {
        landline lp = new landline();
        lp.call();

        mobile mp = new mobile();
        mp.call();
        mp.message();
        features.add(1,2);
    }
}
