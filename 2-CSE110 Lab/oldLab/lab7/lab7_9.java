package oldLab.lab7;

public class lab7_9 {

    // TASK 9
    
    public static void main(String[] args) {

        int n1 = 12345;
        int n2 = 649;


        System.out.println(sumDigits(n1)); 
        System.out.println(sumDigits(n2)); 

    }

    public static int sumDigits(int n) {

    
        if (n == 0) {

            return 0;
        }
        
        return (n % 10) + sumDigits(n / 10);
    }
}
