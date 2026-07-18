package lab2;

public class testerLab2 {
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

    // public static void main(String [] args){
    //     Student s1 = new Student();
    //     System.out.println("Name of the Student: "+s1.name);
    //     System.out.println("ID of the Student: "+s1.id);
    //     s1.name = "Bob";
    //     s1.id = 123;
    //     System.out.println("Name of the Student: "+s1.name);
    //     System.out.println("ID of the Student: "+s1.id);
    //  }
  






    // TASK 3

    // public static void main(String args []){
    //     CSECourse c1 = new CSECourse();
    //     System.out.println("Course Name: "+c1.courseName);
    //     System.out.println("Course Code: "+c1.courseCode);
    //     System.out.println("Credit: "+c1.credit);
    //    }
    






    // TASK 4

    // public static void main(String [] args){
    //     ImaginaryNumber num1 = new ImaginaryNumber();
    //     num1.printNumber();
    //     System.out.println("1********");
    //     num1.realPart=3;
    //     num1.imaginaryPart=7;
    //     num1.printNumber();
    //     System.out.println("2********");
    //     ImaginaryNumber num2 = new ImaginaryNumber();
    //     num2.realPart=1;
    //     num2.imaginaryPart=9;
    //     num2.printNumber();
    //    }
   




    // TASK 5

    // public class Tester5{
    //     public static void main(String[] args) {
    //       Course c1 = new Course();
    //       Course c2 = new Course();  
    //       c1.updateDetails("Programming Language I","CSE110", 3);
    //       System.out.println("========== 1 ==========");
    //       c1.displayCourse(); 
    //       c2.updateDetails("Data Structures","CSE220", 3);
    //       System.out.println("========== 2 ==========");
    //       c2.displayCourse();  
    //       c1.updateDetails("Programming Language II","CSE111", 3);
    //       System.out.println("========== 3 ==========");
    //       c1.displayCourse();
    //     }
      



    // TASK 6

    // public static void main(String [] args){
    //     Assignment as1 = new Assignment();
    //     as1.printDetails();
    //     System.out.println("1---------------");
    //     as1.tasks = 11;
    //     as1.difficulty = "Moderate";
    //     as1.submission = true;
    //     as1.printDetails();
    //     System.out.println("2---------------");
    //     System.out.println(as1.makeOptional());
    //     System.out.println("3---------------");
    //     as1.printDetails();
    //     System.out.println("4---------------");
    //     Assignment as2 = new Assignment();
    //     as2.tasks = 12;
    //     as2.difficulty = "Hard";
    //     as2.submission = false;
    //     as2.printDetails();
    //     System.out.println("5---------------");
    //     System.out.println(as2.makeOptional());
    //   }




    //  TASK 7 

    // public static void main(String[]args){
    //     CellPhone phone1 = new CellPhone();
    //     phone1.printDetails();
    //     phone1.model ="Nokia 1100";
    //     System.out.println("1##################");
    //     phone1.storeContact("Joy - 01834");
    //     System.out.println("===================");
    //     phone1.printDetails();
    //     System.out.println("2##################");
    //     phone1.storeContact("Toya - 01334");
    //     phone1.storeContact("Aayan - 01135");
    //     System.out.println("===================");
    //     phone1.printDetails();
    //     System.out.println("3##################");
    //     phone1.storeContact("Sani - 01441");
    //     System.out.println("===================");
    //     phone1.printDetails();  
    //  }




    // TASK 8

    // public static void main(String[] args){

    //     Employee emp1 = new Employee();
    //     Employee emp2 = new Employee();
    //     Employee emp3 = new Employee();
          
    //     emp1.newEmployee("Harry Potter");
    //     emp2.newEmployee("Hermione Granger");
    //     emp3.newEmployee("Ron Weasley");
    //     System.out.println("1 ==========");
    //     emp1.displayInfo();
    //     System.out.println("2 ==========");
    //     emp2.displayInfo();
    //     System.out.println("3 ==========");
    //     emp3.displayInfo();
    //     System.out.println("4 ==========");
    //     emp1.calculateTax();
    //     System.out.println("5 ==========");
    //     emp1.promoteEmployee("lead");
    //     System.out.println("6 ==========");
    //     emp1.calculateTax();
    //     System.out.println("7 ==========");
    //     emp1.displayInfo();
    //     System.out.println("8 ==========");
    //     emp3.promoteEmployee("manager");
    //     System.out.println("9 ==========");
    //     emp3.calculateTax();
    //     System.out.println("10 ==========");
    //     emp3.displayInfo();
    // }
   
    


    // Tracing

    // TASK 9

    // public class Human{
    //     public int age;
    //     public double height;
    // }
    // public static void main(String[] args) {
    //     Human h1 = new Human();
    //     Human h2 = new Human();
    //     h1.age = 21;
    //     h1.height = 5.5;
    //     System.out.println(h1.age);
    //     System.out.println(h1.height);
    //     h2.height = h1.height - 3;
    //     System.out.println(h2.height);
    //     h2.age = h1.age++;
    //     System.out.println(h1.age);
    //     h2 = h1;
    //     System.out.println(h2.age);
    //     System.out.println(h2.height);
    //     h2.age++;
    //     h2.height++;
    //     System.out.println(h1.age);
    //     System.out.println(h1.height);
    //     h1.age = ++h2.age;
    //     System.out.println(h2.age);
    //     System.out.println(h2.height);	
    // }



    // TASK 10

    // public class Student{ 
    //     public String name; 
    //     public double cgpa; 
    // }

    // public static void main(String[] args) {
    //     Student s1 = new Student();
    //     Student s2 = new Student();
    //     Student s3 = null;     
    //     s1.name = "Student One";
    //     s1.cgpa = 2.3;
    //     s3 = s1;
    //     s2.name = "Student Two";
    //     s2.cgpa = s3.cgpa + 1;
    //     s3.name = "New Student";
    //     System.out.println(s1.name);
    //     System.out.println(s2.name);
    //     System.out.println(s3.name);
    //     System.out.println(s1.cgpa);
    //     System.out.println(s2.cgpa);
    //     System.out.println(s3.cgpa);
    //     s3 = s2;
    //     s1.name = "old student";
    //     s2.name = "older student";
    //     s3.name = "oldest student";
    //     s2.cgpa = s1.cgpa - s3.cgpa + 4.5;
    //     System.out.println(s1.name);
    //     System.out.println(s2.name);
    //     System.out.println(s3.name);
    //     System.out.println(s1.cgpa);
    //     System.out.println(s2.cgpa);
    //     System.out.println(s3.cgpa);
    // }




    //  TASK 11

    // public class Task11 {
    //     public int p = 3, y = 2, sum;
    //     public void methodA(){
    //         int x = 0, y = 0;
    //         y = y + this.y;
    //         x = sum + 2 + p;
    //         sum = x + y + methodB(p, y);
    //         System.out.println(x + " " + y+ " " + sum);
    //     }
    //     public int methodB(int p, int n){
    //         int x = 0;
    //         y = y + (++p);
    //         x = x + 2 + n;
    //         sum = sum + x + y;
    //         System.out.println(x + " " + y+ " " + sum);
    //         return sum;
    //     }
    //  }

    // public static void main(String [] args){
    //     Task11 t1 = new Task11();
    //     t1.methodA();
    //     t1.methodA();
    // }
 
 
     
     
    

     
     
     
     
     
     
     
     
     
     
    
    



}
