package Demo;

class methodOverriding {

    public void method2()
    {
        System.out.println("This is parent class");
    }
}

class child1 extends methodOverriding
{
    public void method2()
    {
        System.out.println("This is child1 class");
    }
}

class child2 extends child1
{
    public void method2()
    {
        System.out.println("This is child2 class");
    }
}

class methodOverridingexamples
{
    public static void main(String[] args) {

        methodOverriding obj1;
        obj1 = new child1();
        obj1.method2();
//obj1.method1();
        obj1 = new child2();
        obj1.method2();

    }
}