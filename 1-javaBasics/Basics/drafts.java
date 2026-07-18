public class drafts {
    public static void main(String[] args) {

        // SUmmation of arrays
        int [][] arr1 = {{1,2,3} , {4,5,6} , {7,8,9}};
        int [][] arr2 = {{1,2,3} , {4,5,6} , {7,8,9}};
        int [][] arr3 = new int[3][3];

        // for (int i = 0; i < arr3.length; i++) {
            
        //     for (int j = 0; j < arr3 [0].length; j++) {
                
        //         arr3[i][j] = arr1[i][j] + arr2[i][j];
        //     }
        // }

        // for (int i = 0; i < arr3.length; i++) {
            
        //     System.out.println();
        //     for (int j = 0; j < arr3 [0].length; j++) {
                
        //         System.out.print(arr3[i][j] + " ");
        //     }
        // }



        // Multiplication of arrays

        for (int i = 0; i < arr3.length; i++) {
            
            for (int j = 0; j < arr3 [0].length; j++) {
                
                arr3[i][j] = arr1[i][j] * arr2[i][j];
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            
            System.out.println();
            for (int j = 0; j < arr3 [0].length; j++) {
                
                System.out.print(arr3[i][j] + " ");
            }
        }

    }
}
