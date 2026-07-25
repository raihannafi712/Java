import HelperDataStructures.Stack;
import HelperDataStructures.Queue;

public class DancePairs {

    public static void dance_pair(Stack stk) {


    Stack main_working = new Stack();
    Queue queue_fem = new Queue();
    Queue queue_mal = new Queue();
    int count = 1;

    while (stack.isEmpty() != true) {

        Dancer dan_curr = (Dancer) stack.pop();

        if (main_working.isEmpty()) {

            main_working.push(dan_curr);
            continue;
        }

        Dancer dan_top = (Dancer) main_working.peek();

        if (dan_top.getGender() != dan_curr.getGender()) {

            main_working.pop();
            System.out.println("#" + count + ": " + dan_top + " & " + dan_curr);
            count++;
        } else if (dan_top.getGender() == 'F') {

            main_working.pop();
            queue_fem.enqueue(dan_top);
            main_working.push(dan_curr);
        } else {

            main_working.pop();
            if (queue_fem.isEmpty() != true) {

                Dancer partner = (Dancer) queue_fem.dequeue();
                System.out.println("#" + count + ": " + dan_top + " & " + partner);
                count++;

            } else {

                queue_mal.enqueue(dan_top);
            }
            main_working.push(dan_curr);
        }
    }

    if (main_working.isEmpty() != true) {

        Dancer dan_leftover = (Dancer) main_working.pop();
        if (dan_leftover.getGender() == 'F') queue_fem.enqueue(dan_leftover);
        else queue_mal.enqueue(dan_leftover);
    }

    if (queue_fem.isEmpty() != true) {

        System.out.println("Unpaired Female:");
        String result = "";

        while (!queue_fem.isEmpty()) {

            result = result + queue_fem.dequeue();
            if (!queue_fem.isEmpty()) result = result + ", ";
        }
        System.out.println(result);
    }

    if (queue_mal.isEmpty() != true) {

        System.out.println("Unpaired Male:");
        String final_res = "";

        while (queue_mal.isEmpty() != true) {

            final_res = final_res + queue_mal.dequeue();
            if (queue_mal.isEmpty() != true) final_res = final_res + ", ";
        }

        System.out.println(final_res);
    }
    






























        
    // LinkedListQueue queue_fem = new LinkedListQueue();
    // LinkedListQueue maleQueue = new LinkedListQueue();

    // Stack temp = new Stack();
    // int main_dance_count = 1;
    // int size = stack.size();

    // for (int i = 0;i <size; i++) {

    //     temp.push(stack.pop());
    // }

    // int tempSize = temp.size();

    // for (int i = 0;i <tempSize; i++) {

    //     Dancer current = (Dancer) temp.pop();

    //     if (!stack.isEmpty()) {

    //         Dancer top = (Dancer) stack.peek();
    //         if (current.gender != top.gender) {
    //             stack.pop();
    //             if (current.gender == 'M') {

    //                 System.out.println("#" + main_dance_count + ": " + top.name + "(F-" + top.id + ") & " + current.name + "(M-" + current.id + ")");
    //             } else {

    //                 System.out.println("#" + main_dance_count + ": " + current.name + "(F-" + current.id + ") & " + top.name + "(M-" + top.id + ")");
    //             }
    //             main_dance_count++;
    //         } else if (current.gender =='F') {
    //             queue_fem.enqueue(current);
    //             stack.push(top);
    //             stack.pop();
    //         } else {

    //             if (!femaleQueue.isEmpty()) {

    //                 Dancer female = (Dancer) femaleQueue.dequeue();
    //                 System.out.println("#" + main_dance_count + ": " + female.name + "(F-" + female.id + ") & " + current.name + "(M-" + current.id + ")");
    //                 main_dance_count++;
    //             } else {

    //                 maleQueue.enqueue(current);
    //             }
    //             stack.pop();
    //         }
    //     } else {

    //         stack.push(current);
    //     }
    // }

    // int female_dance_s = femaleQueue.size();
    // int male_dance_s = maleQueue.size();

    // if (female_dance_s > 0) {

    //     System.out.println("\nUnpaired Female:");
    //     for (int i = 0; i <female_dance_s; i++) {

    //         Dancer d = (Dancer) femaleQueue.dequeue();
    //         System.out.print(d.name + "(F-" + d.id + ")");
    //         if (i <female_dance_s- 1) {
    //             System.out.print(", ");
    //         }
    //     }
    // }

    // if (male_dance_s> 0) {
    //     System.out.println("Unpaired Male:");
    //     for (int i = 0; i <male_dance_s; i++) {

    //         Dancer d = (Dancer) maleQueue.dequeue();
    //         System.out.print(d.name + "(M-" + d.id + ")");
    //         if (i < male_dance_s - 1) {

    //             System.out.print(", ");
    //         }
    //     }
    // }

    }

