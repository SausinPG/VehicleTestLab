public class ElectricCar extends Car {
    private int batteryLevel;
    private int batteryCapacity;
    private int mileage;

    // parameterized constructor
    public ElectricCar(String make, String model, int year, int batteryCapacity, int mileage) {
        super(make, model, year);
        this.batteryLevel = batteryCapacity;
        this.batteryCapacity = batteryCapacity;
        this.mileage = mileage;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getMileage() {
        return mileage;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void displayMileage() {
        System.out.println(getMake() + " " + getModel() + " has " + mileage + " miles on it.");
    }

    public void charge() {
        batteryLevel = batteryCapacity;
        System.out.println();
        System.out.println(getMake() + " " + getModel() + " is charging.");
        System.out.println(getMake() + " " + getModel() + " is completely charged.");
        System.out.println();
    }

    // starts car unless battery is at 0
    @Override
    public void start() {
        if (batteryLevel > 0) {
            super.start();
        } else {
            System.out.println(getMake() + " " + getModel() + "Cannot start. Battery is not charged.");
        }
    }

    //accelerates unless battery is at 0
    @Override
    public void accelerate() {
        if (batteryLevel > 0) {
            super.accelerate();
            batteryLevel -= 10;
        } else {
            System.out.println(getMake() + " " + getModel() + "Cannot accelerate. Battery is not charged.");
        }
    }


}
