package JavaBrain;

public class sportCar implements car {
    @Override
    public void drive() {
        System.out.println("Please drive your car");

    }

    @Override
    public void fuel(String fuel) {
        System.out.println("most of the cars using " + fuel);
    }

    public static void main(String[] args) {
        sportCar sp = new sportCar();
        sp.drive();
        sp.driveable();
        sp.fuel("gas");
    }

}
