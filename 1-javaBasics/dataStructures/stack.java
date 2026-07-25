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







        // TO PRINT the stack
        System.out.println("Stack - " + st);    // [100, 40, 50, 30]








        // To see the last/ Bottom added element
        System.out.println("Last added / Top element- " + st.peek());     //[100, 40, 50, 30,20]

        





        // To see the first / TOP added element of the stack
        System.err.print("First added element / Bottom element-" );
        showFirstElem(st);






        // To remove the last element (permanently)
        st.pop();                                           // [100, 40, 50, 30]







        // To check stack size 
        System.out.println("Size of the stack- " + st.size());








        // To check if the stack is empty                    
        System.out.println(st.isEmpty());









        // To print the stack in reverse
        System.err.print("Stack in reverse- ");
        displayRev(st);                                     // 30 50 40 100
        System.out.println();








        
        // Insert at any index
        add_index(st, 2, 500);










        // Remove at any index
        remove_index(st, 3);









        //Stack overflow example                        (As stack doesn't have predefined length, overflow happens when the RAM is full)
        // System.out.println("Stack overflow-");
        // while(true){
        //     st.push(1);
        // }





        




        //Stack Underflow
        // System.out.println("Current stack - " + st);
        // st.pop();
        // st.pop();
        // st.pop();
        // st.pop();
        // System.out.println("stack underflow - ");
        // st.pop();








       

        // To check if memory is full(which means stack is full, stack overflow)
        // System.out.println(st.isFull());                                          // Stack in Java does not have isFull() method











        // To make a copy of st stack
        System.out.println("st stack- " + st);
        System.err.println("Clone of st stack- " + copy_stack(st));
        







        
    }



























    // METHODS

    //Displaying the stack in reverse (2 ways)
    public static void displayRev(Stack<Integer> st){

        //With recursion

        // if (st.size() == 0) {
        //     return;       
        // }
        // int top = st.pop();
        // System.out.print(top + " ");                    /* top element is printed and also popped */
        // displayRev(st);
        // st.push(top);                                   /* After printing the stack recursively, recursion wise the elements will be pushed back into the stack again to its original form */
       


        //Or (With new stack)

        if (st.size() < 1) {
            System.out.println("Stack is empty");
        }

        Stack<Integer> temp_stack = new Stack<>();
                
        while (st.size() != 0 ) {                                     /* Loop will stop at 1(the only element remaining, which is the first one) */
           
            temp_stack.push(st.pop());                              /* Basically this stack will get all the elements in reverse order () */ 

        }

        System.out.println(temp_stack);

        //Now getting the old stack back to original form
        while (temp_stack.size() != 0) {
            st.push(temp_stack.pop());
        }
        
    }












    // To get the first element of the stack
    public static void showFirstElem(Stack<Integer> st){

        if (st.size() < 1) {
            System.out.println("Stack is empty");
        }

        Stack<Integer> temp_stack = new Stack<>();
                
        while (st.size() > 1) {                                     /* Loop will stop at 1(the only element remaining, which is the first one) */
           
            temp_stack.push(st.pop());                              /* Basically this stack will get all the elements in reverse order () */ 

        }

        System.out.println(st.peek());                                     /* Now just print the stack with first element only */

        //Now getting the old stack back to original form
        while (temp_stack.size() != 0) {
            st.push(temp_stack.pop());
        }
        
    }












    //To add an element in given index
    public static void add_index(Stack<Integer> st, int index, int elem){

        Stack<Integer> temp_Stack = new Stack<>();

        System.out.println("Before insertion at given index- " + st);
        while (st.size() > (index) ) {                                      /* Suppose, we have to add at index 2.So, we remove till index 1.But stack size is (index +1),so loop will stop at 2 > 2.Then add the element which will be at index 2  */
            temp_Stack.push(st.pop());
        }

        st.push(elem);

        //pushing the other elements back to the original stack
        while (temp_Stack.size() > 0) {
            st.push(temp_Stack.pop());
        }
        System.out.println("After insertion at given index- " + st);
    }














    //To remove an element in given index
    public static void remove_index(Stack<Integer> st, int index){

        Stack<Integer> temp_Stack = new Stack<>();

        System.out.println("Before removal at given index- " + st);
        while (st.size() > (index+1) ) {                                        /*Suppose we have to remove at index 3.So, It will run untill 4 > (3+1). Basically we move all the elements to the other stack from start to index 4   */
            temp_Stack.push(st.pop());
        }

        st.pop();                                                               /* The removing index's element is removed */

        //pushing the other elements back to the original stack
        while (temp_Stack.size() > 0) {
            st.push(temp_Stack.pop());
        }
        System.out.println("After removal at given index- " + st);
    }















    //To copy a stack
    public static Stack<Integer> copy_stack(Stack<Integer> st){

        Stack<Integer> temp_1 = new Stack<>();

        while (st.size() != 0) {

            temp_1.push(st.pop());
        }

        Stack<Integer> clone_st = new Stack<>();


        //Getting the original back and also making its clone 
        while (temp_1.size() != 0) {

            int temp = temp_1.peek();
            
            clone_st.push(temp);
            st.push(temp);

            temp_1.pop();
        }

        return clone_st;



    }





}
