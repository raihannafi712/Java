import java.util.Stack;

public class lab_4 {

    // PART 1

    // TASK 1
    public void remove( int key ){
        int idx = hashFunction(key);

        if(ht[idx].key.equals(key)){

            ht[idx]=ht[idx].next;
            return;
        }

        PairNode i=ht[idx];

        for(i= ht[idx];i.next!= null;i=i.next){

            if(i.next.key.equals(key)){
                i.next=i.next.next;
                return;
            }
        }
    }





    // TASK 2
    private int hashFunction(int key) {

        int x = ht.length;
        return (key + 3) % x;
    }




    // PART 2

    // TASK 1
    public static Stack conditional_reverse(Stack stack) {
        Stack temp = new Stack();
        Stack main_stack_result = new Stack();
        int length_main_s = stack.size();

        for (int i = 0; i<length_main_s; i++) {

            int current = (int) stack.pop();
            if (!temp.isEmpty() && (int) temp.peek() == current) {

                temp.pop();
            } else {
                temp.push(current);
            }
        }

        int main_temp_size = temp.size();
        for (int i = 0;i <main_temp_size; i++) {

            main_stack_result.push(temp.pop());
        }

        return main_stack_result;
    }



    // TASK 2
    public static String hotPotato(String[] players, int k) {

        LinkedListQueue player_main_queue = new LinkedListQueue();

        for (int i = 0; i <players.length; i++) {

            player_main_queue.enqueue(players[i]);
        }
        for (int i = 0;i <players.length - 1; i++) {

            for (int j = 0; j < k - 1; j++) {
                player_main_queue.enqueue(player_main_queue.dequeue());
            }

            String eliminated = (String) player_main_queue.dequeue();
            System.out.println(eliminated + " eliminated. ");
        }

        String player_main_w = (String) player_main_queue.dequeue();
        System.out.println("Winner: " + player_main_w);

        return player_main_w;
    }





    // TASK 3
    public static void dance_pair(Stack stack) {

        LinkedListQueue femaleQueue = new LinkedListQueue();
        LinkedListQueue maleQueue = new LinkedListQueue();

        Stack temp = new Stack();
        int main_dance_count = 1;
        int size = stack.size();

        for (int i = 0;i <size; i++) {

            temp.push(stack.pop());
        }

        int tempSize = temp.size();

        for (int i = 0;i <tempSize; i++) {

            Dancer current = (Dancer) temp.pop();

            if (!stack.isEmpty()) {

                Dancer top = (Dancer) stack.peek();
                if (current.gender != top.gender) {
                    stack.pop();
                    if (current.gender == 'M') {

                        System.out.println("#" + main_dance_count + ": " + top.name + "(F-" + top.id + ") & " + current.name + "(M-" + current.id + ")");
                    } else {

                        System.out.println("#" + main_dance_count + ": " + current.name + "(F-" + current.id + ") & " + top.name + "(M-" + top.id + ")");
                    }
                    main_dance_count++;
                } else if (current.gender =='F') {
                    femaleQueue.enqueue(current);
                    stack.push(top);
                    stack.pop();
                } else {

                    if (!femaleQueue.isEmpty()) {

                        Dancer female = (Dancer) femaleQueue.dequeue();
                        System.out.println("#" + main_dance_count + ": " + female.name + "(F-" + female.id + ") & " + current.name + "(M-" + current.id + ")");
                        main_dance_count++;
                    } else {

                        maleQueue.enqueue(current);
                    }
                    stack.pop();
                }
            } else {

                stack.push(current);
            }
        }

        int female_dance_s = femaleQueue.size();
        int male_dance_s = maleQueue.size();

        if (female_dance_s > 0) {

            System.out.println("\nUnpaired Female:");
            for (int i = 0; i <female_dance_s; i++) {

                Dancer d = (Dancer) femaleQueue.dequeue();
                System.out.print(d.name + "(F-" + d.id + ")");
                if (i <female_dance_s- 1) {
                    System.out.print(", ");
                }
            }
        }

        if (male_dance_s> 0) {
            System.out.println("Unpaired Male:");
            for (int i = 0; i <male_dance_s; i++) {

                Dancer d = (Dancer) maleQueue.dequeue();
                System.out.print(d.name + "(M-" + d.id + ")");
                if (i < male_dance_s - 1) {

                    System.out.print(", ");
                }
            }
        }
    }


   






















}
