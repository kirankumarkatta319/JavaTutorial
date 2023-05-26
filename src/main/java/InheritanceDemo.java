class A
{
    public void sample()
    {
        System.out.println("Parent class");
    }
}

class B extends A{
    public void sample2()
    {
        System.out.println("child class");
    }
}

class C extends A{
    public void sample3()
    {
        System.out.println("Child class class c ");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        C c = new C();
        B b = new B();
        c.sample();
        b.sample2();
        b.sample();
        c.sample3();
    }
}
