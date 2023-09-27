package abstraction;

abstract class vehicle
{
    public abstract void fueltype();


    public void colour()
    {
        System.out.println("Vehicle colour is Green");
    }

}
class car extends vehicle
{    @Override
    public void fueltype() {
        System.out.println("Diesel");
    }
}
class bike extends vehicle
{    @Override
    public void fueltype() {
        System.out.println("Petrol");
    }
}



public class abstractionDemo
{
    public static void main(String[] args) {
        car c = new car();
        c.fueltype();
        c.colour();

        bike b = new bike();
        b.fueltype();
        b.colour();
    }
}
