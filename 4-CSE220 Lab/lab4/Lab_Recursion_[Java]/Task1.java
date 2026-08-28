import java.util.Scanner;

public class Task1 {

    // Task 1A: Print numbers from 1 to 10 using a loop
    public static void task1A() {
        int n = 1;
        while (n < 11) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();
    }

    // Task 1B: Print numbers from 1 to 10 using recursion
    public static void task1B_recursive(int i) {

        if (i >= 1) {
            task1B_recursive(i - 1);
        } else {
            return;
        }
        System.out.print(i + " ");
        
        
    }

    // Task 1C: Print numbers from 1 to n using a loop
    public static void task1C(int n) {
                
        int f = 1;
        while (f <= n) {
            System.out.print(f + " ");
            f++;
        }
        System.out.println();
    }
    

    // Task 1D: Print numbers from 1 to n using recursion
    public static void task1D_recursive(int i, int n) {
        
        if (n >= i) {
            task1D_recursive(i, n - 1);
        }else{
            return;
        }

        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Driver code for testing Task 1 methods
        // Write on your own
        task1A();
        task1B_recursive(10);
        task1C(100);
        task1D_recursive(1, 100);

        sc.close();
    }
}
