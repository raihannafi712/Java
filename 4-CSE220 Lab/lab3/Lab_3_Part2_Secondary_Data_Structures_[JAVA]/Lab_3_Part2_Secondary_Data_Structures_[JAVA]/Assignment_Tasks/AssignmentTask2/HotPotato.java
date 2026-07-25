//YOU NEED TO RUN THIS CLASS TO TEST OUT THE METHODS
package AssignmentTask2;

public class HotPotato{

    public static String hotPotato(String[] players, int k) {

        LinkedListQueue temp_q = new LinkedListQueue();

        for (int i = 0; i < players.length; i++) {
            
            temp_q.enqueue(players[i]);
        }

        for (int i = 0; i < players.length - 1; i++) {
            
            for (int j = 0; j < k; j++) {
                
                temp_q.enqueue(temp_q.dequeue());               /* Basically,removing the front element and adding it in the rear until the person that will be eliminated. */

            }

            String elim = (String) temp_q.dequeue();            /* The eliminated player gets removed */
            System.out.println(elim + " eliminated");
        }

        String winner = (String) temp_q.dequeue();


        return winner;
    }

    public static void main(String[] args) {

        System.out.println(".......Test Case #1.......");
        String[] players1 = {"Ali", "Ben", "Cia", "Dan", "Eli", "Faye"};
        int k1 = 3;
        String winner1 = hotPotato(players1, k1);
        System.out.println("Winner: " + winner1);

        System.out.println(".......Test Case #2.......");
        String[] players2 = {"Ali", "Rafi", "Sara", "Nina"};
        int k2 = 2;
        String winner2 = hotPotato(players2, k2);
        System.out.println("Winner: " + winner2);
    }
}
