package OOP.inheritance.singleInheritance;

public class Tester {
    public static void main(String[] args) {
        
        ParentClass a1 = new ParentClass("Jack");
        // ParentClass a2 = new ParentClass();

        // Parent class accessing its own method
        // a1.eat("Rover");

        // Child class accessing parent class's method
        ChildClass c2 = new ChildClass("Hover", "Blue");
        c2.eat("Xover");

        // Parent class cannot acceess child class's method
        a1.eat("Rover");

        // ChildClass c1 = new ChildClass();
    }
}
