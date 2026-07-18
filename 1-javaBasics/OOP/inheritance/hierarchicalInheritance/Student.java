package OOP.inheritance.hierarchicalInheritance;

public class Student {
    public String name;
    public int id;

    public Student(String nm , int i){
        name = nm;
        id = i;
    }
    
    public void showDetail(){
        System.out.println(name + " " + id);
    }
}
