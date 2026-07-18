package lab6;

public class Tester {

    // // TASK 1
    // public static void main(String[] args) {
    //     System.out.println("< —--—----1—-------->");
    //     Product product1 = new Product();
    //     product1.displayInfo();
    //     System.out.println("< —--—----2—-------->");
    //     Product product2 = new Product("Laptop", 1200.00);
    //     product2.setQuantity(10);
    //     product2.displayInfo(true); 
    //     System.out.println("< —--—----3—-------->");
    //     System.out.println("Retrieved Price: $" + product2.getPrice());
    //     System.out.println("Retrieved Quantity: " + product2.getQuantity());
    // }




    // // TASK 2
    // public static void main(String args[]){
    //     System.out.println("Total Passenger: "+ Passenger.no_of_passenger);
    //     System.out.println("Total Fare: "+ Passenger.total_fare + " TK");
    //     System.out.println("==========1==========");
    //     Passenger p1 = new Passenger("Lara", 5.6);
    //     p1.passengerDetails();
    //     System.out.println("==========2==========");
    //     Passenger p2 = new Passenger("Kevin", 10.0);
    //     p2.storeBaggageWeight(6.8);
    //     p2.passengerDetails();
    //     System.out.println("==========3==========");
    //     Passenger p3 = new Passenger("Robin", 2.3);
    //     p3.storeBaggageWeight(5.0);
    //     p3.passengerDetails();
    //     System.out.println("==========4==========");
    //     System.out.println("Total Passenger: "+ Passenger.no_of_passenger);
    //     System.out.println("Total Fare: "+ Passenger.total_fare + " TK");
    //   }




    // // TASK 3

    // public static void main(String[] args) {
    //     System.out.println("Total Books Sold: " + Book.total_books_sold);
    //     System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    //     System.out.println("==========1==========");
    
    //     Book b1 = new Book("Java Programming", 10); // 10% discount
    //     b1.bookDetails();
    
    //     System.out.println("==========2==========");
    
    //     Book b2 = new Book("Python Programming", 15); // 15% discount
    //     b2.bookDetails();
    
    //     System.out.println("==========3==========");
        
    //     Book b3 = new Book("Data Structures", 5); // 5% discount
    //     b3.bookDetails();
    
    //     System.out.println("==========4==========");
    //     System.out.println("Total Books Sold: " + Book.total_books_sold);
    //     System.out.println("Total Revenue: "+Book.total_revenue + " TK");
    //     }





    // // TASK 4

    //  public static void main(String[] args) {
    //     System.out.println("Total Circle: "+ Circle.count);
    //     Circle c1 = new Circle(4);
    //     System.out.println("1---------------");
    //     System.out.println("Total Circle: "+ Circle.count);
    //     System.out.println("First circle radius: " + c1.getRadius());
    //     System.out.println("First circle area: " + c1.area());
    //     System.out.println("2---------------");
    //     Circle c2 = new Circle(5);
    //     System.out.println("Total Circle: "+ Circle.count);
    //     System.out.println("Second circle radius: " + c2.getRadius());
    //     System.out.println("Second circle area: " + c2.area());
    //     System.out.println("3---------------"); 
    // }





    // // TASK 5        /* Needs to be fixed */

    // public static void main(String args[]){
    //     Borrower.bookStatus();
    //     System.out.println("*********1*********");
    //     Borrower b1 = new Borrower("Nabila");
    //     b1.borrowBook("Pather Panchali");
    //     b1.borrowBook("Anandmath");
    //     b1.borrowerDetails();
    //     System.out.println("*********2*********");
    //     Borrower b2 = new Borrower("Sadia");
    //     b2.borrowBook("Anandmath");
    //     b2.borrowBook("Durgesh Nandini");
    //     b2.borrowBook("Pather Panchali");
    //     b2.borrowerDetails();
    //     System.out.println("*********3*********");
    //   System.out.println(Borrower.remainingBooks("Anandmath")+" copies of Anandmath is remaining.");
    //     System.out.println("*********4*********");
    //     Borrower b3 = new Borrower("Anika");
    //     b3.borrowBook("Anandmath");
    //     Borrower.bookStatus();
    //     System.out.println("*********5*********");
    //     Borrower b4 = new Borrower("Oishi");
    //     b4.borrowBook("Anandmath");
    //     b4.borrowBook("Durgesh Nandini");
    //     b4.borrowerDetails();
    //   }  






//     // TASK 6

//     public static void main(String[] args) {
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//         System.out.println("1====================");
//         Cargo a = new Cargo("Industrial Machinery", 4.5);
//         a.details();
//         System.out.println("2====================");
//         a.load();
//         System.out.println("3====================");
//         Cargo b = new Cargo("Steel Ingot", 2.7);
//         b.details();
//         System.out.println("4====================");
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//         System.out.println("5====================");
//         b.load();
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//         System.out.println("6====================");
//         Cargo c = new Cargo("Tree Trunks", 3.6);
//         c.load();
//         System.out.println("7====================");
//         c.details();
//         b.details();
//         System.out.println("8====================");
//         Cargo d = new Cargo("Processed Goods", 1.8);
//         d.load();
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//         System.out.println("9====================");
//         b.unload();
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//         System.out.println("10====================");
//         c.load();
//         System.out.println("11====================");
//         b.details();
//         System.out.println("Cargo Capacity: "+ Cargo.capacity());
//       }






    // // TASK 7

    //  public static void main(String[] args) {
    //     Student.printDetails();
    //     System.out.println("--------------------");
    //     Student mikasa = new Student("Mikasa", 3.75);
    //     mikasa.individualDetail();
    //     System.out.println("--------------------");
    //     Student.printDetails();
    //     System.out.println("--------------------");
    //     Student harry = new Student("Harry", 2.5, "Charms");
    //     harry.individualDetail();
    //     System.out.println("--------------------");
    //     Student.printDetails();
    //     System.out.println("--------------------");
    //     Student levi = new Student("Levi", 3.33);
    //     levi.individualDetail();
    //     System.out.println("--------------------");
    //     Student.printDetails();
    // }





    // // TASK 8

    // public static void main(String[] args) {
    //     System.out.println("Total number of players: " + Player.total);
    //     System.out.println("1------------------");
    //     Player p1 = new Player("Neymar", "Brazil",5);
    //     System.out.println(p1.player_detail());
    //     System.out.println("===================");
    //     Player.info();
    //     System.out.println("2------------------");
    //     Player p2 = new Player("Ronaldo", "Portugal", 7);
    //     System.out.println(p2.player_detail());
    //     System.out.println("===================");
    //     Player.info();
    //     System.out.println("3------------------");
    //     Player p3 = new Player("Messi", "Argentina", 6);
    //     System.out.println(p3.player_detail());
    //     System.out.println("===================");
    //     Player.info();
    //     System.out.println("4------------------");
    //     Player p4 = new Player("Mbappe", "France", 10);
    //     System.out.println(p4.player_detail());
    //     System.out.println("===================");
    //     Player.info();
    //   }

}
