package OOP.inheritance.basicInheritance;

public class CSEStudent extends Student {   /* CHILD CLASS OF STUDENT CLASS */
    // After calling this class inside tester, it searches here first and if not found, it extends to the parent class
    public CSEStudent(String nm , int i){
        name = nm;
        id = i;
    }
    // public void doClass(){
    //     System.out.println(name + "is in the class (Child class method)");
    // }

    // public void childMethod(){
    //     System.out.println(name + " is child method's part");
    // }




    // method overriding

    // public void override(int x){
    //     super.override();           /* This calls parent class's method */
    //     System.out.println("This is child class method");
    // }




    // toString method()

    public String toString(){       /* Method override */
        return "This method has overridden the default toString() method";
    }
}
