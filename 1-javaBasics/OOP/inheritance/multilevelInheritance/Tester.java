package OOP.inheritance.multilevelInheritance;

public class Tester {
    public static void main(String[] args) {
        // CSEStudent s1 = new CSEStudent("Bob", 11, 3);
        // CSEFresher s2 = new CSEFresher("David", 55, 1);

        // Child calling own method
        // s2.addCourse();

        // Parent calling child's method        (NOT POSSIBLE)
        // s1.addCourse();

        // Child calling parent's method
        // s2.cry();





        // LOCAL VS THIS VS SUPER VARIABLES

        // method1()
        // s1.method1();

        // method2()
        // s1.method2();

        // method3()
        CSEFresher z1 = new CSEFresher();
        z1.method3();
    }
}
