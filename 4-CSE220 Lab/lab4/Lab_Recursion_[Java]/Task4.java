public class Task4 {

    // Task 4A: Print elements of linked list in reverse order using recursion
    public static void task4A_recursive(Node head) {
        Node temp = head;

        if (temp == null) {                             /* We don't need temp's current value so just return it when null comes. Then stack callback handles the rest  */
            return;
        }

        task4A_recursive(temp.next);
        System.out.print(temp.elem + " -> ");                  /* SOP starts from the last node. Which is on the top of the stack */
    
    }

    // Task 4B: Reverse linked list recursively and return new head
    public static Node task4B_recursive(Node head) {                        /* IMPORTANT */

        if (head == null || head.next == null) {                /* head == null if it's a empty list and head.next for catching the last Node */
            return head;  
        }

        Node newHead = task4B_recursive(head.next);           /* It will stop at 5. It stays 5 while other callbacks come */ /* newHead = 5 and head = 4  */
                                                                                
        head.next.next = head;                                /* head.next (5) .next = head means 5 -> 4  */
        head.next = null;                                     /* 4 -> 5 is now 4 -> null */
        return newHead;                                       /* newHead stays 5, which is the new head */
    
    }

    
    public static void main(String[] args) {
        // Driver code for testing Task 4 methods
        System.out.println("------------------------------");

        Node head = arr2LL( new int[]{23,5,3,11,7,6} );
        System.out.println("\n Task4A ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: 6 -> 7 -> 11 -> 3 -> 5 -> 23 ->");
        System.out.println("Your Output: ");
        task4A_recursive(head);

        System.out.println("\n Task4B ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: 6 -> 7 -> 11 -> 3 -> 5 -> 23 ->");
        System.out.println("Your Output: ");
        Node rvHead = task4B_recursive(head);
        showLL(rvHead);

        System.out.println("------------------------------");


    }

    // Helper method to show the list (for driver code)
    public static void showLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.elem + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static Node arr2LL(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node n = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            n.next = newNode;
            n = newNode;
        }
        return head;
    }
}
