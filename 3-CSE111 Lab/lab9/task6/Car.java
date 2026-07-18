package lab9.task6;

public class Car extends Vehicle {

    private String model;
    private int doors;
    private boolean autoPilot;

    public Car(String brand, String model, int year, int doors, int wheels, boolean autoPilot) {

        super(brand, year);
        this.model = model;
        this.doors = doors;
        this.autoPilot = autoPilot;
        setWheels(wheels);
    }

    public void startAutoPilot() {

        if (autoPilot) {

            System.out.println(getBrand() + ":" + model + " AutoPilot Started");
        } else {
            
            System.out.println(getBrand() + ":" + model + " has NO AutoPilot");
        }
    }

    public String toString() {
        
        return "Car Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels() +
        ", Model: " + model + ", Doors: " + doors + ", AI: " + autoPilot;
    }
}

