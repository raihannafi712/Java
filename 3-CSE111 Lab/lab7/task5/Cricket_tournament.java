package lab7.task5;

public class Cricket_tournament {
    private int mainTeamNumbers;
    private String mainTeamType;

  public Cricket_Tournament() {

    super();
    mainTeamNumbers = 0;
    mainTeamType = "No type";
  }

  public Cricket_Tournament(String name, int mainTeamNumbers, String mainTeamType) {

    super(name);
    this.mainTeamNumbers = mainTeamNumbers;
    this.mainTeamType = mainTeamType;
  }

  public String detail() {

    return "Cricket Tournament Name: " + getName() + "\nNumber of Teams: " + mainTeamNumbers + "\nmainTeamType: " + mainTeamType;
  }
}

public class Tennis_Tournament  {

  private int mainNumberOfPlayers;

  public Tennis_Tournament(String name, int mainNumberOfPlayers) {

    super(name);
    this.mainNumberOfPlayers = mainNumberOfPlayers;
  }

  public String detail() {

    return "Tennis Tournament Name: " + getName() + "\nNumber of Players: " + mainNumberOfPlayers;
  }
}
