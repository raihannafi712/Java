package oldLab.lab7;

public class lab7_5 {
    
     // Task A: showDots method
     public static void showDots(int num) {

        for (int i = 0; i < num; i++) {

            System.out.print(".");
        }
        System.out.println(); 
    }






    // Task B: show_palindrome method
    public static void show_palindrome(int num) {

        for (int i = 1; i <= num; i++) {

            System.out.print(i);
        }

        for (int i = num - 1; i >= 1; i--) {

            System.out.print(i);
        }
        System.out.println(); 
    }






      // Task C: showDiamond method

      public static void showDiamond(int num) {
   
        for (int i = 1; i <= num; i++) {

            showDots(num - i);        
            show_palindrome(i);      
            showDots(num - i);         
            System.out.println();      
        }

        for (int i = num - 1; i >= 1; i--) {
            showDots(num - i);         
            show_palindrome(i);        
            showDots(num - i);        
            System.out.println();      
        }
    }

    public static void main(String[] args) {

        showDots(5); 
        showDots(3); 





        show_palindrome(5); 
        show_palindrome(3);





        System.out.println("showDiamond(5):");
        showDiamond(5);
        System.out.println("showDiamond(3):");
        showDiamond(3);
    }
}
