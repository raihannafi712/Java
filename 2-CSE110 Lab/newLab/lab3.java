package newLab;

import java.util.Scanner;

public class lab3 {
    
    public static void main(String[] args) {
        
        // // TASK 1
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter n: ");
        // int n = sc.nextInt();

        // for (int i = 0; i <= n; i++) {
            
        //     if (i % 5 == 0 && i % 3 != 0) {
        //         System.out.println(i);
        //     }
        // }

        // sc.close();


        // // TASK 2

        // int sum = 0;
        // for (int i = 1; i <= 600; i++) {
            
        //     if (i % 7 == 0 && i % 9 != 0) {
        //         sum += i;
        //     } else if (i % 9 == 0 && i % 7 != 0 ) {
        //         sum += i;
        //     }
        // }
        // System.out.println(sum);



        // TASK 3

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter an integer: ");
        // int n = sc.nextInt();
        // int negSum = 0;
        // int posSum= 0;

        // if (n < 0) {
        //     System.out.println("Enter valid integer");
        // } else {
        //     for (int i = 1; i <= n; i++) {
                
        //         System.out.println("Enter number " + i);
        //         int num = sc.nextInt();

        //         if (num > 0) {
        //             posSum += 1;
        //         } else {
        //             negSum += 1;
        //         }
        //     }

        //     System.out.println(posSum + " Non-negative Numbers");
        //     System.out.println(negSum + " Negative Numbers");
        // }



        // TASK 4

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Input number of terms: ");
        // int n = sc.nextInt();

        // int sum = 0;
        // int count = 0;
        // int num = 1;

        // System.out.println("The odd numbers are: ");
        
        // while (count < n) {
        //     System.out.println(num);
        //     sum += num;
        //     num += 2;
        //     count++;
        // }

        // System.out.println("The Sum of odd Natural Numbers up to 5 terms is: " + sum);



        // TASK 5

        // Scanner sc = new Scanner(System.in);

        // int sum = 0;

        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Enter Number: ");
        //     int n = sc.nextInt();
        //     sum += n;

        //     System.out.println("Sum = " + sum);
        // }

        // sc.close();




        //TASK 6

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter:");
        // int n = sc.nextInt();

        // System.out.println("Divisors of " + n);
        // for (int i = 1; i <= n ; i++) {
        //     if (n % i == 0) {
        //         System.out.println(i);
        //     }
        // }
        // sc.close();



        // TASK 7

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter:");
        // int n = sc.nextInt();

        // int current_num;
        // int count = 0;
        // int temp = n;

        // while (temp > 0) {
        //     temp = temp / 10;
        //     count ++;
        // }

        // while (n > 0) {
        //     if (count == 1) {
        //         current_num = n % 10;
        //         n = n/10;
        //         System.out.print(current_num);
        //         count--;
        //     }else{
        //         current_num = n % 10;
        //         n = n/10;
        //         System.out.print(current_num + ",");
        //         count--;
        //     }
        // }
        // sc.close();



        // TASK 8

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter:");
        // int n = sc.nextInt();

        // int current_num;
        // int count = 0;
        // int pow = 1;
        // int temp = n;

        // while (temp > 0) {
        //     temp = temp / 10;
        //     count ++;
        // }

        // for (int i = 1; i < count ; i++) {
        //     pow *= 10;
        // }

        // while (n > 0) {
        //     if (pow == 1) {
        //         current_num = n / pow;
        //         n = n % pow;
        //         System.out.print(current_num);
        //         pow /= 10;
        //     }else{
        //         current_num = n / pow;
        //         n = n % pow;
        //         System.out.print(current_num + ",");

        //         pow /= 10;
        //     }
        // }



        // TASK 9

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter:");
        // int x = sc.nextInt();
        // int sum = 0;
        // int count = 0;

        // for(int i = 1; i <= x; i++){
        //     if(x%i==0){
        //         count++;
        //     }
        // }

        // if(count==2){
        // System.out.println(x+" is a prime number");
        // }
        // else{
        // System.out.println(x+" is not a prime number");
        // }

        // for(int j = 1; j <= x; j++){
        // if(x%j==0){
        //     sum = sum + j;
        // }
        // }
        // if(sum==x){
        // System.out.println(x+" is a perfect number");
        // }
        // else{
        // System.out.println(x+" is not a perfect number");
        // }

        // sc.close();
    }




        

	}

}
