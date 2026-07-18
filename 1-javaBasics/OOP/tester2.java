package OOP;
import OOP.accessModifiers.*;


public class tester2 {
    public static void main(String[] args) {        /* NON SUB CLASS (DIFFERENT PACAKGE) */

        design s1 = new design("Bob", "11");
        System.out.println("Name" + s1.name);
        // System.out.println("ID" + s1.id);           /* Private cannot be accessed */
        // System.out.println("Age " + s1.age);        /* Private cannot be accessed */
        // System.out.println("CGPA " + s1.cgpa);      /* Private cannot be accessed */
    }
}
