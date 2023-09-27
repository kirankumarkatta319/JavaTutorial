package encapsulationDemo;

public class studentdetails {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("Kiran Kumar");
        stu.setRollnumber(1);
        stu.setCollegename("ABC College");

        System.out.println(stu.getName());
        System.out.println(stu.getRollnumber());


    }
}
