 class B{
    public B(){
        System.out.println(0);
    }
}

 class A extends B
{
    public A()
    {
        super();
        System.out.println(1);



        System.out.println(2);
    }
}

class mainmethod
{
    public static void main(String args[])
    {
        A a = new A();

    }
}
