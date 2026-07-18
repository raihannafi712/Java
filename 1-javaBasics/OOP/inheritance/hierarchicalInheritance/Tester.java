package OOP.inheritance.hierarchicalInheritance;

public class Tester {
    public static void main(String[] args) {
        
        CSEStudent s1 = new CSEStudent("Bob", 11, 3);
        BBAStudent b1 = new BBAStudent("Carol", 33);

        // Calling parent method from child's object
        s1.showDetail();

        // Calling own method
        s1.cry();

        // Calling Child 1's method with Child 2's object   (NOT POSSIBLE)
        // b1.cry();
    }
}
