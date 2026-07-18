import java.util.Scanner;

public class lab1 {
    
    public static void main(String[] args) {

        // TASK 1
        
        // Scanner sc = new Scanner(System.in);


        // int input_num_sum = 0, input_num_min = -1, input_num_max = -1, count = 0;
        
        // System.out.println("Enter 10 numbers:");

        // for (int i = 0; i < 10; i++) {

        //     int input_num = sc.nextInt();

        //     if (input_num > 0 && input_num % 2 != 0) { 

        //         input_num_sum += input_num;

        //         if (input_num_min == -1 || input_num < input_num_min) {

        //             input_num_min = input_num;
        //         }
        //         if (input_num_max == -1 || input_num > input_num_max) {

        //             input_num_max = input_num;
        //         }
        //         count++;
        //     }
        // }       
        
        // if (count == 0) {

        //     System.out.println("No odd positive numbers found");
        // } else {

        //     double input_num_avg = (double) input_num_sum / count;
        //     System.out.println("Sum = " + input_num_sum);
        //     System.out.println("Minimum = " + input_num_min);
        //     System.out.println("Maximum = " + input_num_max);
        //     System.out.println("Average = " + input_num_avg);
        // }
        // sc.close();




        // TASK 2

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter two integers:");

        // int input_num_1 = sc.nextInt();
        // int input_num_2 = sc.nextInt();
        
        // int start, end;

        // if (input_num_1  < input_num_2) {

        //     start = input_num_1;
        //     end = input_num_2;
        // } else {

        //     start = input_num_2;
        //     end = input_num_1;
        // }
        // int input_prime_count = 0;
        
        // for (int i = start; i <= end; i++) {

        //     if (i < 2) {
        //         continue;
        //     }

        //     boolean isPrime = true;

        //     for (int j = 2; j * j <= i; j++) {

        //         if (i % j == 0) {

        //             isPrime = false;
        //             break;
        //         }
        //     }
        //     if (isPrime) {

        //         input_prime_count++;
        //     }
        // }
        
        // System.out.println("There are " + input_prime_count + " prime numbers between " + start + " and " + end + ".");
        // sc.close();



        // TASK 3

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter first word:");
        // String input_string_1 = sc.next();
        
        // System.out.println("Enter second word:");
        // String input_string_2 = sc.next();
        

        // String input_string_concate = input_string_1 + " " + input_string_2;

        // int sum = 0;
        
        // for (int i = 0; i < input_string_concate.length(); i++) {

        //     sum += input_string_concate.charAt(i);
        // }
        
        // System.out.println(input_string_concate);
        // System.out.println(sum);
        
        // sc.close();



        // TASK 4

        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter a string in small letters:");
        // String input_string = sc.next();
        
        // String string_result = "";
        
        // for (int i = 0; i < input_string.length(); i++) {

        //     char current_char_one = input_string.charAt(i);

        //     if (current_char_one == 'a') {

        //         string_result += 'z';
        //     } else {

        //         string_result += (char) (current_char_one - 1);
        //     }
        // }
        
        // System.out.println(string_result);
        
        // sc.close();



        // TASK 5

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the length of the array: ");
        // int array_length_input = sc.nextInt();

        // int[] arr_one = new int[array_length_input];
        
        // for (int i = 0; i < array_length_input; i++) {

        //     arr_one[i] = sc.nextInt();
        // }
        
        // for (int i = 0, j = array_length_input - 1; i < j; i++, j--) {

        //     int temp = arr_one[i];

        //     arr_one[i] = arr_one[j];
        //     arr_one[j] = temp;
        // }
        
        // for (int num : arr_one) {

        //     System.out.print(num + " ");
        // }
        
        // sc.close();



        // TASK 6

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the length of the array: ");
        // int input_length = sc.nextInt();

        // int[] arr_one = new int[input_length];
        
        // for (int i = 0; i < input_length; i++) {

        //     arr_one[i] = sc.nextInt();
        // }
        
        // boolean[] input_counted = new boolean[input_length];
        
        // for (int i = 0; i < input_length; i++) {

        //     if (input_counted[i]) {

        //         continue;
        //     }
        //     int count = 1;

        //     for (int j = i + 1; j < input_length; j++) {

        //         if (arr_one[i] == arr_one[j]) {

        //             count++;
        //             input_counted[j] = true;
        //         }
        //     }

        //     System.out.println(arr_one[i] + " - " + count + " times");
        // }
        
        // sc.close();




        // TASK 7

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the length of the array: ");
        // int input_length = sc.nextInt();
        
        // double[] arr_one = new double[input_length];
        
        // System.out.println("Please enter the elements of the array:");

        // for (int i = 0; i < input_length; i++) {

        //     arr_one[i] = sc.nextDouble();
        // }
        
        // int arr_new_size = 1;

        // for (int i = 1; i < input_length; i++) {

        //     if (arr_one[i] != arr_one[i - 1]) {

        //         arr_one[arr_new_size] = arr_one[i];
        //         arr_new_size++;
        //     }
        // }
        
        // System.out.print("New Array: ");

        // for (int i = 0; i < arr_new_size; i++) {

        //     System.out.print(arr_one[i] + " ");
        // }
        
        // int removed_elements = input_length - arr_new_size;
        // System.out.println("\nRemoved elements: " + removed_elements);
        
        // sc.close();



        // TASK 8

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the number of rows: ");
        // int input_rows = sc.nextInt();
        
        // System.out.print("Enter the number of columns: ");
        // int input_col = sc.nextInt();
        
        // int[][] array2D = new int[input_rows][input_col];
        
        // System.out.println("Enter the elements of the 2D array:");

        // for (int i = 0; i < input_rows; i++) {

        //     for (int j = 0; j < input_col; j++) {

        //         array2D[i][j] = sc.nextInt();
        //     }
        // }
        
        // System.out.println("\n2D Array:");

        // for (int i = 0; i < input_rows; i++) {

        //     for (int j = 0; j < input_col; j++) {

        //         System.out.print(array2D[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // int[] array1D = new int[input_rows * input_col];

        // int arr_index = 0;

        // for (int i = 0; i < input_rows; i++) {

        //     for (int j = 0; j < input_col; j++) {

        //         array1D[arr_index] = array2D[i][j];
        //         arr_index++;
        //     }
        // }
        
        // System.out.println("\n1D Array:");

        // for (int i = 0; i < array1D.length; i++) {

        //     System.out.print(array1D[i] + " ");
        // }
        
        // sc.close();



        // TASK 9

        // Scanner sc = new Scanner(System.in);
        
        // System.out.print("Enter the size of the square mat_one (N): ");
        // int input_size = sc.nextInt();


        // int[][] mat_one = new int[input_size][input_size];
        
        // System.out.println("Enter the elements of the mat_one:");

        // for (int i = 0; i < input_size; i++) {

        //     for (int j = 0; j < input_size; j++) {

        //         mat_one[i][j] = sc.nextInt();
        //     }
        // }
        
        // boolean mat_identity = true;

        // for (int i = 0; i < input_size; i++) {

        //     for (int j = 0; j < input_size; j++) {

        //         if ((i == j && mat_one[i][j] != 1) || (i != j && mat_one[i][j] != 0)) {

        //             mat_identity = false;
        //             break;
        //         }
        //     }
        //     if (!mat_identity) {

        //         break;
        //     }
        // }
        
        // if (mat_identity) {

        //     System.out.println("Identity Matrix");
        // } else {

        //     System.out.println("Not an Identity Matrix");
        // }
        
        // sc.close();




    // TASK 10

    //     Scanner sc = new Scanner(System.in);

    //     int[][] arr1_two_dimensional = {

    //         {0, 0, 10, 0, -1},
    //         {0, -1, 0, 0, -1},
    //         {-1, 0, -1, 0, 0},
    //         {0, -1, 7, 0, -1},
    //         {0, -1, 0, -1, 0}

    //     };
        
    //     System.out.println("Initial Map:");

    //     printMap(arr1_two_dimensional);

    //     int input_row = arr1_two_dimensional.length;
    //     int input_col = arr1_two_dimensional[0].length;
    //     int row_pos = -1, col_pos = -1;

    //     for (int i = 0; i < input_row; i++) {

    //         for (int j = 0; j < input_col; j++) {

    //             if (arr1_two_dimensional[i][j] == 7) {

    //                 row_pos = i;
    //                 col_pos = j;
    //                 break;
    //             }
    //         }
    //     }

    //     int player_turn = 5;

    //     while (player_turn > 0) {

    //         int new_row = row_pos, new_col = col_pos;

    //         System.out.printf("Enter move %d: ", (6 - player_turn));
    //         String inp = sc.nextLine().toUpperCase();

    //         if (inp.equals("UP") && new_row > 0) {

    //             new_row--;
    //         } else if (inp.equals("DOWN") && new_row < input_row - 1) {

    //             new_row++;
    //         } else if (inp.equals("LEFT") && new_col > 0) {

    //             new_col--;
    //         } else if (inp.equals("RIGHT") && new_col < input_col - 1) {

    //             new_col++;
    //         } else {

    //             System.out.println("Invalid move or out of bounds.");
    //             continue;
    //         }

    //         if (arr1_two_dimensional[new_row][new_col] == -1) {

    //             System.out.println("Player stepped on mine. Game Over!");
    //             break;
    //         } else if (arr1_two_dimensional[new_row][new_col] == 10) {

    //             System.out.println("Treasure found. You win!");
    //             break;
    //         }

    //         arr1_two_dimensional[row_pos][col_pos] = 0; 
    //         row_pos = new_row;
    //         col_pos = new_col;
    //         arr1_two_dimensional[row_pos][col_pos] = 7; 

    //         System.out.println("Current state:");
    //         printMap(arr1_two_dimensional);

    //         player_turn--;
    //     }

    //     if (player_turn == 0) {
    //         System.out.println("Failed to find the treasure.");
    //     }
    // }





























    // TASK 1

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 10 inputs:");

    int sum = 0 , numMin = 1 , numMax = 1 ;
    for (int i = 0; i < 10; i++) {
        
        int input_num = sc.nextInt();

        if (input_num > 0 && input_num % 2 != 0) {
            
            sum += input_num;
            
            if (input_num < numMin) {
                
                numMin = input_num;
            }
            if (input_num > numMax) {
                
                numMax = input_num;
            }
        }   
        
        if (sum == 0) {
            
            System.out.println("No odd positive numbers found");
        }
    }
    double average =  (double) sum / 10.00;

    System.out.println("Sum = " + sum);
    System.out.println("Minimum = " + numMin);
    System.out.println("Maximum = " + numMax);
    System.out.println("Average = " + average);

    sc.close();
    }
}
