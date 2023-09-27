package keywords;

public class staticDemo {

    int a=10;

    static int b = 20;


    void display()
    {
        System.out.println("This is non-static method");
    }

    static void displaymethod()
    {
        System.out.println("This is static method");
    }

    static
    {
        System.out.println("This is static block");
    }

    public static void main(String[] args) {
//       staticDemo demo = new staticDemo();
//        System.out.println(demo.a);
//        demo.display();

        System.out.println(b);
        staticDemo.displaymethod();
    }

}
