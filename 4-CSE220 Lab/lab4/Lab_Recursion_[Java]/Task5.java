public class Task5 {

    // Task 5A: Return max value in linked list recursively
    public static int findMax_recursive(Node head) {
        Node temp = head;
        if (temp.next == null) {
            return temp.elem;
        }

        int max = findMax_recursive(temp.next);             /* 5 gets returned here when base case reaches */

        if (temp.elem > max) {                              /* If the previous element is greated then it will become max */
            return temp.elem;
        } else {
            return max;                                     /* If 5 is still the greatest then next callback will get 5 returned (max) */
        }
    }

    // Task 5B: Sort linked list recursively using selection sort logic                 /* USED AI */
    public static Node sortLL_recursive(Node head) {
        outerLoop(head);
        return head;
    }
 
    // "Outer loop": picks each position in turn and places the correct value there.
    private static void outerLoop(Node start) {
        if (start == null || start.next == null) {
            return;                                  // base case: 0 or 1 node left = already sorted
        }
 
        Node minNode = findMinNode(start.next, start); // "inner loop"
 
        if (minNode != start) {                       // swap VALUES only, plain assignment
            int temp = start.elem;
            start.elem = minNode.elem;
            minNode.elem = temp;
        }
 
        outerLoop(start.next);                        // move to the next position
    }
 
    // Scans the rest of the list, carrying the current best (minSoFar) down the stack.
    private static Node findMinNode(Node current, Node minSoFar) {
        if (current == null) {
            return minSoFar;                          // base case: end of list, return what we found
        }
        if (current.elem < minSoFar.elem) {            // manual comparison, no built-in min()
            minSoFar = current;
        }
        return findMinNode(current.next, minSoFar);
    }








    // Task 5C: Find and print duplicate values with their positions                    /* USED AI */
    public static void findDup_Recursive(Node head) {
        // TODO: Implement this recursively
    }

    public static void main(String[] args) {
        // Driver code for testing Task 5 methods        
        Node head = arr2LL( new int[]{23,5,3,11,27,6} );
        System.out.println("\n Task5A: findMax_Recursive ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: "+27);
        System.out.println("Your Output: "+findMax_recursive(head));

        System.out.println("\n------------------------------");

        System.out.println("\n Task5B: sortLL_Recursive ");
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output:");
        System.out.println("3 -> 5 -> 6 -> 11 -> 23 -> 27 -> null");
        System.out.println("Your Output: ");
        Node sortedHead = sortLL_recursive(head);
        showLL(sortedHead);
        
        System.out.println("\n------------------------------");

        System.out.println("\n Task5C: findDup_Recursive ");
        head = arr2LL(new int[]{ 10, 22, 13, 20, 22, 23, 10, 22 });
        System.out.println("The LinkedList: ");
        showLL(head);
        System.out.println("Expected Output: ");
        System.out.println("10: 6\n22: 4, 7\n13: No Duplicate\n20: No Duplicate\n22: 1, 7\n23: No Duplicate\n10: 0\n22: 1, 4\n");
        System.out.println("Your Output: ");
        findDup_Recursive(head);

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
