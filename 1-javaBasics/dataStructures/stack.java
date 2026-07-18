import java.util.Stack;

public class stack {
	public static void main(String[] args) {


        // Stack has unlimited size
        // The first element of the stack cannot be accessed without removing the previous ones

        // Creating a new stack
        Stack<Integer> st = new Stack<>(); 


        // Adding elements (Last in,first out) LIFO / First in last out (FILO)
        st.push(100);
        st.push(40);
        st.push(50);
        st.push(30);
        st.push(20);

        // To see the last added element
        System.out.println("Last added- " + st.peek());     //[100, 40, 50, 30,20]


        // To remove the last element
        st.pop();                                           // [100, 40, 50, 30]








        // TO PRINT
        System.out.println("Stack - " + st);



        // to print recursively
        displayRev(st);                         //30 50 40 100








        // To check size 
        System.out.println("Size of the stack- " + st.size());










        // To get the first element of the stack
        // while (st.size() > 1) {                                     /* While loop because we don't know how many elements inside the stack */
        //     st.pop();
        // }
        // System.out.println(st);









        // To check if the stack is empty                    
        System.out.println(st.isEmpty());











        // To check if memory is full(which means stack is full, stack overflow)
        // System.out.println(st.isFull()); // Stack in Java does not have isFull() method


        // To copy contents from stack to stack in reverse
        // Stack<Integer> rt = new Stack<>();
        
        // while (st.size() > 0) {
        //     int x = st.peek();
        //     rt.push(x);             /* The last element of st will be added to rt in the beginning */
        //     st.pop();               /* The next element has to be accessed by removing the top one */

        //     // OR
        //     // rt.push(st.pop());
        // }
        // System.out.println(rt);








        // To make a copy of st stack
        // make another stack and get rt here











        // // Insert at any index
        // // we will be inserting 5 at the given index of the st stack

        // Stack<Integer> tt = new Stack<>();

        // System.out.println("before- " + st);
        // while (st.size() > 2) {
        //     tt.push(st.pop());
        // }

        // st.push(5);
        // while (tt.size() > 0) {
        //     st.push(tt.pop());
        // }
        // System.out.println("after- " + st);











        // Remove at any index
        // we will be removing the 3rd index

        Stack<Integer> tt = new Stack<>();

        System.out.println("before- " + st);
        while (st.size() > 1) {                     /* index + 1 */
            tt.push(st.pop());
        }
        st.pop();                                   /* Remove the asked index */

        while (tt.size() > 0) {
            st.push(tt.pop());
        }
        System.out.println("after- " + st);



        

        
    }




    // METHODS
    public static void displayRev(Stack<Integer> st){
        if (st.size() == 0) {
            return;       
        }
        int top = st.pop();
        System.out.print(top + " ");                    /* top element is printed and also popped */
        displayRev(st);
        st.push(top);                                   
       

    }












}
