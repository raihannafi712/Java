package lab6;

public class Player {
    private static int maxPlayer = 11;
    public static int total = 0;
    private String name;
    private String country;
    private int jersey;
    private static String[] player = new String[maxPlayer];

    public Player(String nm , String c , int j){
        name = nm;
        country = c;
        jersey = j;
        player[total] = nm;
        total++;
    }

    public String player_detail(){
        return "Player Name: " + name + "\nJersey Number: " + jersey + "\nCountry: " + country;
    }

    public static void info(){
        System.out.println("Total number of players: " + total);
        System.out.print("Players enlisted so far: ");

        for (int i = 0; i < total; i++) {
            if (total > 1) {
                System.out.print(player[i] + ", ");
            } else {
                 System.out.print(player[i]);
            }
        }
        System.out.println();
    }
}
