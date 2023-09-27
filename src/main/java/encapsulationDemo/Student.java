package encapsulationDemo;

public class Student {

    private String name;
    private int rollnumber;
    private String collegename;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public  int getRollnumber()
    {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber)
    {
        this.rollnumber = rollnumber;
    }

    public void setCollegename(String collegename)
    {
        this.collegename = collegename;
    }
}
