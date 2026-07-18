package lab9.task6;

public class Garage {
    public Car[] cars;
    public Bike[] bikes;
    private int carIndex = 0;
    private int bikeIndex = 0;

    public Garage(int carCap, int bikeCap) {

        System.out.println("Welcome to the Garage!");
        System.out.println("Car Capacity: " + carCap);
        System.out.println("Bike Capacity: " + bikeCap);
        cars = new Car[carCap];
        bikes = new Bike[bikeCap];
    }

    public void addVehicle(Vehicle v) {

        if (v instanceof Car) {

            if (carIndex < cars.length) {

                cars[carIndex] = (Car) v;
                System.out.println("A " + v.getBrand() + " CAR has been added to the Garage");
                carIndex++;
            } else {

                System.out.println("Can't add more Cars! Capacity: " + cars.length);
            }
        } else if (v instanceof Bike) {

            if (bikeIndex < bikes.length) {

                bikes[bikeIndex] = (Bike) v;
                System.out.println("A " + v.getBrand() + " BIKE has been added to the Garage");
                bikeIndex++;
            } else {
                
                System.out.println("Can't add more bikes! Capacity: " + bikes.length);
            }
        }
    }
}

