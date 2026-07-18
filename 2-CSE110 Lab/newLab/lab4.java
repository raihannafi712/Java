package newLab;

import java.util.Scanner;

public class lab4 {
    public static void main(String[] args) {
        

        // TASK 1

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter N: ");
        // int N = sc.nextInt();

        // for (int i = 0; i < N; i++) {

        //     System.out.println("Enter X: ");
        //     int X = sc.nextInt();

        //     System.out.println("Enter Y: ");
        //     int Y = sc.nextInt();

        //     int sum = 0;
        //     int count = 0;
        //     int count_present_num = X;

        //     while (count < Y) {
        //         if (count_present_num % 2 != 0) {
        //             sum += count_present_num;
        //             count++;
        //         }
        //         count_present_num++;
        //     }

        //     System.out.println("Sum: " + sum);
        // }
        // sc.close();


        // TASK 2

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter W: ");
        // int width = sc.nextInt();

        // System.out.println("Enter L: ");
        // int length = sc.nextInt();

        // for (int i = 0; i < length; i++) {
        //     for (int j = 1; j <= width; j++) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();



        // TASK 3

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter start: ");
        // int start = sc.nextInt();

        // System.out.println("Enter End: ");
        // int end = sc.nextInt();

        // for (int i = start; i <= end; i++) {
        //     int count = 0;
        //     for(int j = 1; j <= i; j++){
        //         if(i % j == 0){
        //             count++;
        //         }
        //     }
        //     if(count==2){
        //         System.out.println(i);
        //     }
        // }

        // sc.close();






        // TASK 4

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Number of customers: ");
        // int N = sc.nextInt();

        // for (int i = 1; i <= N; i++) {
            
        //     System.out.println("Item Number for Customer-" + i + ": ");
        //     int item = sc.nextInt();

        //     double sum = 0;
            

        //     for (int j = 1; j <= item; j++) {
        //         System.out.println("Item-" + j);
        //         double price = sc.nextDouble();

        //         sum += price;
        //     }

        //     double avg = sum/item;
        //     System.out.println("Average for Customer-" + i + ": " + avg);
        // }
        // sc.close();


        // TASK 5

        // Scanner sc = new Scanner(System.in);

        // System.out.print("Start: ");
        // int firstNum = sc.nextInt();

        // System.out.print("End: ");
        // int lastNum = sc.nextInt();

        // System.out.println("Armstrong numbers:");

        // for (int number = firstNum; number <= lastNum; number++) {
        //     int original = number;
        //     int sum = 0;

        //     int digits = 0;
        //     int temp = number;
        //     while (temp != 0) {
        //         digits++;
        //         temp /= 10;
        //     }

        //     temp = number;
        //     while (temp != 0) {

        //         int digit = temp % 10;
        //         int power = 1;
        //         for (int i = 0; i < digits; i++) {

        //             power *= digit;
        //         }
        //         sum += power;
        //         temp /= 10;
        //     }

        //     if (sum == original) {
        //         System.out.println(original);
        //     }
        // }

        // sc.close();



    }
}
