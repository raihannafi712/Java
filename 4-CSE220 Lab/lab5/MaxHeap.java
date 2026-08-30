public class MaxHeap {

    private Integer[] heap;
    private int size;
    private int cap_arr;

    public MaxHeap(int cap_arr) {
        this.cap_arr = cap_arr;
        this.heap = new Integer[cap_arr + 1]; 
        this.size = 0;
    }




    public void insert(int value) {
        if (size >= cap_arr) {
            System.out.println("Heap is full");
            return;
        }
        size = size + 1;
        heap[size] = value;

        heapifyUp(size);
    }





    public Integer extractMax() {
        if (isEmpty()) {
            return null;
        }
        Integer max_val = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size = size - 1;
        heapifyDown(1);

        return max_val;
    }




    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return heap[1];
    }




    private void heapifyUp(int index) {
        int curr_val = index;

        while (curr_val > 1) {
            int parent = curr_val / 2;

            if (heap[parent] < heap[curr_val]) {
                int temp = heap[parent];
                heap[parent] = heap[curr_val];
                heap[curr_val] = temp;
                curr_val = parent;

            } else {

                break;
            }
        }
    }




    private void heapifyDown(int index) {
        int current = index;
        while (true) {
            int left_child = current * 2;
            int right_child = current * 2 + 1;
            int largest = current;

            if (left_child <= size && heap[left_child] > heap[largest]) {
                largest = left_child;
            }
            if (right_child <= size && heap[right_child] > heap[largest]) {
                largest = right_child;
            }
            if (largest == current) {

                break;
            }

            int temp = heap[current];
            heap[current] = heap[largest];
            heap[largest] = temp;
            current = largest;
        }
    }




    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}