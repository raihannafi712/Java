public class Task6 {

    public static String[] taskSchedule(String[] taskNames, int[] priorities) {
        TaskPriorityHeap heap = new TaskPriorityHeap(taskNames.length);

        int i = 0;
        while (i < taskNames.length) {

            heap.insert(taskNames[i], priorities[i]);
            i = i + 1;
        }

        String[] result = new String[taskNames.length];
        int j = 0;

        while (!heap.isEmpty()) {
            result[j] = heap.extractMax();
            j = j + 1;
        }

        return result;
    }




    private static void printArray(String[] array) {
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
        String[] taskNames = {"Email", "Meeting", "Code Review", "Lunch", "Debug"};
        int[] priorities = {2, 5, 3, 1, 4};

        String[] result = taskSchedule(taskNames, priorities);

        System.out.print("Output: ");
        printArray(result);
    }
}