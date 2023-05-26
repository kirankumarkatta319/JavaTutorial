abstract class vehicle{
    abstract public void fueltype();
}

class bike extends vehicle
{
    @Override
    public void fueltype() {
        System.out.println("Petrol");
    }
}
class car extends vehicle
{
    @Override
    public void fueltype() {
        System.out.println("Diesel");
    }
}

class main
{
    public static void main(String[] args) {
        bike b = new bike();
        b.fueltype();

        car c = new car();
        c.fueltype();
    }
}