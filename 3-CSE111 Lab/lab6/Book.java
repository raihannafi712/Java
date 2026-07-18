package lab6;

public class Book {
    public static int total_books_sold = 0;
    public static double total_revenue;
    private String name;
    public int discount;
    private double price = 150;

    public Book(String nm , int discount){
        this.name = nm;
        this.discount = discount;
        this.price = (this.price - (this.price * this.discount / 100));
        Book.total_books_sold ++;
        Book.total_revenue += this.price;
    }

    public void bookDetails(){
        System.out.println("Title: " + this.name);
        System.out.println("Price after Discount: " + price);
    }
}
