package lab6;

public class Product {
    public String productName;
    private double productPrice;
    private int productQuant;

    public Product(){
        this.productName = "Unknown";
        this.productPrice = 0.00;
    }

    public Product(String nm , double price){
        this.productName = nm;
        this.productPrice = price;
    }

    public void displayInfo(){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + productPrice);
    }

    public void displayInfo(boolean s){
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + productPrice);
        System.out.println("Quantity: " + productQuant);
    }

    public double getPrice(){
        return productPrice;
    }

    public void setQuantity(int q){
        this.productQuant = q;
    }

    public int getQuantity(){
        return productQuant;
    }
}
