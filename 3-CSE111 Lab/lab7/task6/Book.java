package lab7.task6;

public class Book {
    private String mainisbnInfo;
    private String mainPublisherInfo;

  public Book(int id, String title, int price, String mainisbnInfo, String mainPublisherInfo) {
    
    super(id, title, price);
    this.mainisbnInfo = mainisbnInfo;
    this.mainPublisherInfo = mainPublisherInfo;
  }

  public String printDetail() {

    return getIdTitlePrice() + " ISBN: " + mainisbnInfo + " Publisher: " + mainPublisherInfo;
  }
}

public class CD extends Product {
  private String bandMainInfo;
  private int durationMainInfo;
  private String genre;

  public CD(int id, String title, int price, String bandMainInfo, int durationMainInfo, String genre) {

    super(id, title, price);
    this.bandMainInfo = bandMainInfo;
    this.durationMainInfo = durationMainInfo;
    this.genre = genre;
  }

  public String printDetail() {

    return getIdTitlePrice() + "\nBand: " + banbandMainInfo + " Duration: " + durationMainInfo + " minutes Genre: " + genre;
  }
}
