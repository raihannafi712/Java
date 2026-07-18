package OOP.inheritance.basicInheritance;

public class Tester {
    public static void main(String[] args) {
        
        CSEStudent s1 = new CSEStudent("Bob" , 11); /* Child object */
        Student s2 = new Student();                      /* Parent object */

        // Calling parent method with Child's object
        // s1.showDetail();

        // Calling child method with parent's object    /* NOT POSSIBLE */
        // s2.childMethod();







        // method overriding

        // s1.override();         /* Parent method */
        // s1.override(7);     /* Child method */




        // toString()

        Student s3 = new Student();
        CSEStudent s4 = new CSEStudent("Haha", 69);

        System.out.println(s3);
        System.out.println(s4);     /* method overridden */
        
    }
}
