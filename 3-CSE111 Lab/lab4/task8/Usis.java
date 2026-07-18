package lab4.task8;

// TASK 8
// public class Usis {
//     int bracuAdvisee;
//     Student[] adviseeCount;
  
//     Usis() {
//       adviseeCount = new Student[5];
//       bracuAdvisee = 0;
//       System.out.println("Usis is ready to use!");
//     }
  
//     void login(Student s) {
//       if (s.StudentMail == null || s.StudentPass == null) {
//         System.out.println("Email and password need to be set.");
//       } else {
//         s.studentLoginStatus = true;
//         System.out.println("Login successful");
//       }
//     }
  
//     void advising(Student s) {
//       if (!s.studentLoginStatus) {
//         System.out.println("Please login to advise courses!");
//       } else {
//         System.out.println("You haven't selected any courses.");
//       }
//     }
  
//     void advising(Student s, String c1, String c2, String c3, String c4) {
//       if (!s.studentLoginStatus) {
//         System.out.println("Please login to advise courses!");
//       } else {
//         System.out.println("You need special approval to take more than 3 courses.");
//       }
//     }
  
//     void advising(Student s, String c1, String c2, String c3) {
//       if (!s.studentLoginStatus) {
//         System.out.println("Please login to advise courses!");
//         return;
//       }
//       s.TakenCourses[0] = c1;
//       s.TakenCourses[1] = c2;
//       s.TakenCourses[2] = c3;
//       if (bracuAdvisee < 5) {
//         adviseeCount[bracuAdvisee] = s;
//         bracuAdvisee++;
//       }
//       System.out.println("Advising successful!");
//     }
  
//     void allAdviseeInfo() {
//       System.out.println("Total Advisee: " + bracuAdvisee);
//       for (int i = 0; i < bracuAdvisee; i++) {
//         Student s = adviseeCount[i];
//         System.out.println("Name: " + s.bracuStudentName + " ID: " + s.StudentId);
//         System.out.println("Department: " + s.bracuStudentDept);
//         System.out.println("Advised Courses: ");
//         for (int j = 0; j < s.TakenCourses.length; j++) {
//           if (s.TakenCourses[j] != null) {
//             System.out.print(s.TakenCourses[j] + " ");
//           }
//         }
//         System.out.println("\n==============");
//       }
//     }
// }
