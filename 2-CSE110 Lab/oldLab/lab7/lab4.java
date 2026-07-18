package oldLab.lab7;
// import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        
        // // TASK 1

        // Scanner sc = new Scanner(System.in);
        // System.out.println("How many numbers you want to input?");
        // int inputTotal = sc.nextInt();

        // int sum = 0;
        // int evenPositive = 0;
        // int maxNum = Integer.MIN_VALUE;
        // int minNum = Integer.MAX_VALUE;
        
        
        // for (int i = 1; i <= inputTotal; i++) {
        //     System.out.println("Enter number " + i);
        //     int numSerial = sc.nextInt();

        //     if (numSerial > 0 && numSerial % 2 == 0) {
                
        //         if (numSerial > maxNum) {
        //             maxNum = numSerial;
        //         }
        //         if (numSerial < minNum) {
        //             minNum = numSerial;
        //         }
        //         sum += numSerial;
        //         evenPositive++;
        //     }
        // }
        // System.out.println("Max: " + maxNum);
        // System.out.println("Min: " + minNum);
        // System.out.println("Average: " + (sum / evenPositive));
        
        // sc.close();



        // TASK 2

        // Scanner sc = new Scanner(System.in);

        // while (true) {
        //     System.out.println("Enter Number: ");
        //     int numInput = sc.nextInt();

        //     if (numInput < 0) {
        //         break;
        //     }
        //     System.out.println(numInput + " " + "^ " + 2 + " = " + (numInput*numInput) );
        // }
        // sc.close();



        //TASK 3 

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter an integer: ");
        // int inputTotal = sc.nextInt();

        // int sumPositive = 0;
        // int sumNegative = 0;

        // for (int i = 1; i <= inputTotal; i++) {
            
        //     System.out.println("Enter number: " + i);
        //     int numSerial = sc.nextInt();
        //     if (numSerial > 0) {
        //         sumPositive += 1;
        //     } else {
        //         sumNegative += 1;
        //     }
        // }
        // System.out.println(sumPositive + " Non-Negative numbers");
        // System.out.println(sumNegative + " Non-Negative numbers");

        // sc.close();


        // TASK 4                      

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter N: ");
        // int N = sc.nextInt();

        // for (int i = 2; i <= N; i++) {

        //     if (i % i == 0) {
        //         System.out.println("Output: " + i);
        //     } 
        // }
        // sc.close();



        // TASK 5
        
        // Scanner sc = new Scanner(System.in);
        // System.out.println("The value of N: ");
        // int N = sc.nextInt();

        // int y = 0;
        // int formulaY = 0;

        // if (N > 0) {
            
        //     for (int i = 1; i <= N; i++) {
                
        //         formulaY += i;
        //         y -= formulaY;
        //     }
        // }else {
        //     System.out.println("Enter N>0");
        // }

        // System.out.println("The value of y: " + y);
        // sc.close();



        //  TASK 6

        // Scanner sc = new Scanner(System.in);

        // int sum = 0;
        // while (true) {
        //     System.out.println("Enter Number: ");
        //     int numInput = sc.nextInt();

        //     if (numInput > 0) {
        //         for (int i = 1; i <= numInput; i++) {
        //             if (numInput % i == 0) {
        //                 sum++;
        //             }
        //         }
        //     }else{
        //         break;
        //     }
        //     System.out.println(numInput + " has " + sum + " divisors");
        // }
        // sc.close();



        //  TASK 7                       

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of cases: ");
        // int N = sc.nextInt();


        // for (int i = 0; i < N; i++) {
        //     System.out.println("Enter X: ");
        //     int X = sc.nextInt();

        //     System.out.println("Enter Y: ");
        //     int Y = sc.nextInt();

        //     int sum = 0;
        //     int count_test_num = 0;
        //     int count_present_num = X;


        //     while (count_test_num < Y) {
        //         if (count_present_num % 2 != 0) {
        //             sum += count_present_num;
        //             count_test_num++;
        //         }
        //         count_present_num++;
        //     }
        //     System.out.println("ans: " + sum);
        // }
        // sc.close();




        //  TASK 8

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter length: ");
        // int sampleLength = sc.nextInt();

        // System.out.println("Enter width: ");
        // int sampleWidth = sc.nextInt();

        // for (int i = 0; i < sampleWidth; i++) {
        //     for (int j = 1; j <= sampleLength; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();



        // TASK 9

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter triangle height: ");
        // int triangleHeight = sc.nextInt();

        // for (int i = 1; i <= triangleHeight; i++) {
            
        //     for (int j = 1; j <= triangleHeight; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int q = 1; q <= i; q++) {
        //         System.out.print( " " + q);
        //     }
        //     System.out.println();
        // }
        // sc.close();


        // TASK 10          /* Couldn't figure out */



        // TASK 11

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Start: ");
        // int startLimit = sc.nextInt();

        // System.out.println("End: ");
        // int endLimit = sc.nextInt();

        // System.out.println("Armstrong numbers: ");

        // for (int i = startLimit; i <= endLimit; i++) {
            
        //     int main_Number_Arm = i;
        //     int sum = 0;
        //     int number_arm_digits = String.valueOf(i).length();

        //     int temp = i;

        //     while (temp > 0 ) {
        //         int number_arm_digit_one = temp % 10;
        //         sum += Math.pow(number_arm_digit_one , number_arm_digits);
        //         temp /= 10;
        //     }

        //     if (sum == main_Number_Arm) {
        //         System.out.println(i);
        //     }
        // }
        // sc.close();


    }
}
