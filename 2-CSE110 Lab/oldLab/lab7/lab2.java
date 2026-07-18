package oldLab.lab7;
// import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        // TASK 1

        // Scanner sc = new Scanner(System.in);
        // int max = 0;
        // for (int i = 1; i <= 3; i+=1) {
        // System.out.println("Enter number= ");
        // int num1 = sc.nextInt();

        // if (i==1) {
        // max = num1;
        // } else if(num1 > max){
        // max = num1;
        // }
        // }
        // System.out.println(max + " is the largest number");
        // sc.close();


        // TASK 2

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your score= ");
        // int inputOne = sc.nextInt();

        // if (inputOne >= 0 && inputOne <= 100) {
        //     if (inputOne < 50) {
        //         System.out.println("Your grade is F");
        //     } else if (inputOne >= 50 && inputOne <= 56) {
        //         System.out.println("Your grade is D");
        //     } else if (inputOne >= 57 && inputOne <= 69) {
        //         System.out.println("Your grade is C");
        //     } else if (inputOne >= 70 && inputOne <= 84) {
        //         System.out.println("Your grade is B");
        //     } else if (inputOne >= 85 && inputOne <= 89) {
        //         System.out.println("Your grade is A-");
        //     } else if (inputOne >= 90 && inputOne <= 100) {
        //         System.out.println("Your grade is A");
        //     } else {
        //         System.out.println("error");
        //     }
        // } else {
        //     System.out.println("Enter valid score!");
        // }
        // sc.close();

        // TASK 3


        // Scanner sc = new Scanner(System.in);

        // for (int i = 0; i <1 ; i+=1) {
        //     System.out.println("Enter a number = ");
        //     int num = sc.nextInt();

        //     if (i==0) {
        //         if (num % 5==0 && num % 7 == 0) {
        //             System.out.println("Divisible by both");
        //         }else if(num % 5==0){
        //             System.out.println("Invalid: Divisible by 5 Only");
        //         }else if(num % 7 == 0){
        //             System.out.println("Invalid: Divisible by 7 Only");
        //         }else{
        //             System.out.println("No");
        //         }
        //     }
        // }
        // sc.close();


        // TASK 4

        // Scanner year = new Scanner(System.in);
        // System.out.println("Enter the year= ");
        // int input_year = year.nextInt();

        // if (input_year%4 == 0 && input_year%100 != 0 || input_year%400 == 0) {
        //     System.out.println(input_year +" is a leap year");
        // } else {
        //     System.out.println(input_year +" is not a leap year");
        // }

        // year.close();


        // TASK 5

        //   Scanner sc = new Scanner(System.in);
        //   System.out.println("Enter Number: ");
        //   int input_num = sc.nextInt();

        // if (input_num > 0) {
        //     if (input_num %2==0) {
        //         System.out.println("Even number and it is positive");
        //     } else {
        //         System.out.println("Odd number and it is positive");
        //     }
        // } else if (input_num == 0) {
        //     System.out.println("Number is zero");
        // }else if (input_num %2==0) {
        //     System.out.println("Even number and it is negative");
        // }else{
        //     System.out.println("Odd number and it is negative");
        // }
        
        // sc.close();


        // TASK 6

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your number= ");
        // int X = sc.nextInt();

        // if (X < 0) {
        //     System.out.println(2 * X  );
        // } else if (X >= 0 && X < 2) {
        //     System.out.println( X + 1 );
        // }else if (X >=2 && X < 5 ) {
        //     System.out.println( (X*X) - 1 );
        // }else if(X >= 5) {
        //     System.out.println((3*(X*X)) + 2);
        // }
        // sc.close();


        // TASK 7
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your ID= ");
        // int ID = sc.nextInt();
        // int session = ((ID / 100000)%10);

        // if (ID >= 10000000 && ID < 100000000) {
    
        //     switch (session) {
        //         case 1:
        //         System.out.println("Student joined BRAC in "+ "Spring" + " " + ( ID / 1000000));
        //             break;
        //         case 2:
        //         System.out.println("Student joined BRAC in "+ "Fall" + " " + ( ID / 1000000));  
        //         break;
    
        //         case 3:
        //         System.out.println("Student joined BRAC in "+ "Summer" + " " + ( ID / 1000000));
        //             break;
    
        //         default:
        //             break;             
        //     }
        // } else {
        //     System.out.println("Enter 8 digit ID!");
        // }
        // sc.close();

        
        
        
                   // TASK 8

                // int Pay = 15000; 
                // int Age = 17;        
        
                // if (Age < 18 ) {
                //     System.out.println("No Tax");
                // } else if (Pay < 10000) {
                //     System.out.println("No Tax");
                // } else if (Pay <= 10000 || Pay <= 20000) {
                //     double tax = (Pay * (5.00/100.00));
                //     System.out.println("tax amount=  " + tax);
                // } else {
                //     double tax = (Pay * (10.00/100.00));
                //     System.out.println("tax amount = " + tax);
                // }




        // TASK 9       

        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter first number- ");
        // double input_first = num.nextDouble();
      
        // System.out.println("Enter second number- ");
        // double input_second = num.nextDouble();
  
        // System.out.println("Enter third number- ");
        // double input_third = num.nextDouble();

        // if (input_first == input_second || input_first == input_third || input_second == input_third) {
        //     System.out.println("Please enter 3 unequal numbers");
        // } else if (input_first > input_second && input_first > input_third) {
        //     System.out.println("Maximum number is "+ input_first);
        
        // } else if (input_second > input_first && input_second > input_third) {
        //     System.out.println("Maximum number is "+ input_second);
        // }else {
        //     System.out.println("Maximum number is "+ input_third);
        // }

        // if (input_first == input_second || input_first == input_third || input_second == input_third) {
        //     System.out.println("Please enter 3 unequal numbers");
        // } else if (input_first < input_second && input_first < input_third) {
        //     System.out.println("Minimum number is "+ input_first);
   
        // } else if (input_second < input_first && input_second < input_third) {
        //     System.out.println("Minimum number is "+ input_second);
        // }else {
        //     System.out.println("Minimum number is "+ input_third);
        // }
            
        // num.close();




        // TASK 10   
        
        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter first number- ");
        // double input_first = num.nextDouble();
      
        // System.out.println("Enter second number- ");
        // double input_second = num.nextDouble();
  
        // System.out.println("Enter third number- ");
        // double input_third = num.nextDouble();

        // if (input_first == input_second && input_first == input_third && input_third == input_second) {
        //     System.out.println("Equilateral triangle");
        // } else if (input_first != input_second && input_first != input_third && input_third != input_second) {
        //     System.out.println("Scalene triangle");
        // }else {
        //     System.out.println("Isosceles triangle");
        // }
        // num.close();
 
        
        // TASK 11   /* Couldn't figure it out */



        // Task 12

        // Scanner num = new Scanner(System.in);
        // System.out.println("Enter first number- ");
        // double input_first = num.nextDouble();
      
        // System.out.println("Enter second number- ");
        // double input_second = num.nextDouble();
  
        // System.out.println("Enter third number- ");
        // double input_third = num.nextDouble();


        // if (input_first == input_second && input_first == input_third && input_third == input_second) {
        //     System.out.println("All numbers are equal");
        // } else if(input_first != input_second && input_first != input_third && input_third != input_second) {
        //     System.out.println("All numbers are different");
        // }else{
        //     System.out.println("Neither all are equal or different");
        // }
        // num.close();


        // TASK 13
        
        // for (int i = 24; i >=-6  ; i-=6) {
        //     System.out.println(i);
        // }

        // TASK 14

        // for (int i = -10; i <=20  ; i+=5) {
        //     System.out.println(i);
        // }


        // TASK 15
             
        // int sum = 0;     
        // for (int i = 1; i <=200  ; i+=1) {
        //     sum = (sum + i);
        //     if (i==200) {
        //         System.out.println("Sum= "+ (sum));
        //         System.out.println("average = "+ (sum/200));
        //     }      
        // }
    }
}
