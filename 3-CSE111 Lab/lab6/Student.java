package lab6;

public class Student {
    private String name;
    private int id;
    public static int totalCount = 0;
    public static int cseCount = 0;
    public static int otherCount = 0;
    private double cg;
    private String dept;


    public Student(String nm , double c){
        name = nm;
        cg = c;
        dept = "CSE";
        totalCount++;
        cseCount++;
        id = totalCount;
    }

    public Student(String nm , double c , String d){
        name = nm;
        cg = c;
        dept = d;
        totalCount++;
        otherCount++;
        id = totalCount;
    }

    public static void printDetails(){
        System.out.println("Total Student(s): " + totalCount);
        System.out.println("CSE Student(s): " + cseCount );
        System.out.println("Other Department Student(s): " + otherCount);
    }

    public void individualDetail(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cg);
        System.out.println("Department: " + dept);
    }
}
