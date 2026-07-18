import lab_2_part1.src.Node;

public class lab_2 {

    // Generic
    static class Node{
        Object elem;
        Node next;

        Node(Object elem2){
            this.elem = elem2;
        }
    }


    public static void main(String[] args) {
        Node n4 = new Node("Python");
        Node n5 = new Node("Java");
        Node n2 = new Node(324);
        Node n3 = new Node(8.97);
        Node n1 = new Node("Hello");



        // connect
        n4.next = n5;
        n5.next = n2;
        n2.next = n3;
        n3.next = n1;
        n1.next = n5;
        // Python > Java > 324 > 8.97 > Hello(connected with 8.97)


        // print
        System.out.println( n1 );
        System.out.println( n3.next );



        System.out.println( n3.next.elem );



        Node x = n4.next;                                                   /* n5 */
        // System.out.println( n1.elem + x.elem );                         /* Object type cannot directly add */
        // System.out.println( (String) n1.elem + (String) x.elem );       /* Casting needed */




        x.next = n3;                                                        /* n2 = n3 */
        // System.out.println(n2.next.next +  n5.next);                     /* n5 + n2 */   /* Objects cannot be added */




        n5 = null;
        System.out.println( n4.next.elem );




        x.next.next = null;                         /* n3 */
        n3.next.elem = 321;                         /* n1 */




        
        n4.next = 532;                              /* n4.next means n5's location */
        n4.next.elem = 532;                         /* n5's data updated */
        System.out.println(n4.next.elem);






    }




    // 














































































    // // TASK 1
    // public static String checkSimilar(Node building_one, Node building_two) {
    //     Node newbuilding_one=building_one;
    //     Node newbuilding_two=building_two;
    //     int count_A=0;
    //     int count_B=0;

    //     while(newbuilding_one!=null){
    //         count_A++;
    //         newbuilding_one=newbuilding_one.next;
    //     }

    //     while(newbuilding_two!= null){
    //         count_B++;
    //         newbuilding_two = newbuilding_two.next;
    //     }
    //     if(count_A!=count_B){
    //         return "Not Similar";
    //     }

    //     while(building_one!=null && building_two!=null){
    //         if(!building_one.elem.equals(building_two.elem)){
    //             return "Not Similar";}
    //         building_one=building_one.next;
    //         building_two=building_two.next;
    //     }

    //     return "Similar";
    // }


    // // TASK 2
    // public static Node organizeBooks(Node head,Integer[] popularity) {
    //     int i=0;
    //     int j=0;
    //     Object title_main;
    //     int c=0;
    //     Node check_one=head;
    //     while(check_one!=null){
    //         j=i+1;
    //         Node check_two =check_one.next;

    //         while(check_two !=null){
    //             if(popularity[i]<popularity[j]){
    //             Object x=check_one.elem;
    //             Object y=check_two.elem;
    //             title_main=x;
    //             check_one.elem=y;
    //             check_two .elem=title_main;
    //             c=popularity[i];
    //             popularity[i]=popularity[j];
    //             popularity[j]=c;
    //         }
    //         check_two =check_two.next;
    //         j++;}
    //         check_one=check_one.next;
    //         i++;
    //     }
    //     return head;
    // }


    // // TASK 3
    // public static Node alternateMerge(Node head1, Node head2) {
    //     Node alt_main_one=head1;
    //     Node alt_main_two=head2;

    //     while(alt_main_one!=null && alt_main_two!=null){
    //         Node x=alt_main_one.next;
    //         Node y=alt_main_two.next;
    //         alt_main_one.next=alt_main_two;
    //         alt_main_two.next=x;
    //         a=x;
    //         alt_main_two=y;
    //     }
    //     return head1;
    // }


    // // TASK 4
    // public static Node idGenerator(Node head_one, Node head_two, Node head_three){
    //     Node reverse_head_main = null;
    //     Node temp_val = head_one;

    //     while(temp_val != null){
    //         Node newNode = new Node(temp_val.data);
    //         newNode.next = reverse_head_main;
    //         reverse_head_main = newNode;
    //         temp_val = temp_val.next;
    //     }
    //     Node head = null;
    //     Node tail = null;
    //     temp_val = reverse_head_main;

    //     while(temp_val != null){
    //         Node newNode = new Node(temp_val.data);
    //         if(head == null){
    //             head = newNode;
    //             tail = newNode;
    //         }
    //         else{
    //             tail.next = newNode;
    //             tail = newNode;
    //         }
    //         temp_val = temp.next;
    //     }
    //     Node temp_val_two = head_two;
    //     Node temp_val_three = head_three;

    //     while(temp_val_two != null && temp_val_three != null){
    //         int sum = temp_val_two.data + temp_val_three.data;
    //         if(sum >= 10){
    //             sum = sum % 10;
    //         }

    //         Node newNode = new Node(sum);
    //         tail.next = newNode;
    //         tail = newNode;

    //         temp_val_two = temp_val_two.next;
    //         temp_val_three = temp_val_three.next;
    //     }
    //     return head;
    // }
    
}
