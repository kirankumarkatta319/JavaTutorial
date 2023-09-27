package keywords;

class college
{
    String name;
    static String collegename = "ABC college";
    int rollnumber;

    college(String name, int rollnumber)
    {
        this.name = name;
        this.rollnumber = rollnumber;
    }

    void display()
    {
        System.out.println(name + " " + rollnumber + " " + collegename);
    }

}


public class Student {

    public static void main(String[] args) {
        college c = new college("Kiran", 1);
        c.display();
        college c1 = new college("Kumar", 2);
        c1.display();
        college c2 = new college("Ravi", 3);
        c2.display();

    }
}
