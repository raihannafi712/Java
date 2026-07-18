public class CustomMaxHeap {
    private String[] names;
    private int[] priorities;
    private int size;
    private int cap;

    public CustomMaxHeap(int capacity) {
        cap = capacity;
        size = 0;
        names = new String[cap];
        priorities = new int[cap];
    }

    public void insert(String name, int priority) {
        names[size] = name;
        priorities[size] = priority;
        size++;
        swim();
    }

    public String extractMax() {
        String top = names[0];
        names[0] = names[size - 1];
        priorities[0] = priorities[size - 1];
        size--;
        sink(0);
        return top;
    }

    private void swim() {
        int cur = size - 1;
        while (cur > 0) {
            int par = (cur - 1) / 2;
            if (priorities[par] >= priorities[cur]) {
                break;
            }
            String tempName = names[par];
            names[par] = names[cur];
            names[cur] = tempName;
            int tempPri = priorities[par];
            priorities[par] = priorities[cur];
            priorities[cur] = tempPri;
            cur = par;
        }
    }

    private void sink(int cur) {
        while (cur * 2 + 1 < size) {
            int left = cur * 2 + 1;
            int right = cur * 2 + 2;
            int largest = left;
            if (right < size && priorities[right] > priorities[left]) {
                largest = right;
            }
            if (priorities[cur] >= priorities[largest]) {
                break;
            }
            String tempName = names[cur];
            names[cur] = names[largest];
            names[largest] = tempName;
            int tempPri = priorities[cur];
            priorities[cur] = priorities[largest];
            priorities[largest] = tempPri;
            cur = largest;
        }
    }



        // TASK 6
    public static String[] t5(String[] task_main_name, int[] priorities) {
        int i = 0;
        int j = task_main_name.length;
        Heap x = new Heap(j, false);
        for (i = 0; i < j; i++) {
            x.insertobj(task_main_name[i], priorities[i]);
        }
        String[] newx = new String[j];
        for (i = 0; i < j; i++) {
            newx[i] = (String) x.extractobj();
        }
        return newx;
    }

}
