package lab6;

public class Passenger {
    public static int no_of_passenger = 0;
    public static double total_fare;
    private double distance;
    private double weight;
    private String name;
    private double personFare;

    public Passenger(String nm , double d){
        this.name = nm;
        this.distance = d;
        this.personFare = (20 * distance);
        no_of_passenger++;
        total_fare += this.personFare;
    }

    public void passengerDetails(){
        System.out.println("Name: " + name);
        System.out.println("Fare: " + personFare);
    }

    public void storeBaggageWeight(double w){
        this.weight = w;
        total_fare += (10 * weight);
    }

    

}
