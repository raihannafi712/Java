import java.util.Arrays;

public class midSolve {
    public static void main(String[] args) {
        int[][] arr1 = {{2,8,9,6,7},{4,2,5,8,5},{6,7,1,4,3}, {9,6,7,2,9},{7,9,3,5,6},{8,1,6,9,2},{5,4,2,7,1},{3,3,8,1,4},{1,5,4,3,8} };

        int[] arr2 = {1,2,3,4,5};

        System.out.println(Arrays.deepToString(unlockSafe(arr1, arr2)));

    }





    public static int[][] unlockSafe(int [] [] mat,int[] com){

        int row_size = mat.length;
        int col_size = mat[0].length;

        for (int i = 0; i < col_size; i++) {
            
           while (mat[4][i] != com[i])  {
            int top = mat[0][i];

            for (int j = 0; j < row_size - 1; j++) {
                mat[j][i] = mat[j + 1][i];
            }
            mat[row_size - 1][i] = top;
           }
        }

        return mat;

    }
}
