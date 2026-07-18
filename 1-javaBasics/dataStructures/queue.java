import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    

    public static void main(String[] args) {


        // When we will send elements to one queue to another one, the order stays same
        
        Queue<Integer> q = new ArrayDeque<>();


        // Creating a queue
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);





        // TO PRINT
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println("rr");
        display(q);






        // TO REMOVE
        System.err.println("Before- " + q);
        q.remove();                                /* It removes the first input  */
        System.out.println(q);
        // OR
        q.poll();
        System.out.println(q);





        // To check size
        System.out.println("size - " + q.size());







        // TO CHECK THE TOP / First added ELEMENT
        System.out.println(q.element());
        // OR
        System.out.println("top - " + q.peek());






        // To check if its empty
        System.out.println(q.isEmpty());


    }




    // METHOD
    public static void display(Queue<Integer> q){
        Queue<Integer> f = new ArrayDeque<>();

        while (q.size() > 0) {
            System.out.print(q.peek() + " ");
            f.add(q.poll());
        }
        while (f.size() > 0) {                      /* To get the queue back */
            q.add(f.poll());
        }
        System.out.println();
    }








}
