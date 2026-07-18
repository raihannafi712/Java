package oldLab.lab7;

import java.util.Scanner;

public class lab7_4 {
    
        // Task A: isPrime method
    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }






    // Task B: isPerfect method

    public static boolean isPerfect(int n) {
        if (n <= 0) {

            return false; 
        }
        int sum = 0;

        for (int i = 1; i < n; i++) {

            if (n % i == 0) {
                sum += i;
                
            }
        }
        return sum == n; 
    }







    // Task C: special_sum method
    public static int special_sum(int max) {

        int sum = 0;

        for (int i = 1; i <= max; i++) {

            if (isPrime(i) || isPerfect(i)) {
                sum += i; 
            }
        }
        return sum; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Test Task A: isPrime

        boolean check = isPrime(7);
        System.out.println(check); 

        check = isPrime(15);
        System.out.println(check);







        // Test Task B: isPerfect

        check = isPerfect(6);
        System.out.println(check); 
        
        check = isPerfect(33);
        System.out.println(check); 
        






        // Test Task C: special_sum
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int result = special_sum(input);

        System.out.println(result); 

        sc.close();
        
    }
}
