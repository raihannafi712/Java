package lab6;

public class Borrower {
    public static String[] book_name = {"Pather Panchali" , "Durgesh Nandini" ,"Anandmath"};
    public static int[] book_count = {3 , 3 , 3};
    private String bName;
    public String[] perPersonBook = new String[3];

    public Borrower(String nm){
        this.bName = nm;
    }

    public static void bookStatus(){
        System.out.println("Available books:");
        for (int i = 0; i < book_count.length; i++) {
            System.out.println(book_name[i] + ": " + book_count[i]);
        }
    }

    public void borrowBook(String nm){
        for (int i = 0; i < book_name.length; i++) {
            int x = 0;

            if (book_name[i] == nm) {
                if (book_count[i] > 0) {
                    perPersonBook[x] = nm;
                    book_count[i] --;
                    x++;
                } else {
                    System.out.println("This book is not available.");
                }
            }
        }
    }

    public void borrowerDetails(){
        System.out.println("Name: " + bName);
        System.out.println("Books Borrowed: ");

        for (int i = 0; i < perPersonBook.length; i++) {
            if (perPersonBook[i] == " " ){
                System.out.println();
            }else{
                System.out.println(perPersonBook[i]);
            }
        }

    }

    public static int remainingBooks(String nm){
        for (int i = 0; i < book_count.length; i++) {
            if (book_name[i] == nm) {
                return book_count[i];
            }
        }
        return 0;
    }
}
