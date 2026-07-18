package OOP.inheritance.hierarchicalInheritance;

public class BBAStudent extends Student {       /* Child 2 */
    public BBAStudent(String nm , int i){
        super(nm, i);
    }

    public void party(){
        System.out.println("BBA party");
    }
}
