package lab7.task2;

public class CustomerService {
  private String[] customerQueueMain;
  private int count;

  public CustomerService(int size) {
    customerQueueMain = new String[size];
    count = 0;
  }

  public void addCustomer(String name) {
    if (count < customerQueueMain.length) {
      customerQueueMain[count] = name;
      count++;
      System.out.println("Added: " + name);
    } else {
      System.out.println("Queue is full. Cannot add " + name);
    }
  }

  public void serveCustomer() {
    if (count == 0) {
      System.out.println("No customers to serve");
    } else {
      System.out.println("Serving " + customerQueueMain[0]);
      for (int i = 1; i < count; i++) {
        customerQueueMain[i - 1] = customerQueueMain[i];
      }
      customerQueueMain[count - 1] = null;
      count--;
    }
  }
}
