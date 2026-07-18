
public class lab_3 {

    // LAB 3

    // TASK 5odfspofsp
    public static void sumOddAppend(Node singly_head) {
        Node current=singly_head.next;
        Node prev=singly_head;
        int sum=0;
        int x=0;
        Node temp_val_one=singly_head;
        Node summation;

        while(current != singly_head){
          x=(int)current.elem;
          if(x%2==0){
            prev=current;}
          else{
            sum+=x;
            prev.next=current.next;}
            current=current.next;}
        temp_val_one=singly_head;

        while(temp_val_one.next != singly_head){
          temp_val_one=temp_val_one.next;
        }
        summation=new Node(sum);
        temp_val_one.next=summation;
        summation.next=singly_head;
    }


    // TASK 6
     public static void pairJoin(Node dummy_head_one, Node dummy_head_two) {
        Node first=dummy_head_one.next;
        Node second=dummy_head_two.next;
        Node x;
        Node y;
        Node c;

        while(first!=null && second!=null){
            x=first.next;
            y=second.next;
            first.next=second;
            second.prev=first;
            if(x!=null){
                second.next=x;
                x.prev=second;
            }
            first=x;
            second=y;
        }
        c=dummy_head_one;

        while(c.next!= null){
            c=c.next;
        }
        c.next=dummy_head_one;
        dummy_head_one.prev=c;
    }


    // TASK 7
    public static void rangeMove(Node dummy_head_one, int start, int end) {
        int first_test=0;
        Node new_node_n;
        Node x=dummy_head_one.next;
        Node c;
        int i=0;
        Node new_node_next;
        int val;

        while(x!=dummy_head_one){
            x=x.next;
            first_test++;
        }
        new_node_n=dummy_head_one.next;

        for(i=0;i<first_test;i++){
          new_node_next=new_node_n.next;
          val=(int)new_node_n.elem;
          
            if(val>=start && val<=end){
                new_node_n.prev.next=new_node_n.next;
                new_node_n.next.prev=new_node_n.prev;
                c=dummy_head_one.prev;
                c.next=new_node_n;
                new_node_n.prev=c;
                new_node_n.next=dummy_head_one;
                dummy_head_one.prev=new_node_n;
            }
            new_node_n=new_node_next;
        }
    }
}
