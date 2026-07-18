package lab2;

// TASK 1

// class University {
//     public String name;
//     public String country;
// }
       // // public class UniversityTester{
    //     public static void main(String[] args) {
    //         // a
    //         University s1 = new University();
    //         University s2 = new University();

    //         System.out.println(s1);
    //         System.out.println(s2);

    //         System.out.println(s1.name);
    //         System.out.println(s1.country);
    //         System.out.println(s2.name);
    //         System.out.println(s2.country);

    //         // b
    //         s1.name = "Imperial College London";
    //         s1.country = "England";

    //         s2.name = "BRAC University";
    //         s2.country = "Bangladesh";

    //         System.out.println(s1.name);
    //         System.out.println(s1.country);
    //         System.out.println(s2.name);
    //         System.out.println(s2.country);
    //     }

    // }




// TASK 2

// class Student{
//     public String name = "Default";
//     public int id = 0;
// }




//  TASK 3
// class CSECourse{
//     public String courseName = "Programming Language II";
//     public String CourseCode = "CSE111";
//     public int credit = 3;
// }





// TASK 4

// class ImaginaryNumber{
//     public int realPart = 0;
//     public int imaginaryPart = 0;
    
//     public void printNumber(){
//         System.out.println(realPart + " + " + imaginaryPart + "i" );
//     }
// }





// TASK 5

// class Course{
//     public String courseName;
//     public String courseCode;
//     public int credit;


//     public void updateDetails(String courseName , String courseCode , int credit){
//         this.courseName = courseName;
//         this.courseCode = courseCode;
//         this.credit = credit;
//     }

//     public void displayCourse(){
//         System.out.println("Course Name: " + this.courseName);
//         System.out.println("Course Code: " + this.courseCode);
//         System.out.println("Course Credit: " + this.credit);
//     }
// }






// TASK 6

// class Assignment{
//     public int tasks = 0;
//     public String difficulty;
//     public boolean submission = false;

//     public void printDetails(){
//         System.out.println("Number of tasks: " + tasks);
//         System.out.println("Difficulty level: " + difficulty);
//         System.out.println("Submission required: " + submission);
//     }
//     public String makeOptional(){
//         if (submission) {
//             submission = false;
//             return "Assignment will not require";
//         } else {
//             return "Assignment will not require ";
//         }
//     }
// }




//  TASK 7

// class CellPhone{
//     public String model = "unknown";
//     public int contactNum = 0;
//     public String [] contactName = new String[3];
//     public int maxContacts = 3;

//     public void storeContact(String contactName){
//         if (contactNum < maxContacts) {
//             this.contactName[contactNum] = contactName;
//             contactNum += 1;
//             System.out.println("Contact stored");
//         }else{
//             System.out.println("Memory full. New contact can't be stored.");
//         }
//     }
//     public void printDetails(){
//         System.out.println("Phone model: " + model);
//         System.out.println("Contacts stored: " + contactNum);
//         if (contactNum > 0) {
//             System.out.println("Stored contacts: ");
//             for (int i = 0; i < contactNum; i++) {
//                 System.out.println(contactName[i]);
//             }
//         }
//     }
// }



// TASk 8

// class Employee{
//     public String employeeName;
//     public double employeeSalary = 30000;
//     public String employeeDesignation = "junior";
    

//     public void newEmployee(String inputName){
//         employeeName = inputName;

//     }

//     public void displayInfo(){
//         System.out.println("Employee Name: " + employeeName);
//         System.out.println("Employee Salary: " + employeeSalary);
//         System.out.println("Employee Designation: " + employeeDesignation);
//     }

//     public void calculateTax(){
//         if (employeeSalary > 30000 && employeeSalary < 50000){
//             double employeeTax = (employeeSalary * 0.10);
//             System.out.println(employeeName + " Tax amount :" + employeeTax);
//         } else if ( employeeSalary > 50000) {
//             double employeeTax = (employeeSalary* 0.30);
//             System.out.println(employeeName + " Tax amount :" + employeeTax);          
//         }else{
//             System.out.println("No need to pay tax");
//         }
//     }

//     public void promoteEmployee(String designation){
//         employeeDesignation = designation;
//         if (employeeDesignation == "senior") {
//             employeeSalary += 25000;
//         }else if (employeeDesignation == "lead") {
//             employeeSalary += 50000;
//         }else if (employeeDesignation == "manager") {
//             employeeSalary += 75000;
//         }
//         System.out.println(employeeName + " has been promoted to " + employeeDesignation);
//         System.out.println("New Salary: " + employeeSalary);

//     }
// }



public class designLab2 {
    
}
