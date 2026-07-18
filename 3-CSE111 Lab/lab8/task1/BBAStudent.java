package lab8.task1;

public class BBAStudent extends Student {
    public String dept = "Default";


    public BBAStudent(){

    }

    public BBAStudent(String nm){
        dept = nm;
    }

    public void details(){
        System.out.println("Name: " + dept + " Department: BBA");
    }
}
