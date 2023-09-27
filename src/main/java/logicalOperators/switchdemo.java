package logicalOperators;

public class switchdemo {

    public static void main(String args[]) {
        int weekday = 1;
        String day;

        switch (weekday) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            default:
                day = "not matched";
                break;
        }
        System.out.println("The day is: "+ day);
    }
}
