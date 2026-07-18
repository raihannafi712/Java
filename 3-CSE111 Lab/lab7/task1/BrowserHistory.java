package lab7.task1;

public class BrowserHistory {

  public int count = 0;
  public int maxPage;
  public String[] history;
  public int currentIndex = -1;


  public BrowserHistory(int n){
    maxPage = n;
    history = new String[maxPage];
  }

  public void showHistory(){
    if (count > 0) {
      System.out.println("Browsing History: ");
      for (int i = 0; i < count; i++) {
        System.out.println(history[i]);
      }
    } else {
      System.out.println("No web pages visited yet!");
    }
  }

  public void currentWeb(){
    if (count > 0) {
      System.out.println("Current web page: " + history[currentIndex]);
    }else{
      System.out.println("You have not visited any website yet!");
    }
  }

  public void visitWeb(String w){
    if (count < maxPage) {
      history[count] = w;
      currentIndex = count;
      count++;
      System.out.println("Visited: " + w);
    }else{
      System.out.println("History is full. Cannot visit");
      System.out.println(w);
    }
  }

  public void back(){
    if (count > 0) {
      count--;
      currentIndex--;
    } else if (currentIndex < 0){
      System.out.println("You have not visited any website yet!");
    }
  }
}  
