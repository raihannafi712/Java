package lab6;

public class Circle {
    public static int count;
    private double radius;
    
    public Circle(double r){
        setRadius(r);
        count++;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public double area(){

        return Math.PI * radius * radius;
    }
}
