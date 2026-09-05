package heap;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {

        // Ascending order PriorityQueue / min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        
        pq.add(10);
        pq.add(20);
        pq.add(35);
        pq.add(-13);

        System.out.println(pq.peek());
        System.out.println(pq.size());
        System.out.println(pq.remove()); // LIFO
        System.out.println(pq);

        pq.add(5); pq.add(8); pq.add(2); pq.add(0);
        pq.add(3); pq.add(1); pq.add(7); pq.add(6);

        for (Integer ele : pq) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // A complete binary tree / min-heap has been created.Look at the notes to see how it gets inserted


        int[] arr = {7 , 10 , 4, 3, 20 , 15, 13, 1, 6, 8};
        System.out.println(kthSmallest(arr, 4));

        System.out.println(kthLargest(arr, 4));


        int[] arr2 = {6 , 5 , 3, 2, 8 , 10, 9};
        System.out.println(Arrays.toString(nearlySorted (arr2, 3)) );

    }



    // kth smallest element (max-heap)
    public static int kthSmallest(int[] arr , int k){

        // Max-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (Integer ele : arr) {
            pq.add(ele);

            if (pq.size() > k) {
                pq.remove(); //Biggest numbers are getting removed and smallest getting on the root
            }
        }
        return pq.peek();
    }




    // kth largest element (min-heap)
    public static int kthLargest(int[] arr , int k){

        // min-heap
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Integer ele : arr) {
            pq.add(ele);

            if (pq.size() > k) {
                pq.remove(); //Biggest numbers are getting removed and smallest getting on the root
            }
        }
        return pq.peek();
    }




    // K sorted array
    public static int[] nearlySorted(int[] arr , int k){
        int idx = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Integer ele : arr) {
            pq.add(ele);

            if (pq.size() > k) {
                arr[idx++] = pq.remove();
            }
        }
        while (pq.size() > 0) {
            arr[idx++] = pq.remove();
        }

        return arr;
    }


}
