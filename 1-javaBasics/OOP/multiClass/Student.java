package OOP.multiClass;

public class Student {
    public String name;
    public int id;
    public Course[] courses = new Course[5];
    public int courseCount = 0;

    public Student (String name , int id){
        this.name = name;
        this.id = id;
    }

    // Takes one course
    public void addCourse(Course c){       /* c = c1 object */
        courses[courseCount] = c;          /* c1 imports the courseName instance variable's value */
        courseCount ++;
    }

    // Takes two courses
    public void addCourse(Course c , Course d){
        courses[courseCount] = c;
        courseCount ++;
        courses[courseCount] = d;
        courseCount++;
    }

    public void showDetail(){
        System.out.println("Name: "+ name);
        System.out.println("ID: " + id);
        System.out.println("Courses taken: " );
        for (int i = 0; i < courseCount; i++) {
            System.out.println(courses[i].courseName);
            
        }
    }
}
