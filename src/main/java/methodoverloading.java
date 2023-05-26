public class methodoverloading {

    public void method1(int i)
    {
        System.out.println(i);
    }
    public void method1(int i, int j)
    {
        System.out.println(i+j);
    }
    public void method1(int i, int j, int k)
    {
        System.out.println(i+j+k);
    }

    public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.method1(1);
        obj.method1(1,2);
        obj.method1(1,2,3);
    }

}
