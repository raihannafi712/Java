package oldLab.lab7;

import java.util.Scanner;

public class lab7_6 {
    
       // Task A: calcTax method

    public static double calcTax(int age, double salary) {
        if (age < 18) {
            return 0.0; 
        }
        if (salary < 10000) {
            return 0.0; 
        }
        if (salary <= 20000) {
            return salary * 0.07; 
        }
        return salary * 0.14; 
    }






    // Task B: calcYearlyTax method

    public static void calcYearlyTax() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        double totalYearlyTax = 0.0;

        for (int month = 1; month <= 12; month++) {

            System.out.print("Enter income for month " + month + ": ");
            double monthlyIncome = sc.nextDouble();

            double monthlyTax = calcTax(age, monthlyIncome);
            totalYearlyTax += monthlyTax;

            System.out.println("Month " + month + " tax: " + monthlyTax);
        }

        System.out.println("Total Yearly Tax: " + totalYearlyTax);

        sc.close(); 
    }






    // Task C: Recursive method to calculate sum from 1 to N

    public static int recursiveSum(int current, int N) {

        if (current > N) {
            return 0;
        }
        return current + recursiveSum(current + 1, N);
    }



    public static void main(String[] args) {

        // Test calcTax method
        double t1 = calcTax(16, 20000);
        System.out.println("Tax for age 16 and salary 20000: " + t1);

        double t2 = calcTax(20, 18000);
        System.out.println("Tax for age 20 and salary 18000: " + t2);








        // Test calcYearlyTax method
        System.out.println("\nCalculating Yearly Tax:");
        calcYearlyTax();





        // 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();
        int result = recursiveSum(1, N);

        System.out.println("Sum from 1 to " + N + ": " + result);

        sc.close();
    }
}
