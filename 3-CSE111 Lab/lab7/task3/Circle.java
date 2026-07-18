package lab7.task3;

public class Circle extends Shape {
    public int radius;
    public String name;
    public String color;

    public void area() {
      double area = Math.PI * radius * radius;
      System.out.println("Area of the circle: " + area);
    }

    public void displayInfo(){
      System.out.println("Name: " + name);
      System.out.println("Color: " + color);
    }
}
