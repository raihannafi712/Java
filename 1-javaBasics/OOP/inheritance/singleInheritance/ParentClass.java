package OOP.inheritance.singleInheritance;

public class ParentClass {
    public String name;

    // Default constructor
    // public ParentClass(){
    //     System.out.println("No parameter parent constructor");
    // }

    public ParentClass(String nm){
        name = nm;
        System.out.println("1 parameter parent constructor");
    }
    
    public void eat(String nm){
        name = nm;
        System.out.println(name + " is eating");
    }
    
}
