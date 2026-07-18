import lab_2_part1.src.Node;

public class linkedList1 {


    // Node class (It can be created in another file or also like this)
    // This Node class is always same for any code
     
    public static class Node{           /* Static nested class */   /* Basically design class */
        int data;                       //value                     /* This is used to print in the tester class. Ex- head.data (where head is a variable of Node data type) */
        Node next;                      //address of the next node

        Node(int data){                 // If there is Node(Object data) - it means the nodes can store any data type
            this.data = data;
        }
    }















    // Tester class (linkedList1 class)
    public static void main(String[] args) {
        Node a = new Node(5);             /* Node class's new object */

        System.out.println(a);                  /* Node a's location */ /* a is the head of the linked list */
        System.out.println("Node a data- " + a.data); 
        System.out.println(a.next);             /* Node a's next node's location which is not assigned yet (null) */

        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(66);
        Node e = new Node(78);
        // 5 4 3 66 78




        // To connect and make a linked list manually        /* Let's call this Linked list 1 */
        // Before connecting, a empty list is null and null is both head and tail
        a.next = b; // 5 -> 4 3 66 78
        b.next = c; // 5 -> 4 -> 3 66 78
        c.next = d; // 5-> 4 -> 3 -> 66 78
        d.next = e; // 5-> 4 -> 3 -> 66 -> 78

        // In cases of one element inside a linked list, it means its the head and tail both of that list












        // TO DISPLAY        
        
        // // 1
        // Node temp = a;
        // System.out.println("Linked list 1 - ");
        // for (int i = 1; i <= 5; i++) {
        //     System.err.print(temp.data + " ");
        //     temp = temp.next;
        // }
        // System.out.println();


        // // 2 (to display again, we need to keep creating new variables)
        // Node temp1 = a;
        // System.out.println("Linked list 1 - ");
        // for (int i = 1; i <= 5; i++) {
        //     System.err.print(temp1.data + " ");
        //     temp1 = temp1.next;
        // }
        // System.out.println();



        // 3 (To display recursively (to print multiple times with same method))

        // display(a);
        // display(a);
        // displayr(a);


        // 4 (To display linked list in reverse)
        displayrev(a);
            









        




        // To find the length
        length(a);

        // To find length recursively










        // To add a node at the end of a list
        





        // To separate pos and neg numbers from array
        








        

        


    }



    // Methods

    public static void display(Node head){
        System.out.println("Linked list - ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void displayr(Node head){         /* With recursion */
        if(head == null){
            System.out.println();
            return;
        }
        System.out.print(head.data + " ");
        displayr(head.next);                        /* After printing one element,call the next element with recursion */
    }


    public static void displayrev(Node head){ //everytime its called, head= head.next
        
        if(head == null){
            return;
        }
        displayrev(head.next);                    /* Creating stack. FIrst in first out */
        System.out.print(head.data + " ");
                      
    }


    public static void length(Node head){
        System.out.println();
        int count = 0;

        while (head != null) {
            count++;
            head = head.next;
        }
        System.out.println("Linked List 1 length = " + count);
        
    }


    // public static void add(int ele){
    //     if (size == arr.length) {
    //         int[] brr = Array.copyOf
    //     } else {
            
    //     }
    // }
    



    


}
