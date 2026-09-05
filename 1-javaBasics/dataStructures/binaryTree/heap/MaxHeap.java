    public class MaxHeap {

        private Integer[] heap;
        private int size;
        private int capacity;

        public MaxHeap(int capacity) {
            this.capacity = capacity;
            this.heap = new Integer[capacity + 1]; 
            this.size = 0;
        }

        public void insert(int val){
            if (size >= capacity) {     
                System.out.println("Heap is full");
                return ;
            }

            size += 1;
            heap[size] = val;
            heapifyUp(size);
        }






        public void heapifyUp(int idx){

            Integer current_idx = idx;

            while (current_idx > 1) {

                Integer parent = (current_idx / 2);
                
                if (heap[parent] < heap[current_idx]) {
                    
                    int temp = heap[parent];

                    //Swap
                    heap[parent] = heap[current_idx];
                    heap[current_idx] = temp;

                    current_idx = parent;

                }else {
                    break;
                }

            }

        }






        public int extractMax(){
            if (size == 0) {
                return 0 ;
            }

            int max_val = heap[1]; 
            heap[1] = heap[size];
            heap[size] = null;
            size -= 1;

            heapifyDown(1);
            return  max_val;

        }





        public void heapifyDown(int idx){

            int current_idx = idx;

            while (true) {
                
                int left_child_idx = (current_idx *2);
                int right_child_idx = (current_idx *2) + 1;
                int highest_val_idx = current_idx;

                //Left child check
                if (left_child_idx <= size && heap[left_child_idx] > heap[highest_val_idx]) {

                    highest_val_idx = left_child_idx;                                               //If the left child is greater than the parent then it will be the highest value
                }

                //Right child check
                if (right_child_idx <= size && heap[right_child_idx] > heap[highest_val_idx]) {

                    highest_val_idx = right_child_idx;                                               //If the left child is greater than the parent then it will be the highest value
                }

                if (highest_val_idx == current_idx) {
                    break;
                }

                int temp = heap[current_idx];
    
                heap[current_idx] = heap[highest_val_idx];
                heap[highest_val_idx] = temp;

                //Move down
                current_idx = highest_val_idx;                      //current index was the parent so for the next run parent will change

            }
        }




        public int peek(){
            if (size == 0) {
                return 0;
            }
            return heap[1];
        }



        public boolean isEmpty(){
            if (size == 0) {
                return true;
            }

            return false;
        }
    }