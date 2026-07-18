package OOP.multiClass;     /* This package needs to be called for nested folder's files */

public class Tester {
    public static void main(String[] args) {
        
        Student s1 = new Student("Bob", 11);
        Student s2 = new Student("Carol" , 33);
        Course c1 = new Course("CSE111" );          /* Firstly, c1 object's datatype is Course and these strings are going to constructor then to the instance var of Course  */
        Course c2 = new Course("MAT120");           /* Constructor > instance variable of Course class */
        Course c3 = new Course("PHY111");
    
    
        s1.addCourse(c1);           /*s1 object's addCourse method receives c1 as a Course class's object  */
        s1.addCourse(c2 , c3);
        s1.showDetail();
    }
    


}
