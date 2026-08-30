public class Task4 {

    public static int[] taskDist(int[] tasks, int m) {
        MinHeap minHeap = new MinHeap(m);

        int i = 0;
        while (i < m) {
            minHeap.insert(0);
            i = i + 1;
        }

        int temp = 0;
        while (temp < tasks.length) {

            int lowest_load = minHeap.extractMin();
            int new_load = lowest_load + tasks[temp];
            minHeap.insert(new_load);

            temp = temp + 1;
        }

        return minHeap.toArray();
    }




    private static void printArray(int[] array) {
        System.out.print("[");
        int i = 0;

        while (i < array.length) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
            i = i + 1;
        }
        System.out.println("]");
    }




    public static void main(String[] args) {
        int[] tasks = {2, 4, 7, 1, 6};
        int m = 4;

        int[] result = taskDist(tasks, m);

        System.out.print("Output: ");
        printArray(result);
    }
}