package oldLab.lab7;

public class lab7_8 {

 // TASK 8
    
 // Recursive function to print digits of n in reverse order

 public static void reverseDigits(int n) {

    if (n == 0) {

        return;
    }
  
    System.out.println(n % 10);
    reverseDigits(n / 10);
}

public static void main(String[] args) {

    System.out.println("Reversing digits of 12345:");
    reverseDigits(12345);



    System.out.println("\nReversing digits of 649:");
    reverseDigits(649);



    System.out.println("\nReversing digits of 1000:");
    reverseDigits(1000);
}
}
