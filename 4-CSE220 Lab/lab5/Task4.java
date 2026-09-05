import java.util.Arrays;

public class Task4 {

    public static int[] taskDist(int[] tasks, int m) {

        MinHeap minHeap = new MinHeap(m);


        for (int i = 0; i < m; i++) {
            
            minHeap.insert(0);
        }

        for (int i = 0; i < tasks.length; i++) {
            
            int lowest_load = minHeap.extractMin();         //Extract the smallest load from the heap.
            int new_load = lowest_load + tasks[i];          //Add the task's processing time to this load.

            minHeap.insert(new_load);                       //Reinsert the updated load into the heap.

        }

        int new_arr[] = new int[m];

        for (int i = 0; i < new_arr.length; i++) {
            
            new_arr[i] = minHeap.extractMin();
        }

        return new_arr;
    }




    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;

        int[] result = taskDist(tasks, m);

        System.out.print("Output: ");
        System.out.println(Arrays.toString(result));
    }
}