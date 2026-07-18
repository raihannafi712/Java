package OOP.inheritance.hierarchicalInheritance;

public class CSEStudent extends Student {   /* Child class 1 */
    public int numLab;

    public CSEStudent(String nm , int i , int lab){
        super(nm , i);
        numLab = lab;
    }

    public void cry(){
        System.out.println(name + " is crying because of labs- " + numLab);
    }
}
