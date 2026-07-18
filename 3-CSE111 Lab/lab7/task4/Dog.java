package lab7.task4;

public class Dog {
    private String dogNameMain;

    public Dog() {

      System.out.println("The dog says hello!");
    }
  
    public String getName() {

      return dogNameMain;
    }
  
    public void updateSound(String newSound) {

      sound = newSound;
    }
  
    @Override
    public void details() {

      System.out.println("Name: " + dogNameMain);
      super.details();
    }
}
