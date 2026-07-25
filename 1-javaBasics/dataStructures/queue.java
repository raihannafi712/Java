import java.util.ArrayDeque;
import java.util.Queue;

public class queue {
    

    public static void main(String[] args) {


        // When we send elements to one queue to another one, the order stays same
        

        //Creating Queue
        //We cannot create queue like stack. It is an interface
        Queue<Integer> q = new ArrayDeque<>();
        // Queue<Integer> z = new Queue<>();                            /* If Queue was the name of a class */
            
        


        // Creating a queue (add or offer)                              /* This is called enqueue (Adding elements at the rear) */
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.offer(100);







        // TO PRINT the queue
        System.out.println("Queue- " + q);                  //[1, 2, 3, 4, 5]
        //Or
        System.out.println("Displaying the queue with method- ");
        display(q);








        //To see the size of the queue
        System.out.println("Size - " +  q.size());
        









        // TO CHECK THE FRONT element / The First added ELEMENT (element or peek)
        System.out.println("First added element-" + q.element());               /* 1 is the front element */
        // OR
        System.out.println("First added element-" + q.peek());


        






        // TO CHECK THE REAR element / The last added ELEMENT 
        display_rear(q);








        // TO REMOVE the front element                  (remove or poll)                    /* This is called Dequeue (a method that needs to be created) */
        System.err.println("Before removing- " + q);
        q.remove();                                                                         /* It removes the first input  */
        System.out.println("After removing- " + q);

        // OR
        // q.poll();
        // System.out.println(q);










        //To remove the last element                                
        System.err.println("Before removing- " + q);
        remove_last(q);                                                
        System.out.println("After removing- " + q);
        







        


        //To remove all the elements (clear())
        // System.out.println("Queue- " + q);
        // q.clear();
        // System.out.println(q);









        //To check if queue is empty
        System.out.println("Is the queue empty- " + q.isEmpty());









    }























    


    // METHOD



    //Displaying the queue
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










    //Displaying the rear element
    public static void display_rear(Queue<Integer> q){

        Queue<Integer> temp_q = new ArrayDeque<>();

        while (q.size() > 1) {                              /* We stop at index 0.The last element */

            temp_q.add(q.poll());
        }

        System.out.println("The last added element- " + q.peek());
        temp_q.add(q.poll());                               /* Printed the last elem and then popped it into temp too to maintain the sequence */

        while (temp_q.size() > 0) {
            q.add(temp_q.poll());            
        }

    }










    //Removing the last / rear element
    public static void remove_last(Queue<Integer> q){

        Queue<Integer> temp_q = new ArrayDeque<>();

        while (q.size() > 1) {                              /* We stop at index 0(size = 1) .The last element */

            temp_q.add(q.poll());
        }

        q.poll();                                           /* Removed the rear element permanently */

        while (temp_q.size() > 0) {
            q.add(temp_q.poll());            
        }

    }








}
