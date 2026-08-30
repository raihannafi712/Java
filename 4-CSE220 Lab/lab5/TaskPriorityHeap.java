public class TaskPriorityHeap {

    private String[] task;
    private int[] task_priority;
    private int size;
    private int cap_arr;

    public TaskPriorityHeap(int cap_arr) {
        this.cap_arr = cap_arr;
        this.task = new String[cap_arr + 1]; 
        this.task_priority = new int[cap_arr + 1];
        this.size = 0;
    }



    public void insert(String taskName, int priority) {
        if (size >= cap_arr) {
            System.out.println("Heap is full");
            return;
        }

        size = size + 1;
        task[size] = taskName;
        task_priority[size] = priority;

        heapifyUp(size);
    }





    public String extractMax() {
        if (isEmpty()) {
            return null;
        }

        String max_t = task[1];
        task[1] = task[size];
        task_priority[1] = task_priority[size];
        task[size] = null;
        task_priority[size] = 0;
        size = size - 1;

        heapifyDown(1);
        return max_t;
    }





    private void heapifyUp(int index) {
        int curr_val = index;
        while (curr_val > 1) {

            int parent = curr_val / 2;
            if (task_priority[parent] < task_priority[curr_val]) {
                swap(parent, curr_val);
                curr_val = parent;
            } else {

                break;
            }
        }
    }




    private void heapifyDown(int index) {
        int curr_val = index;

        while (true) {
            int left_child = curr_val * 2;
            int right_child = curr_val * 2 + 1;
            int largest = curr_val;

            if (left_child <= size && task_priority[left_child] > task_priority[largest]) {
                largest = left_child;
            }
            if (right_child <= size && task_priority[right_child] > task_priority[largest]) {
                largest = right_child;
            }
            if (largest == curr_val) {
                break;
            }

            swap(curr_val, largest);
            curr_val = largest;
        }
    }




    private void swap(int i, int j) {
        String temp_name = task[i];
        int temp_p = task_priority[i];

        task[i] = task[j];
        task_priority[i] = task_priority[j];

        task[j] = temp_name;
        task_priority[j] = temp_p;
    }



    
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
}