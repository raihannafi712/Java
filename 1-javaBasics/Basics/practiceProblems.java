import java.util.Scanner;

public class practiceProblems {
    public static void main(String[] args) {
        
        //                    /* Odd or even number with positive and negative */
    
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter Number: ");
            // int input_num = sc.nextInt();
    
    
            // if (input_num > 0) {
            //     if (input_num %2==0) {
            //         System.out.println("Even number and it is positive");
            //     } else {
            //         System.out.println("Odd number and it is positive");
            //     }
            // } else if (input_num == 0) {
            //     System.out.println("0 is an even number");
            // }else if (input_num %2==0) {
            //     System.out.println("Even number and it is negative");
            // }else{
            //     System.out.println("Odd number and it is negative");
            // }
            
            // sc.close();
    
            //                              /*  Leap year */
    
            // Scanner year = new Scanner(System.in);
            // System.out.println("Enter the year= ");
            // int input_year = year.nextInt();
    
            // if (input_year%4 == 0 && input_year%100 != 0 || input_year%400 == 0) {
            //     System.out.println("It is a leap year");
            // } else {
            //     System.out.println("It is not a leap year");
            // }
    
            // year.close();
    
    
            //                              /* Identifying the largest number among three*/
    
            // Scanner num = new Scanner(System.in);
            // System.out.println("Enter first number- ");
            // int input_first = num.nextInt();
            // /* second input */
            // System.out.println("Enter second number- ");
            // int input_second = num.nextInt();
            // /* third input */
            // System.out.println("Enter third number- ");
            // int input_third = num.nextInt();
    
            // if (input_first == input_second || input_first == input_third || input_second == input_third) {
            //     System.out.println("Please enter 3 unequal numbers");
            // } else if (input_first > input_second && input_first > input_third) {
            //     System.out.println("First number is the greatest");
            // } else if (input_second > input_first && input_second > input_third) {
            //     System.out.println("Second number is the largest");
            // }else {
            //     System.out.println("Third number is the largest");
            // }
                
            // num.close();
    
    
    
            //                                        /* Tax problem */
    
            // Scanner sala = new Scanner(System.in);
            // System.out.println("Enter salary- ");
            // int salary = sala.nextInt();
    
            // if (salary >= 20000) {
            //     if (salary >= 30000) {
            //         System.out.println("Your tax is- " + (salary*10/100) );
            //     } else if (salary >= 20000 && salary < 30000) {
            //         System.out.println("Your tax is- " + (salary*5/100) );
            //     }
            // } else {
            //     System.out.println("No taxes needed");
            // }
    
            // sala.close();
    
            //                                  /* How many days in a month */
    
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the month= ");
            // String month = sc.next();
    
            // switch (month) {
            //     case "January":
            //         System.out.println(31);
            //         break;
    
            //         case "February":
            //         System.out.println(28);
            //         break;
    
            //         case "March":
            //         System.out.println(31);
            //         break;
    
            //         case "April":
            //         System.out.println(30);
            //         break;
    
            //         case "May":
            //         System.out.println(31);
            //         break;
    
            //         case "June":
            //         System.out.println(30);
            //         break;
    
            //         case "July":
            //         System.out.println(31);
            //         break;
    
            //         case "August":
            //         System.out.println(31);
            //         break;
    
            //         case "September":
            //         System.out.println(30);
            //         break;
    
            //         case "October":
            //         System.out.println(31);
            //         break;
    
            //         case "November":
            //         System.out.println(30);
            //         break;
    
            //         case "December":
            //         System.out.println(31);
            //         break;
    
            
            //     default:
            //     System.out.println("Enter valid month");
            //         break;
            // }
            // sc.close();
    
            

            //                                  /* Reverse all the digits */
    
            // Scanner hehe = new Scanner(System.in);
            // System.out.println("Enter the number= ");
            // int input_num = hehe.nextInt();
            // int reverse = 0;
    
            // while (input_num != 0) {
    
            //     int lastDigit = input_num%10;
            //     reverse = (reverse * 10) + lastDigit;
    
            //     input_num /=10;
            // }
            // System.out.println("reversed number= "+ reverse);
            // hehe.close();
    

            // Nested loop
            //                           /* Row and column (matrix) with loop */


            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter row and column num: ");
            // int input_num = sc.nextInt();


            // for (int i = 1; i <= input_num; i++) {              /* This is for the rows */
                
            //     for (int j = 1; j <= input_num; j++) {          /* This is for the columns */
            //         System.out.print(j);
            //     }
            //     System.out.println();                           /* This is for the line break */
            // }
            // sc.close();


            //                                       /*Right half pyramid  */
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the rows: ");
            // int input_num = sc.nextInt();

            // for (int i = 1; i <= input_num ; i++) {

            //     for (int j = 1; j <= i ; j++) {

            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            // sc.close();


            //                                       /*Left half pyramid  */
            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the rows: ");
            // int input_num = sc.nextInt();

            // for (int i = 1; i <= input_num; i++) {

            //     for (int j = i; j <= (input_num - 1); j++) {      /* spaces are 1 less than input_num from the top */
            //         System.out.print("  ");                     /*There are two spaces because one is for the space and one is for the star  */
            //     }
            //     for (int k = 1; k <= i; k++) {
            //         System.out.print("* ");
            //     }
            //     System.out.println();
            // }
            // sc.close();


            //                                      /* Full pyramid */

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the rows: ");
            // int input_num = sc.nextInt();

            // for (int i = 1; i <= input_num; i++) {
            
            //     for (int k = 1; k <= (5 - i); k++) {
            //         System.out.print(" ");
            //     }
    
            //     int n = 1;
            //     for (int j = 1; j <= (2 * i - n); j++) {
            //         System.out.print("* ");
            //         n++;
            //     }
    
            //     System.out.println();
            //     sc.close();
            // }







            // Spring final solve

            // String [] planets = {"Mercury" , "Venus" , "Earth" , "Mars" , "Jupiter"};
            // double[] x_coordinates = {0.39 , 0.72 , 1.00 ,1.52 , -5.20 };
            // double[] y_coordinates = {0.24 , 0.00 , 0.00 ,0.99 ,  2.86 };
            // double[] z_coordinates = {-0.10 , 0.44 , -0.02 ,0.21 , 0.42};

            // Scanner sc = new Scanner(System.in);
            // System.out.println("Enter planet: "+ (32 % 8) );
            // String planet = sc.nextLine();

            // int x = 22;

            // x--;

            // System.out.println(4*x);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number: " );
            int n = sc.nextInt();

            int sum = 0;
            int first_num = 0;
            int last_num = 0;
            int count = 0;
            int temp = n;

            while (temp > 0) {
                temp = temp / 10;
                count ++;
            }

            while (n > 0) {
                // First num (10^n-1)
                first_num= n/(int)Math.pow(10,( count-1));
                n = n % (int)Math.pow(10, count-1);
                // Last num
                last_num = n % 10;
                n = n/10;

                sum = first_num + last_num;
                System.out.print(sum + " ");
                
                sum = 0;
                count = count - 2;
            }








            







    } 
}