    public static void main(String[] args) {
        System.out.println("===== Test Case 1 =====");
        Stack stack1 = new Stack();
        stack1.push(new Dancer("Arif", 'M', 10));
        stack1.push(new Dancer("Maya", 'F', 54));
        stack1.push(new Dancer("Sara", 'F', 15));
        stack1.push(new Dancer("Liam", 'M', 24));
        stack1.push(new Dancer("Omar", 'M', 44));
        stack1.push(new Dancer("Nina", 'F', 12)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack1 );
        System.out.println("\nExpected Output:");
        System.out.println("#1 Nina(F-12) & Omar(M-44)\n#2 Liam(M-24) & Sara(F-15)\n#3 Maya(F-54) & Arif(M-10)");
        System.out.println("\nYour Output:\n");
        dance_pair(stack1);


        System.out.println("\n===== Test Case 2 =====");
        Stack stack2 = new Stack();
        stack2.push(new Dancer("Kazi", 'M', 45));
        stack2.push(new Dancer("Lara", 'F', 43));
        stack2.push(new Dancer("Nina", 'F', 29));
        stack2.push(new Dancer("Sami", 'M', 53));
        stack2.push(new Dancer("Arif", 'M', 51));
        stack2.push(new Dancer("Omar", 'M', 9));
        stack2.push(new Dancer("Lina", 'F', 12));
        stack2.push(new Dancer("Mina", 'F', 54));
        stack2.push(new Dancer("Rita", 'F', 43)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack2 );
        System.out.println("\nExpected Output:");
        System.out.println("#1: Lina(F-12) & Omar(M-09)\n#2: Arif(M-51) & Rita(F-43)\n#3: Sami(M-53) & Nina(F-29)\n#4: Lara(F-43) & Kazi(M-45)\nUnpaired Female:\nMina(F-54)");
        System.out.println("\nYour Output:\n");
        dance_pair(stack2);


        System.out.println("\n===== Test Case 3 =====");
        Stack stack3 = new Stack();
        stack3.push(new Dancer("Wafi", 'M', 13));
        stack3.push(new Dancer("Anan", 'M', 11));
        stack3.push(new Dancer("Nina", 'F', 75));
        stack3.push(new Dancer("Kazi", 'M', 32));
        stack3.push(new Dancer("Ali", 'M', 11));
        stack3.push(new Dancer("Maya", 'F', 65));
        stack3.push(new Dancer("Rafi", 'M', 23));
        stack3.push(new Dancer("Omar", 'M', 16));
        stack3.push(new Dancer("Lina", 'F', 52));
        stack3.push(new Dancer("Sara", 'F', 43)); // TOP
        System.out.println("Given Stack of Dancers");
        printStack( stack3 );
        System.out.println("\nExpected Output:");
        System.out.println("#1: Lina(F-52) & Omar(M-16)\n#2: Rafi(M-23) & Maya(F-65)\n#3: Alim(M-11) & Sara(F-43)\n#4: Kazi(M-32) & Nina(F-75)\nUnpaired Male:\nAnan(M-11), Wafi(M-13)");
	System.out.println("\nYour Output:\n");
        dance_pair(stack3);
    }
    
    //Actually Stack doesn't really have this type of print method
    //It's only being used to show you the Stack Visually
    public static void printStack(Stack stack) {
        if (stack==null || stack.isEmpty()) {
            return; //remove this line once your're done
        }
        Object elem = stack.pop();
        System.out.printf("| %2s |\n",elem);
        printStack(stack);
        stack.push(elem);
    }

}
