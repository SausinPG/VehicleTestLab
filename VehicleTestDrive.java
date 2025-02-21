public class VehicleTestDrive {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Cybertruck", 2023, 100, 10430);
        GasCar bmw = new GasCar("BMW", "328i", 2013, 40, 30);

        System.out.println();
        System.out.println("Testing electric vehicle:");
        System.out.println();
        tesla.displayMileage();
        tesla.start();
        tesla.accelerate();
        tesla.stop();
        tesla.charge();
        tesla.start();
        tesla.accelerate();
        tesla.stop();

        System.out.println();
        System.out.println("Testing gas car:");
        System.out.println();
        bmw.displayTirePressure();
        bmw.start();
        bmw.accelerate();
        bmw.stop();
        bmw.refuel();
        bmw.start();
        bmw.accelerate();
        bmw.stop();


    }
}
