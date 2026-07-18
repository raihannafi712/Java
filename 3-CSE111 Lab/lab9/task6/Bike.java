package lab9.task6;

public class Bike extends Vehicle {
    private String carModelMain;
    private boolean sideCarModel;

    public Bike(String brand, String carModelMain, int year, int wheels, boolean sideCarModel) {

        super(brand, year);
        this.carModelMain = carModelMain;
        this.sideCarModel = sideCarModel;
        setWheels(wheels);
    }

    public void doAWheelie() {

        if (sideCarModel) {

            System.out.println("Wheelie Failed. " + getBrand() + ":" + carModelMain + " has SideCar");
        } else {

            System.out.println(getBrand() + ":" + carModelMain + " is doing Wheelie!!");
        }
    }

    public String toString() {
        
        return "Bike Brand: " + getBrand() + ", Year: " + getYear() + ", Wheels: " + getWheels() +
                ", Model: " + carModelMain + ", SideCar: " + sideCarModel;
    }
}

