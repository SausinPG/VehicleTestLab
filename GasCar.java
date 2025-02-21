public class GasCar extends Car {

    private int fuelLevel;
    private int fuelCapacity;
    private int tirePressure;

    // parameterized constructor
    public GasCar(String make, String model, int year, int fuelCapacity, int tirePressure) {
        super(make, model, year);
        this.fuelCapacity = fuelCapacity;
        this.fuelLevel = fuelCapacity;
        this.tirePressure = tirePressure;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public int getTirePressure() {
        return tirePressure;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }

    public void displayTirePressure() {
        System.out.println("Tire Pressure: " + tirePressure + " psi.");
    }
    // prints when refueling
    public void refuel() {
        fuelLevel = fuelCapacity;
        System.out.println();
        System.out.println(getMake() + " " + getModel() + " is refueling");
        System.out.println(getMake() + " " + getModel() + " is at the maximum fuel level.");
        System.out.println();
    }

    // starts car unless fuel is at 0
    @Override
    public void start() {
        if (fuelLevel > 0) {
            super.start();
        } else {
            System.out.println(getMake() + " " + getModel() + " Cannot start. Fuel tank is empty");
        }
    }

    // accelerates unless fuel is at 0
    @Override
    public void accelerate() {
        if (fuelLevel > 0) {
            super.accelerate();
            fuelLevel -= 10;
        } else {
            System.out.println(getMake() + " " + getModel() + " Cannot accelerate. Fuel tank is empty");
        }
    }
}
