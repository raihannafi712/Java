package OOP.accessModifiers;

public class tester1 {              /* NON SUB CLASS (SAME PACAKGE) */
    public static void main(String[] args) {
        design s1 = new design("Bob", "11");

        s1.showDetail();
        System.out.println("Name" + s1.name);
        System.out.println("ID" + s1.id);
        // System.out.println("Age " + s1.age);    /* Private cannot be accessed */
        System.out.println("CGPA " + s1.cgpa);

        // See tester2 for different package accesses


        s1.updatePrivate(59);  /* to access private variable through method */




        // Private method

        // s1.privateMethod1();     /* private methods cannot be called directly outside its class */
        s1.privateCaller();         



        // Static variable

        System.out.println("Static variable: " + design.teamRun);
        s1.staticLocal();


        // static method

        design.staticMethod();

    }
}
