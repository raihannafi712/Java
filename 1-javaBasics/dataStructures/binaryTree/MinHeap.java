public class MinHeap {
    private int[] heap;
    private int capacity;
    private int size;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // --- Index Helper Methods ---
    private int getParentIndex(int i) { return (i - 1) / 2; }
    private int getLeftChildIndex(int i) { return 2 * i + 1; }
    private int getRightChildIndex(int i) { return 2 * i + 2; }

    private boolean hasParent(int i) { return i > 0; }
    private boolean hasLeftChild(int i) { return getLeftChildIndex(i) < size; }
    private boolean hasRightChild(int i) { return getRightChildIndex(i) < size; }

    private void swap(int i1, int i2) {
        int temp = heap[i1];
        heap[i1] = heap[i2];
        heap[i2] = temp;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2;
            int[] newHeap = new int[capacity];
            for (int i = 0; i < size; i++) {
                newHeap[i] = heap[i];
            }
            heap = newHeap;
        }
    }

    // --- Core Operations ---

    // 1. Peek: Get minimum element
    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        return heap[0];
    }

    // 2. Insert: Add element to heap
    public void insert(int item) {
        ensureCapacity();
        heap[size] = item;
        size++;
        heapifyUp(size - 1);
    }

    // 3. Extract-Min: Remove and return root element
    public int extractMin() {
        if (size == 0) throw new IllegalStateException("Heap is empty");
        int item = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        return item;
    }

    // 4. Delete: Remove element at specific index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        // Force element to root by setting to lowest value, then extract
        heap[index] = Integer.MIN_VALUE;
        heapifyUp(index);
        extractMin();
    }

    // 5. Build Heap: Convert existing array to heap in O(n)
    public static MinHeap buildHeap(int[] arr) {
        MinHeap minHeap = new MinHeap(arr.length * 2);
        for (int i = 0; i < arr.length; i++) {
            minHeap.heap[i] = arr[i];
        }
        minHeap.size = arr.length;

        // Perform bottom-up heapification from last non-leaf node
        for (int i = (minHeap.size / 2) - 1; i >= 0; i--) {
            minHeap.heapifyDown(i);
        }
        return minHeap;
    }

    // --- Restructuring Helpers ---

    // Move node up to restore heap invariant
    public void heapifyUp(int index) {
        while (hasParent(index) && heap[getParentIndex(index)] > heap[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    // Move node down to restore heap invariant
    public void heapifyDown(int index) {
        while (hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && heap[getRightChildIndex(index)] < heap[smallerChildIndex]) {
                smallerChildIndex = getRightChildIndex(index);
            }

            if (heap[index] <= heap[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }

    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // --- Main Driver Method ---
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        System.out.println("Inserting elements: 15, 10, 20, 17, 8");
        heap.insert(15);
        heap.insert(10);
        heap.insert(20);
        heap.insert(17);
        heap.insert(8);

        System.out.print("Heap Array: ");
        heap.printHeap(); // Output root minimum 8

        System.out.println("Minimum element (peek): " + heap.peek());

        System.out.println("Extracted Min: " + heap.extractMin());
        System.out.print("Heap Array after extraction: ");
        heap.printHeap();

        System.out.println("\nBuilding heap from array [9, 4, 7, 1, 2, 6]:");
        int[] rawArray = {9, 4, 7, 1, 2, 6};
        MinHeap builtFromArr = MinHeap.buildHeap(rawArray);
        builtFromArr.printHeap();
    }
}