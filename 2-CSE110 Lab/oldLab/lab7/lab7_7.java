package oldLab.lab7;

import java.util.Scanner;

public class lab7_7 {
    
    // TASK 7

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter N for Task A: ");
        int N = sc.nextInt();
        System.out.print("Task A Output: ");
        oneToN(1, N);
        System.out.println();







        System.out.print("Enter N for Task B: ");
        N = sc.nextInt();
        System.out.print("Task B Output: ");
        nToOne(N);
        System.out.println();






        System.out.print("Enter N for Task C: ");
        N = sc.nextInt();
        System.out.print("Task C Output: ");
        System.out.println(recursiveSum(1, N));

        sc.close();
    }






    // Task A
    public static void oneToN(int current, int N) {

        if (current > N) {

            return; 
            
        }
        System.out.print(current + " "); 
        oneToN(current + 1, N); 
        
    }






    // Task B
    
    public static void nToOne(int N) {

        if (N < 1) {
            return; 
            
        }
        System.out.print(N + " "); 
        nToOne(N - 1); 
    }






    // Task C
    
    public static int recursiveSum(int current, int N) {

        if (current > N) {

            return 0; 
        }
        return current + recursiveSum(current + 1, N);
    }
}   
