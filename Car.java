public class Car implements Vehicle {

    private String make;
    private String model;
    private int year;



    // parameterized constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String setMake(String make) {
        return this.make = make;
    }

    public String setModel(String model) {
        return this.model = model;
    }

    public int setYear(int year) {
        return this.year = year;
    }

    // starts car
    @Override
    public void start() {
        System.out.println(make + " " + model + " is starting.");
    }

    // stops car
    @Override
    public void stop() {
        System.out.println(make + " " + model + " is stopping.");
    }

    // accelerates car
    @Override
    public void accelerate() {
        System.out.println(make + " " + model + " is accelerating.");
    }
}
