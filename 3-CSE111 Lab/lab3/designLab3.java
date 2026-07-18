package lab3;

    // TASK 1

    // class BankAccount{
    //     public int accountNum = 0;
    //     public String accountType = "Not Set";


    //     public String printDetails(){
    //         // System.out.println("Account No: " + accountNum );
    //         // System.out.println("Type: " + accountType );
    //         return "Account No: " + accountNum + "\n" + "Type: " + accountType;
    //     }

    //     public void setInfo(int accNum , String accType ){
    //         accountNum = accNum;
    //         accountType = accType;
    //         System.out.println("Account information updated!");
    //     }
    // }



    // TASK 2

    // class Shape{
    //     public String shapeName;
    //     public double shapeArea;



    //     public void setParameters(String type , int infoOne ){
    //         shapeName = type;
    //         shapeArea = (3.141 * (infoOne*infoOne));
    //     }
    //     public void setParameters(String type , int infoOne , int infoTwo ){
    //         shapeName = type;
    //         shapeArea = (0.5 * infoOne * infoTwo);
    //     }
    //     public void setParameters(String rectangleName  , double width , double height ){
    //         shapeName = rectangleName;
    //         shapeArea = (width * height);
    //     }

    //     public String details(){

    //         return "Shape name: " + shapeName + "\n" + "Area: " + shapeArea;

    //     }
    // }




    // TASK 3

    // class Shelf{
    //     public int capacity = 0;
    //     public int shelfBooks = 0;
    
    //     public void showDetails(){
    //       System.out.println("Shelf capacity: " + capacity);
    //       System.out.println("Number of books: " + shelfBooks);
    //     }
    
    //     public void addBooks(int shelfAdd){

    //         if (capacity == 0) {
    //             System.out.println("Zero capacity. Cannot add books.");
    //         } else if (capacity >= (shelfBooks + shelfAdd)) {

    //             shelfBooks += shelfAdd; 
    //             System.out.println(shelfAdd + " books added to shelf");

    //         } else {
    //             System.out.println("Exceeds capacity");
    //         }
    //     }
    //   }




    // TASK 4

    // class Student{
    //     public String studentName = "Not set";
    //     public String studentDept = "CSE";
    //     public double studentCgpa = 0;
    //     public double studentCredit = 9;
    //     public String studentScholarship = "Not set";


    //     public void showDetails(){
    //         System.out.println("Name: " + studentName);
    //         System.out.println("Department: " + studentDept);
    //         System.out.println("CGPA: " + studentCgpa);
    //         System.out.println("Credits: " + studentCredit);
    //         System.out.println("Scholarship status: " + studentScholarship);
    //     }

    //     public void updateDetails(String name , double cg , double credits){
    //         studentName = name;
    //         studentCgpa = cg;
    //         studentCredit = credits;
    //     }
    //     public void updateDetails(String name , double cg){
    //         studentName = name;
    //         studentCgpa = cg;
    //     }
    //     public void updateDetails(String name , double cg , double credits , String dept){
    //         studentName = name;
    //         studentCgpa = cg;
    //         studentCredit = credits;
    //         studentDept = dept;
    //     }

    //     public void checkScholarshipEligibility(){
    //         if (studentCgpa >= 3.5 && studentCredit > 10) {
    //             if (studentCgpa >= 3.5 && studentCgpa < 3.7) {
    //                 studentScholarship = "need-based scholarship";
    //                 System.out.println(studentName + " is eligible for need-based scholarship.");
    //             }else if (studentCgpa >= 3.7) {
    //                 studentScholarship = "Merit based scholarship";
    //                 System.out.println(studentName + " is eligible for Merit based scholarship.");
    //             }
    //         }else{
    //             System.out.println("Not eligible for scholarship");
    //         }
    //     }
    // }




    // TASK 5

    // class Library{
    //     public int booksCap = 0;
    //     public int booksTotal = 0;
    //     public String[] bookList;
    //     public int count = 0;



    //     public void setBookCapacity(int booksCap){
    //         this.booksCap = booksCap;
    //         bookList =  new String[booksCap];
    //     }

    //     public void addBook(String add ){
    //         if (booksCap == 0) {
    //             System.out.println("Book capacity is 0");
    //         } else if (booksCap >= (booksTotal + 1) ) {
    //             booksTotal += 1;
    //             bookList[count] = add;
    //             count++;
    //             System.out.println("Book '" + add + "' added to the library");
    //         }else {
    //             System.out.println("Exceeds maximum capacity. You can't add more than " +  booksCap + " books");
    //         }
    //     }

    //     public void printDetail(){
    //         System.out.println("Maximum Capacity: " + booksCap);
    //         System.out.println("Total books: " + booksTotal);
    //         System.out.println("Booklist: ");

    //         for (int i = 0; i < booksTotal; i++) {
    //             System.out.println(bookList[i]);
    //         }
    //     }
    // }




    // TASK 6

    // /* public */ class TaxiLagbe{
    //     public String taxiNum;
    //     public String taxiArea;
    //     public int taxiPassenger = 0;
    //     public int taxiPassMax = 4;
    //     public String[] taxiPassName = new String[taxiPassMax];
    //     public int count = 0;
    //     public double taxiFare = 0;



    //     public void storeInfo(String taxiNum , String taxiArea){
    //         this.taxiNum = taxiNum;
    //         this.taxiArea = taxiArea;
    //     }

    //     public void printDetails(){
    //         System.out.println("Taxi number; " + taxiNum);
    //         System.out.println("This taxi can cover " + taxiArea + " area");
    //         System.out.println("Total passengers: " + taxiPassenger );
    //         System.out.println("Pasenger Lists: ");

    //         for (int i = 0; i < count; i++) {
    //             System.out.print(taxiPassName[i] + " ");
    //         }
    //         System.out.println();

    //         System.out.println("Total collected fare: " + taxiFare);
    //     }

    //     public void addPassenger(String name , double fare){
    //         if ((taxiPassenger + 1 ) <= taxiPassMax) {
    //             taxiPassenger += 1;
    //             taxiPassName[count] = name;
    //             count++;
    //             taxiFare += fare;
    //             System.out.println("Dear " + name + "! welcome to TaxiLagbe");

    //         } else {
    //             System.out.println("Taxi Full! No more passengers can be added");
    //         } 
    //     }
    //     public void addPassenger(String name1 , double fare1 , String name2 , double fare2){
    //         if ((taxiPassenger + 2 ) <= taxiPassMax) {
    //             taxiPassenger += 2;
    //             taxiPassName[count] = name1;
    //             count++;
    //             taxiPassName[count] = name2;
    //             count++;
    //             taxiFare += fare1 + fare2;
    //             System.out.println("Dear " + name1 + "! welcome to TaxiLagbe");
    //             System.out.println("Dear " + name2 + "! welcome to TaxiLagbe");

    //         } else {
    //             System.out.println("Taxi Full! No more passengers can be added");
    //         } 
    //     }
    // }





    // TASK 7

    // /* public */ class Cart{
    //     public int cartNum;
    //     public int itemCount = 0;
    //     public int itemMax = 3;
    //     public double itemTotalPrice = 0;
    //     public String[] itemName = new String[itemMax];
    //     public double[] itemPrice = new double[itemMax];
    //     public int count = 0;
    //     public double itemDiscount = 0;


    //     public void create_cart(int cartNum){
    //         this.cartNum = cartNum;
    //     }

    //     public void addItem(String itemName , double itemPrice){

    //         if ((itemCount + 1) <= itemMax ) {

    //             this.itemCount += 1;
    //             itemTotalPrice += itemPrice;
    //             this.itemName[count] = itemName;
    //             this.itemPrice[count] = itemPrice;
    //             count++;

    //             System.out.println(itemName + " added to cart " + cartNum );
    //             System.out.println("You have " + itemCount + " item(s) in your cart now.");  
    //         } else {
    //             System.out.println("You already have 3 items on your cart");
    //         }
    //     }
    //     public void addItem(double itemPrice , String itemName){

    //         if ((itemCount + 1) <= itemMax ) {

    //             this.itemCount += 1;
    //             itemTotalPrice += itemPrice;
    //             this.itemName[count] = itemName;
    //             this.itemPrice[count] = itemPrice;
    //             count++;

    //             System.out.println(itemName + " added to cart " + cartNum );
    //             System.out.println("You have " + itemCount + " item(s) in your cart now.");  
    //         } else {
    //             System.out.println("You already have 3 items on your cart");
    //         }
    //     }

    //     public void cartDetails(){
    //         System.out.println("Your cart(c" + cartNum + ") : ");
    //         for (int i = 0; i < count ; i++) {
    //             System.out.println(itemName[i] + " - " + itemPrice[i] );
    //         }
    //         System.out.println("Discopunt Applied: " + itemDiscount + "%");
    //         System.out.println("Total price: " + itemTotalPrice);
    //     }

        
    //     public void giveDiscount(double discount){
    //         itemDiscount = discount;
    //         itemTotalPrice = itemTotalPrice - (itemTotalPrice*(discount/100.00));
    //     }
    // }




    // TASK 8






















    // Tracing

    // TASK 9 

    // public class Task9 {
    //     public int temp = 4;
    //     public int sum;
    //     public int y;
    //     public int x;
    //     public void methodA(int m){
    //         int [] n = {2,5};
    //         int x = 0;
    //         y = y + m + this.methodB(x,m++)+(temp)+y;     /* when methodB is called, methodA() stops until metahodB() returns a value */
    //         x = this.x + 2 + (++n[0]);
    //         sum = sum + x + y;
    //         n[0] = sum + 2;
    //         System.out.println(n[0] + x + " " + y+ " " + sum);
    //         }
    //     public int methodB(int m, int n){
    //         int [] y = {1};
    //         this.y = y[0] + this.y + m;
    //         x = this.y + 2 + temp - n;
    //         sum = x + y[0] + this.sum;
    //         System.out.println( y[0]+ x + " " + y[0] + " " +sum);
    //         return y[0];
    //     }
    //  }
     
     



public class designLab3 {
    
}
