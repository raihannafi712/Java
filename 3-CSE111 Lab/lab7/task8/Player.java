package lab7.task8;

public class Player {
    private int goalTotalCount;
    private int matchTotalCount;
    private double goalMainRatio;
  
    public Player(String team, String name, String role, int goalTotalCount, int matchTotalCount) {

      super(team, name, role);
      this.goalTotalCount = goalTotalCount;
      this.matchTotalCount = matchTotalCount;
      this.goalMainRatio = 0.0;
      calculateEarning();
    }
  
    public void calculateRatio() {

      goalMainRatio = (double) goalTotalCount / matchTotalCount;
    }
  
    private void calculateEarning() {

      earningPerMatch = (goalTotalCount * 1000) + (matchTotalCount * 10);
    }
  
    public void printDetails() {

      System.out.println(getNameTeam());
      System.out.println("Team Role: " + role);
      System.out.println("Total Goal: " + goalTotalCount + ", Total Played: " + matchTotalCount);
      System.out.printf("Goal Ratio: %.2f\n", goalMainRatio);
      System.out.println("Match Earning: " + (int)earningPerMatch + "K");
    }
  }
  
  public class Manager extends SportsPerson {

    private int totalMatchWinInfo;
  
    public Manager(String team, String name, String role, int totalMatchWinInfo) {

      super(team, name, role);
      this.totalMatchWinInfo = totalMatchWinInfo;
      earningPerMatch = totalMatchWinInfo * 1000;
    }
  
    public void printDetails() {

      System.out.println(getNameTeam());
      System.out.println("Team Role: " + role);
      System.out.println("Total Win: " + totalMatchWinInfo);
      System.out.println("Match Earning: " + (int)earningPerMatch + "K");
    }
}
