package OOP;
public class tester {
     public static void main(String[] args) {
        System.out.println("Number of Laptops:" + Laptop.count);
        Laptop p1 = new Laptop();
        System.out.println("1===================");
        p1.addFeature("Display", "15.1 inch");
        System.out.println("2===================");
        p1.updateName("Asus Zenbook");
        p1.addFeature("Display", "15.1 inch");
        p1.printDetail();
        System.out.println("3===================");
        Laptop p2 = new Laptop("HP Probook");
        p2.addFeature("Display", "14.0 inch");
        p2.addFeature("Ram", "8 GB");
        System.out.println("4===================");
        p2.printDetail();
        p2.addFeature("Display", "Oled panel");
        p2.addFeature("Ram", "DDR5");
        System.out.println("5===================");
        p2.printDetail();
        System.out.println("6===================");
        System.out.println("Number of Laptops:" + Laptop.count);
  }
}
