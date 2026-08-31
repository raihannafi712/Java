public class MinHeap {
    private Integer[] heap;
    private int size;
    private int cap_arr;

    public MinHeap(int cap_arr) {
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




    public Integer extractMin() {
        if (isEmpty()) {
            return null;
        }

        Integer heap_min_val = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size = size - 1;

        heapifyDown(1);

        return heap_min_val;
    }




    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return heap[1];
    }




    private void heapifyUp(int index) {
        int curr_count = index;

        while (curr_count > 1) {
            int parent = curr_count / 2;

            if (heap[parent] > heap[curr_count]) {
                int temp = heap[parent];
                heap[parent] = heap[curr_count];
                heap[curr_count] = temp;
                curr_count = parent;
            } else {
                break;
            }
        }
    }





    private void heapifyDown(int index) {
        int curr_count = index;

        while (true) {
            int left_child = curr_count * 2;
            int right_child = curr_count * 2 + 1;
            int lowest = curr_count;

            if (left_child <= size && heap[left_child] < heap[lowest]) {
                lowest = left_child;
            }
            if (right_child <= size && heap[right_child] <= heap[lowest]) {

                lowest = right_child;
            }
            if (lowest == curr_count) {
                break;
            }

            int temp = heap[curr_count];
            heap[curr_count] = heap[lowest];
            heap[lowest] = temp;
            curr_count = lowest;
        }
    }




    public boolean isEmpty() {
        if (size == 0) {
            return true;
            
        } else {
            return false;
        }
    }




    public int[] toArray() {
        int[] result = new int[size];
        int i = 1;
        while (i <= size) {
            result[i - 1] = heap[i];
            i = i + 1;
        }
        return result;
    }
}