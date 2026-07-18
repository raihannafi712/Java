package lab4;

// TASK 4

// public class Student {
//     int StudentId;
//     double studentCgpa = -1;
//     String[] perStudentCourse = new String[4];
//     int perStudentCourseCount = 0;

//     public Student(int studentMainId){
//         this.StudentId = studentMainId;
//         System.out.println("A student with ID " + studentMainId + " has been created.");
//     }

//     public Student(int id, double cgpa) {

//         this.StudentId = id;
//         this.studentCgpa = cgpa;
//         System.out.println("A student with ID " + id + " and cgpa " + cgpa + " has been created.");
//     }

//        public void addCourse(String course) {
//         if (studentCgpa == -1) {

//             System.out.println("Failed to add " + course);
//             System.out.println("Set CG first");
//         }

//         int maxCourses;
//         if (studentCgpa < 3.0) {

//             maxCourses = 3;
//         } else {

//             maxCourses = 4;
//         }

//         if (perStudentCourseCount >= maxCourses) {

//             System.out.println("Failed to add " + course);
//             if (studentCgpa < 3.0) {

//                 System.out.println("CG is low. Can't add more than 3 courses.");
//             } else {

//                 System.out.println("Maximum 4 courses allowed.");
//             }
//             return;
//         }

//         this.perStudentCourse[perStudentCourseCount] = course;
//         perStudentCourseCount++;
//     }

//     public void addCourse(String[] givenCoursesList) {

//         for (int i = 0; i < givenCoursesList.length; i++) {

//             addCourse(givenCoursesList[i]);
//         }
//     }

//     public void removeAllCourse() {

//         for (int i = 0; i < 4; i++) {

//             this.perStudentCourse[i] = null;
//         }
//         this.perStudentCourseCount = 0;
//     }

//     public void showAdvisee() {
//         System.out.println("Student ID: " + this.StudentId + ", CGPA: " + this.studentCgpa);
//         if (perStudentCourseCount == 0) {

//             System.out.println("No courses added.");
//         } else {

//             System.out.println("Added courses are:");
//             for (int i = 0; i < perStudentCourseCount; i++) {

//                 System.out.print(perStudentCourse[i] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public void storeCG(double studentCgpa){
//         this.studentCgpa = studentCgpa;
//         System.out.println("Student ID: " + this.StudentId + " , CGPA: " + this.studentCgpa);
//     }

//     public void storeID(int id) {

//         this.StudentId = id;
//     }
// }
