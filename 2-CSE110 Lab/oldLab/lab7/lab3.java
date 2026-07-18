package oldLab.lab7;
import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        
        // Task 1
            
        // for (int i = 18; i <= 63; i+=9) {
            

        //     if (i != 63) {
        //         System.out.print(i + " " + ",");
                
        //     }else{
        //         System.out.print(i + " ");
        //     }
        // }



        //  TASK 2

        // for (int i = 18; i <= 63; i+=9) {
            
        //     if (i % 2 ==0 ) {
        //         System.out.print(i + " " + ",");
        //     } else if (i == 63) {
        //         System.out.print("-"+ i + " ");
        //     }else{
        //         System.out.print("-"+ i + ", ");
        //     }
        // }




        // TASK 3
        // int sum = 0;
        // for (int i = 63; i <= 600; i+=63) {
        //     sum +=i;
        // }
        // System.out.println("Sum =" + sum);


        // TASK 4

        // int sum = 0;
        // for (int i = 0; i <= 600; i++) {
        //     if (i % 7 == 0 || i % 9==0 ) {
        //         sum += i;
        //     } 
        // }
        // System.out.println("Sum = "+ sum);



        // TASK 5

        // int sumOfOne = 0;

        // for (int i = 0; i <= 600; i++) {
        //     if ((i % 7 == 0 || i % 9==0) && !(i % 7 ==0 && i % 9 == 0) ) {
        //         sumOfOne += i;
        //     }
        // }
        // System.out.println("Sum =" + sumOfOne);


        // TASK 6

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number= ");
        // int inputOne = sc.nextInt();

        // int sum = 0;
        // for (int i = 1; i <= (inputOne); i+= 1) {
        //     int multiple = (i*i);
        //     if (i % 2 == 0) {
        //         sum -= multiple;
        //     } else {
        //         sum += multiple;
        //     }
        // }
        // System.out.println("sum= " + sum);
        // sc.close();


        // TASK 7          
        


        //  TASK 8

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number ");
        // int inputOne = sc.nextInt();
        // int sum = 0;
        // int digitDiff =1;

        // System.out.println("The odd numbers are- ");
        // for (int i = 1; i <= inputOne; i++) {
        //     System.out.println(digitDiff);
        //     sum += digitDiff;
        //     digitDiff += 2;
        // }
        // System.out.println("sum= "+ sum);
        // sc.close();


        // TASK 9


        // int sum = 0;
        // for (int i = 1; i <= 10; i++) {
        //     sum += i;
        //     System.out.print("Current number: "+ i + ", ");
        //     System.err.println("sum: "+ sum);
        // }


        // TASK 10

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number= ");
        // int inputOne = sc.nextInt();

        // for (int i = 0; i <= inputOne; i++) {
        //     if (i % 5 == 0 && i % 3!= 0) {
        //         System.out.println(i);
        //     }
        // }
        // sc.close();


        // TASK 11

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number= ");
        // int inputOne = sc.nextInt();

        // int digitNumber = 0; 

        // for (int i = inputOne; i != 0; i /= 10) {
        //     digitNumber++;
        // }
        // System.out.println("Total digits= " + digitNumber);

        // sc.close();


        // TASK 12

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number= ");
        // int inputOne = sc.nextInt();

        // for (int i = inputOne; i > 0; i /= 10) {
           
        //     if (i >= 10) {
        //         int showNumber = (inputOne%10);
        //         inputOne = (inputOne/10);
        //         System.out.print(showNumber + ","+ " ");
                
        //     }else{  
        //         int showNumber = (inputOne%10);
        //         System.out.print(showNumber + " ");
        //     }

        // }
        // sc.close();

        // TASK 13

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number= ");
        // int inputOne = sc.nextInt();

        // int divisor = 10000;

        // for (int i = inputOne; i > 0; i ++) {
        //     int showNumber = (inputOne/divisor);
        //     inputOne = (inputOne%divisor);
        //     divisor = divisor/10;

        //     System.out.print(showNumber + ","+ " ");
        // }
        // sc.close();


        // TASK 14

        // TASk 15

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number= ");
        int inputOne = sc.nextInt();
        int sumPerfect = 0;


        if (inputOne < 0) {
            System.out.println("Enter a positive number");
        } else {
            for (int i = 1; i <= inputOne/2 ; i++) {
                if (inputOne % 1 ==0) {
                    sumPerfect += i;
                }
            }
        }

        if (sumPerfect == inputOne) {
            System.out.println(inputOne + "  is a perfect number");
        } else {
            System.out.println(inputOne + "  is not a perfect number");
        }
        sc.close();


    }
}
