package OOP.inheritance.singleInheritance;

public class ChildClass extends ParentClass {   /* SUB CLASS */

    public String color;

    // Before anything, we need to make sure we satisfy the parent class constructor first
    
    // If there is default constructor in parent class-
    // public ChildClass(){
    //     // super() is called internally / automatically here to call the default parent constructor 
    // }

    // If there is no default constructor in parent class
    public ChildClass(String nm, String clr){
        super(nm);  /* As the parent constructor takes only one String in this case */
    }


    public void bark(){
        System.out.println(name + " is barking.");
    }
}
