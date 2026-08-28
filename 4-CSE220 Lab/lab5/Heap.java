public class Heap {

    // TASK 4
    public static int[] t4(int[] task, int m) {
        int i = 0;
        int l = task.length;

        Heap load = new Heap(m, true);
        for (i = 0; i < m; i++) {

            load.insert(0);
        }
        for (i = 0; i < l; i++) {

            int min = load.extractmin();
            load.insert(min + task[i]);
        }
        int[] x = load.getheap();
        int n = x.length;

        Heap sort = new Heap(n, true);
        for (i = 0; i < n; i++) {

            sort.insert(x[i]);
        }
        int[] newx = new int[n];
        for (i = 0; i < n; i++) {

            newx[i] = sort.extractmin();
        }
        return newx;
    }



    // TASK 5
    public static int[] t5(int[] num_main, int k) {
        int j = num_main.length;
        Heap new_heap_main = new Heap(j, false);
        for (int i = 0; i < j; i++) {

            new_heap_main.insert(num_main[i]);
        }
        int[] newx = new int[k];
        for (int i = 0; i < k; i++) {

            newx[i] = new_heap_main.extractmax();
        }
        return newx;
    }




}
