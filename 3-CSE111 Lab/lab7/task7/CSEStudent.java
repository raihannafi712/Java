package lab7.task7;

public class CSEStudent {
    private static int totalMainStudentsCount = 0;
    private static String totalLabCourseInfo = "CSE110 CSE111 CSE220 CSE221 ";
  
    public CSEStudent(String name, int id) {

      super(name, id);
      totalMainStudentsCount++;
    }
  
    public static void details() {

      System.out.println("Total CSE Students: " + totalMainStudentsCount);
      System.out.println("Available Lab Based Courses: ");
      System.out.println(totalLabCourseInfo);
    }
  
    public void addLabBasedCourse(String course) {
        
      if (totalLabCourseInfo.contains(course + " ")) {
        courses += course + " ";
      } else {
        System.out.println("It is not a lab based course!");
      }
    }
}
