package newLab;

import java.util.Scanner;

public class lab7 {
    public static void main(String[] args) {

        // Lab tasks

        // TASK 1
        // Scanner sc = new Scanner(System.in);
        // System.out.println("N= ");
        // int N = sc.nextInt();

        // int [] arr1 = new int[N];
        // int [] arr2 = new int[N+1]; 

        // for (int i = 0; i < N; i++) {
        //     System.out.print("Enter a number: ");
        //     int n = sc.nextInt();

        //     arr1[i] = n;
        //     arr2[i] = n;
        // }
        //     System.out.println("Enter another number: ");
        //     int n = sc.nextInt();

        //     arr2[N] = n;

        //     System.out.println("The elements of the array are:");
        //     for (int i = 0; i < N; i++) {
        //         System.out.println(i + ":" + arr1[i]);
        //     }

        //     System.out.println("After resizing the array::");
        //     for (int i = 0; i < N+1; i++) {
        //         System.out.print(arr2[i] + " ");
        //     }

        //     sc.close();



        // TASk 2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("N= ");
        // int N = sc.nextInt();

        // int [] arr = new int[N];
        // int [] arr_new = new int[N];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Enter a number:");
        //     int n = sc.nextInt();

        //     arr[i] = n;
        // }

        // System.out.println("Reversed using a new array:");
        // for (int i = 0 ; i < N; i++) {

        //     arr_new[i] = arr[N-1 -i];           /* Memorize */
        //     System.out.print(arr_new[i] + " ");
        // }

        // System.out.println();

        // System.out.println("Reversed the original array:");
        // for (int i = 0 ; i < N; i++) {

        //     arr[i] = arr_new[i];         
        //     System.out.print(arr[i] + " ");
        // }




        // TASK 3
        // int arr[] = {9, -5, 7, 9, -5, 5, 7};

        // System.out.println("Before removing duplicates:");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {      /* Memorize */
            
        //     for (int j = i+1; j < arr.length; j++) {
                
        //         if(arr[i] == arr[j]){
        //             arr[j] = 0;
        //         }
                    
        //     }
        // }

        // System.out.println("After replacing duplicates with 0:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }



        // TASK 4   

        // int [] arr = {23,100,23,56,100};
        // int count = 0;

        // System.out.println("Input array:");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // for (int i = 0; i < arr.length; i++) {          /* duplicates = 0 */
            
        //     for (int j = i + 1; j < arr.length; j++) {
                
        //         if (arr[i] == arr[j]) {
        //             arr[j] = 0;
        //         }
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) {
            
        //     if (arr[i] != 0) {
        //         count++;
        //     }
        // }

        // int [] arr2 = new int[count];
        // int index = 0;

        // for (int i = 0; i < arr.length; i++) {
            
        //     if (arr[i] != 0) {
        //         arr2[index++] = arr[i];
        //     }
        // }

        // System.out.println("New array:");
        // for (int i = 0; i < arr2.length; i++) {

        //     System.out.print(arr2[i] + " ");
        // }






        // // TASK 5                            /* Bubble sort and selection sort*/
        // Scanner sc = new Scanner(System.in);
        // System.out.println("N= ");
        // int N = sc.nextInt();

        // int [] arr = new int[N];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println("Enter a number:");
        //     int n = sc.nextInt();

        //     arr[i] = n;
        // }

        // System.out.println("Original array");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // // Sorting in descending order - selection sort
        // for (int i = 0; i < arr.length - 1; i++) {
            
        //     for (int j = 0; j < arr.length - i - 1; j++) {
                
        //         if (arr[j] < arr[j+1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }

        // // Sorting in ascending order - bubble sort
        // // for (int i = 0; i < arr.length - 1; i++) {
            
        // //     for (int j = 0; j < arr.length - i - 1; j++) {
                
        // //         if (arr[j] > arr[j+1]) {
        // //             int temp = arr[j];
        // //             arr[j] = arr[j+1];
        // //             arr[j+1] = temp;
        // //         }
        // //     }
        // // }

        // System.out.println("Updated array");
        // for (int i = 0; i < arr.length; i++) {

        //     System.out.print(arr[i] + " ");
        // }











        


        //  Home tasks

        // TASK 1
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("N:");
        // int N = sc.nextInt();

        // int [] arr = new int[N];

        // for (int i = 0; i < arr.length; i++) {
        //     int n = sc.nextInt();
            
        //     arr[i] = n;
        // }

        // System.out.println("Original array: ");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        // int [] arr2 = new int[N];

        // for (int i = 0; i < arr.length; i++) {
            
        //     if (arr[i] > 0) {
        //         arr2[i] = 1;
        //     } else {
        //         arr2[i] = 0;
        //     }
        // }

        // System.out.println("After modifying: ");
        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print(arr2[i] + " ");
        // }
        // System.out.println();





        // TASK 2
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("N:");
        // int N = sc.nextInt();

        // int [] arr = new int[N];

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print("Enter a number:");
        //     int n = sc.nextInt();
            
        //     arr[i] = n;
        // }

        // System.out.println();
        // System.out.println("Enter search number:");
        // int n = sc.nextInt();

        // for (int i = 0; i < arr.length; i++) {
            
        //     if (arr[i] == n) {
        //         System.out.println(n + " is at index " + i);
        //     }
        // }
        // System.out.println("Element not found");






        // TASK 3
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("N:");
        // int N = sc.nextInt();

        // double [] arr = new double[N];
        // double sum = 0;


        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print("Enter a number:");
        //     double n = sc.nextDouble();
            
        //     arr[i] = n;
        //     sum += n;
        // }

        // double temp_max = arr[0];
        // double temp_max_idx = 0;
        // double temp_min = arr[0];
        // double temp_min_idx = 0;

        // for (int i = 0; i < arr.length - 1; i++) {

        //     if (temp_max < arr[i + 1]) {
        //         temp_max = arr[i + 1];
        //         temp_max_idx = i + 1;
        //     }else if(temp_min > arr[i + 1]){
        //         temp_min = arr[i+1];
        //         temp_min_idx = i + 1;
        //     }
        // }

        // double avg = sum/N;

        // System.out.println();
        // System.out.println("Maximum element " + temp_max + " found at index " + temp_max_idx );
        // System.out.println("Minimum element " + temp_min + " found at index " + temp_min_idx );
        // System.out.println("summation: " + sum);
        // System.out.println("Average: " + avg);



        // TASK 4
        // Scanner sc = new Scanner(System.in);
        
        // System.out.println("Please enter the length of array 1: ");
        // int N = sc.nextInt();

        // int [] arr1 = new int[N];

        // for (int i = 0; i < arr1.length; i++) {
        //     System.out.print("Enter a number:");
        //     int n = sc.nextInt();
            
        //     arr1[i] = n;
        // }

        // System.out.println("Please enter the length of array 2: ");
        // int N2 = sc.nextInt();

        // int [] arr2 = new int[N2];

        // for (int i = 0; i < arr2.length; i++) {
        //     System.out.print("Enter a number:");
        //     int n = sc.nextInt();
            
        //     arr2[i] = n;
        // }

        // int count = 0;
        // for (int i = 0; i < arr1.length; i++) {
            
        //     for (int j = 0; j < arr2.length; j++) {
                
        //         if (arr1[i] == arr2[j]) {
        //             count++;
        //         }
        //     }
        // }

        // if (count == N2) {
        //     System.out.println("Array 2 is a subset of Array 1. ");
        // } else {
        //     System.out.println("Array 2 is not a subset of Array 1. ");
        // }




        // TASK 5         
        // int [] marks = {85, 90, 75, 44, 99};
        // String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};

        // for (int i = 0; i < marks.length - 1; i++) {
            
        //     for (int j = 0; j < names.length -1 - i; j++) {
                
        //         if (marks[j] > marks[j+1]) {

        //             int marks_temp = marks[j];
        //             marks[j] = marks[j+1];      /* Swap part */
        //             marks[j+1] = marks_temp;

        //             String names_temp = names[j];
        //             names[j] = names[j+1];      /* Swap part */
        //             names[j+1] = names_temp;
        //         }
        //     }
        // }

        // System.out.println("Sorted array:");
        // for (int i = 0; i < names.length; i++) {
            
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();
        // for (int i = 0; i < names.length; i++) {
            
        //     System.out.print(names[i] + " ");
        // }






    


    }
}
