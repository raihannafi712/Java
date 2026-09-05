public class MinHeap {

    private Integer[] heap;
    private int size;                           //Starts as 0.
    private int capacity;                       //Size / heap.length - 1

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Integer[capacity + 1];  // +1 because we are using 1-based indexing (First index= 1, index 0 will be null)
        this.size = 0;                          //Size will work as java index basically
    }





    //Insertion
    public void insert(int value) {
        if (size >= capacity) {                         //Suppose,If heap is full, size = 6,capacity =5      //We can't take heap.length because capacity is (heap.length -1)
            System.out.println("Heap is full");
            return;
        }

        size += 1;                                      //Increasing size before adding the value. If its the first element then index 0 = null and it will start at index 1
        heap[size] = value;                             //if its empty then value will go to index 1
        heapifyUp(size);
    }





    //Deletion
    public Integer extractMin() {
        if (size == 0) {
            return null;
        }

        Integer min_val = heap[1];
        heap[1] = heap[size];           //Last element will be ar the index 1(the root)
        heap[size] = null;              //last index is now null

        size -= 1;                      //One element is removed so size is reduced too
        heapifyDown(1);           //It will check from the top and maintain the min-heap structure (last element is on the top currently)

        return min_val;
    }







    //Checking the smallest element
    public Integer peek() {
        if (size == 0) {
            return null;
        }

        return heap[1];                     //The root
    }










    // --------------------------
    // Heapify operations
    // --------------------------

    //NOTES
    //If we are working as index 1 = root   [THIS IS THE CORRECT WAY]
    // left child index    = (i * 2)
    // right child index   = (i * 2) + 1
    // Parent    index     = (i / 2)

    //If index 0 = root
    // left child index    = (i * 2) + 1
    // right child index   = (i * 2) + 2
    // Parent  index       = (i - 1) / 2



    private void heapifyUp(int index) {

        int current = index;                        //Can not let the index change like the LL head


        while (current > 1) {                       //if we hit the root (index 1) then just end the loop

            int parent = current/2;
            
            if (heap[parent] > heap[current]) {     //If parent == child, no need for swap
            
            int temp = heap[current];               //Store the last value

            heap[current] = heap[parent];           //If parent is 20, currently last elemnent = 20 , parent = 20 
            heap[parent] = temp;                    //Now parent is that lowest element (swap done)

            current = parent;                       //Change the current index to its parent's (where the next check will happen)


            } else {
                break;                              
            }
        }

    }




    
    private void heapifyDown(int index) {                   //Do the tracing

        int current_idx = index;

        while (true) {                                          //It will keep running untill its sorted and will stop when the lowest index is the root
            
            int left_child_idx = current_idx*2;                 //In heapifyDown we just need the indices of the children, not the parent
            int right_child_idx = (current_idx*2) + 1;
            int lowest_value_idx = current_idx;                 //Using lowest index because we can compare children and parent both with index

            //Determinig the lowest index between root and child and also left child and right child
            if (left_child_idx <= size && heap[left_child_idx] < heap[lowest_value_idx]) {
                
                lowest_value_idx = left_child_idx;

            }

            if (right_child_idx <= size && heap[right_child_idx] < heap[lowest_value_idx]) {
                
                lowest_value_idx = right_child_idx;

            }

            if (lowest_value_idx == current_idx) {              //Loop will stop when lowest index is the root
                break;
            }

            int temp = heap[current_idx];

            heap[current_idx] = heap[lowest_value_idx];         //lowest index and root value same for the first run
            heap[lowest_value_idx] = temp;                      //Swap complete

            //Move up
            current_idx = lowest_value_idx;

        }
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }


    }













    //TESTER (UNI LAB)
    public static void main(String[] args) {

        testInsertAndPeek();
        testExtractMin();
        testMultipleExtract();
        testEdgeCases();
        testCapacity();
        testIsEmpty();
    }

    // --------------------------
    // Test 1: Insert + Peek
    // --------------------------
    private static void testInsertAndPeek() {
        System.out.println("===== Test 1: Insert & Peek =====");

        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        Integer expected = 2;
        Integer actual = h.peek();

        check("Peek after inserts", expected, actual);
        System.out.println();
    }

    // --------------------------
    // Test 2: Extract Min
    // --------------------------
    private static void testExtractMin() {
        System.out.println("===== Test 2: Extract Min =====");

        MinHeap h = new MinHeap(10);

        h.insert(10);
        h.insert(5);
        h.insert(20);
        h.insert(2);

        check("First extract", 2, h.extractMin());
        check("Second extract", 5, h.extractMin());
        check("Third extract", 10, h.extractMin());
        check("Fourth extract", 20, h.extractMin());

        System.out.println();
    }

    // --------------------------
    // Test 3: Order correctness
    // --------------------------
    private static void testMultipleExtract() {
        System.out.println("===== Test 3: Sorted Order =====");

        MinHeap h = new MinHeap(10);

        Integer[] values = {15, 3, 17, 10, 84, 19, 6, 22, 9};

        for (Integer v : values) {
            h.insert(v);
        }

        Integer[] expected = {3, 6, 9, 10, 15, 17, 19, 22, 84};

        boolean pass = true;

        for (int i = 0; i < expected.length; i++) {
            Integer val = h.extractMin();
            if (!equals(expected[i], val)) {
                pass = false;
                System.out.println("Mismatch at index " + i +
                        " | Expected: " + expected[i] +
                        " | Got: " + val);
            }
        }

        if (pass) {
            System.out.println("PASS: Heap produces sorted order");
        }

        System.out.println();
    }

    // --------------------------
    // Test 4: Edge cases
    // --------------------------
    private static void testEdgeCases() {
        System.out.println("===== Test 4: Edge Cases =====");

        MinHeap h = new MinHeap(5);

        check("Extract from empty", null, h.extractMin());
        check("Peek from empty", null, h.peek());

        h.insert(42);
        check("Single element peek", 42, h.peek());
        check("Single element extract", 42, h.extractMin());
        check("Empty again", null, h.extractMin());

        System.out.println();
    }

    // --------------------------
    // Test 5: Capacity
    // --------------------------
    private static void testCapacity() {
        System.out.println("===== Test 5: Capacity =====");

        MinHeap h = new MinHeap(3);

        h.insert(10);
        h.insert(20);
        h.insert(5);
        h.insert(1); // should be ignored or handled

        check("Capacity handling", 5, h.peek());

        System.out.println();
    }

    // --------------------------
    // Test 6: isEmpty
    // --------------------------
    private static void testIsEmpty() {
        System.out.println("===== Test 6: isEmpty =====");

        MinHeap h = new MinHeap(5);

        checkBool("Initially empty", true, h.isEmpty());

        h.insert(10);
        checkBool("After one insert", false, h.isEmpty());

        h.extractMin();
        checkBool("After removing all elements", true, h.isEmpty());

        System.out.println();
    }

    // --------------------------
    // Utility checker
    // --------------------------
    private static void check(String testName, Integer expected, Integer actual) {
        if (equals(expected, actual)) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static void checkBool(String testName, boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("PASS: " + testName);
        } else {
            System.out.println("FAIL: " + testName +
                    " | Expected: " + expected +
                    " | Got: " + actual);
        }
    }

    private static boolean equals(Integer a, Integer b) {
        if (a == null && b == null) return true;
        if (a == null || b == null) return false;
        return a.equals(b);
    }
}