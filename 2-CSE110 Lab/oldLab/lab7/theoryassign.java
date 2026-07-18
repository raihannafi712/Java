package oldLab.lab7;
public class theoryassign {
    public static void main(String[] args) {
        
        // Right half pyramid

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        // Left half pyramid

        // for (int i = 1; i <= 5; i++) {

        //     for (int gapC = 1; gapC <= (5 - i); gapC++) {
        //         System.out.print("  ");
        //     }

        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }



        // Full pyramid

        // for (int i = 1; i <= 5; i++) {
            
        //     for (int gapC = 1; gapC <= (5 - i); gapC++) {
        //         System.out.print(" ");
        //     }

        //     int n = 1;
        //     for (int j = 1; j <= (2 * i - n); j++) {
        //         System.out.print("* ");
        //         n++;
        //     }

        //     System.out.println();
        // }




        // Inverted right half pyramid

        // for (int i = 5; i >= 1; i--) {
            
        //     for (int j = 1; j <= i; j++) {

        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }



        // Inverted left half pyramid

        // for (int i = 5; i >= 1; i--) {
            
        //     for (int j = 1; j <= (5 - i); j++) {

        //         System.out.print("  ");
        //     }

        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }



        // Inverted full pyramid

        // for (int i = 5; i >= 1; i--) {
            
        //     for (int j = 1; j <= (5 - i); j++) {

        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= i; k++) {
        //         System.out.print("* ");
        //     }

        //     System.out.println();
        // }


        // Rhombus pattern                    

        // for (int i = 1; i <= 5; i++) {

        //     // int addSpace = 0;
            
        //     for (int j = 1; j <= 5 - i; j++) {

        //         System.out.print(" ");
        //         // addSpace++;
        //     }

        //     for (int k = 1; k <= 5; k++) {
        //         System.out.print("*");
        //     }

        //     System.out.println();
        // }




        // Diamond Pattern

        // int size = 9,odd = 1, noSize = size/2; 
        // for (int i = 1; i <= size; i++) { 
        //     for (int k = noSize; k >= 1; k--) {
                                                
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= odd; j++) { 

        //         System.out.print("*");
        //     }
        //     System.out.println();
        //     if (i < size/2+1) {
        //         odd += 2; 
        //         noSize -= 1; 
        //     } else {
        //         odd -= 2;
        //         noSize += 1;
        //     }
        // }



        // Hourglass pattern           

        // int m = 5; 
        // int s = 0; 
        // int i, j;
      
        // for (i = 1; i <= 6; i++)
        // {
        //   for (j = 1; j <= s; j++){

        //       System.out.print("  ");
        //   }

        //   for (j = 0; j <= m; j++){

        //       System.out.print("   *");
        //   }
        //   s++;
        //   m -= 1;
        //   System.out.println();
        // }
        // m = 2;
        // s = 4;
 
        // for (i = 1; i <= 4; i++)
        // {
        //   for (j = 1; j <= s; j++){

        //       System.out.print("  ");
        //   }

        //   for (j = 1; j <= m; j++){

        //       System.out.print("  *  ");
        //   }
        //   s--;
        //   m += 1;
        //   System.out.println();
        // }



        // Hollow square pattern

        // int size_of_square = 5;

        // for (int i = 1; i <= size_of_square; i++) {

        //     for (int j = 1; j <= size_of_square; j++) {


        //         if (i == 1 || i == size_of_square || j == 1 || j == size_of_square) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }

        //     System.out.println();
        // }




        // Hollow full pyramid

        // int row_num = 4; 

        // for (int i = 1; i <= row_num; i++) {

        //     for (int j = 1; j <= row_num - i; j++) {

        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= (2 * i - 1); k++) {

        //         if (k == 1 || k == (2 * i - 1) || i == row_num) {

        //             System.out.print("*");
        //         } else {

        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }




        // Hollow inverted full pyramid

   
            // int row_num = 4;
        
            // for (int i = 0; i < row_num; i++) {
    
            //     for (int j = 0; j < 2 * i + 1; j++){

            //         System.out.print(" ");
            //     }

            //     for (int k = 0; k < (2 * (row_num - i) - 1); k++) {

            //         if (k == 0 || k == 2 * (row_num - i) - 2 || i == 0){

            //             System.out.print("* ");

            //         }else{

            //             System.out.print("  ");
            //         }
            //     }
            //     System.out.println();
            // }



            
            // Hollow diamond pyramid

            // int n = 4;

            // for (int i = 0; i < (2 * n - 1); i++) {
        
            //     int temp;
            //     if (i < n) {

            //         temp = 2 * (n - i) - 1;

            //     }else {

            //         temp = 2 * (i - n + 1) + 1;
            //     }

            //     for (int j = 0; j < temp; j++){

            //         System.out.print(" ");
            //     }
        
            //     for (int k = 0; k < 2 * n - temp; k++) {

            //         if (k == 0 || k == 2 * n - temp - 1){

            //             System.out.print("* ");
            //         }
            //         else{

            //             System.out.print("  ");
            //         }
            //     }
            //     System.out.println();
            // }



            // Floyd's triangle

            // int n = 4;
            // int j = 1;

            // for (int i = 1; i <= (n * (n + 1)) / 2; i++) {

            //     System.out.print(i + " ");

            //     if (i == (j * (j + 1)) / 2) {
            //         System.out.println();
            //         j++;
            //     }
            // }



            // Pascal's triangle

            // int n = 4;

            // for (int line = 1; line <= n; line++) {
                
            //     for (int space = 1; space <= n - line; space++){

            //         System.out.print(" ");
            //     }

            //     int var_coef = 1;
            //     for (int i = 1; i <= line; i++) {

            //         System.out.print( var_coef + " ");

            //         var_coef = (var_coef * (line - i) / i);
            //     }
            //     System.out.println();
            // }
    }
}
