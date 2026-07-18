package lab6;

public class Cargo {
    private static double capacity = 10.00;
    private String name;
    private int ownId;
    private double weight;
    private static int count = 0;
    public boolean load = false;


    public Cargo(String nm , double w){
        this.name = nm;
        this.weight = w;
        count++;
        this.ownId = count;
    }

    public static double capacity(){
        return capacity;
    }

    public void details(){
        System.out.println("Cargo ID: " + ownId + ", Contents: " + this.name + ", Weight: " + this.weight + ", Loaded: " + load);
    }

    public void load(){
        if (capacity > this.weight) {
            load = true;
            System.out.println("Cargo " + count + " loaded for transport.");
            capacity -= this.weight;
        } else {
             System.out.println("Cannot load cargo, exceeds weight capacity.");
        }
    }

    public void unload(){
        System.out.println("Cargo " + ownId + " unloaded");
        capacity += weight;
        load = false;
        System.out.println("Cargo Capacity: " + capacity);
    }
}
