package OOP.polymorphism.tracing;

public class Caramel extends DairyMilk {

    String texture = "Softy";
    public void method1(){
        System.out.println("Caramel m1");
    }
    public void method4(){
        System.out.println("Caramel m4");
    }
    public String toString(){
        method2();
        return "Caramel is " + texture;
    }
}
