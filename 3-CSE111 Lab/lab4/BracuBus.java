package lab4;

// TASK 7
// public class BracuBus {
//     String bracuStudentRoute;
//     int studentCapacity;
//     int bracuStudentCount;
//     BracuStudent[] bracuBusPassengers;

//     public BracuBus(String bracuStudentRoute) {

//         this.bracuStudentRoute = bracuStudentRoute;
//         this.studentCapacity = 2;
//         this.bracuBusPassengers = new BracuStudent[studentCapacity];
//         this.bracuStudentCount = 0;
//     }

//     public BracuBus(String bracuStudentRoute, int studentCapacity) {

//         this.bracuStudentRoute = bracuStudentRoute;
//         this.studentCapacity = studentCapacity;
//         this.bracuBusPassengers = new BracuStudent[studentCapacity];
//         this.bracuStudentCount = 0;
//     }

//     public void showDetails() {

//         System.out.println("Bus Route: " + bracuStudentRoute);
//         System.out.println("Passenger Count: " + bracuStudentCount + " (Max: " + studentCapacity + ")");
//         System.out.println("Passengers on Board: ");

//         for (int i = 0; i < bracuStudentCount; i++) {

//             System.out.print(bracuBusPassengers[i].bracuStudentName + " ");
//         }
//         System.out.println();
//     }

//     public void board() {

//         System.out.println("No passengers");
//     }

//     public void board(BracuStudent s1) {

//         if (bracuStudentCount >= studentCapacity) {

//             System.out.println("Bus is full!");
//         } else if (!s1.bracuStudentPass) {

//             System.out.println("You don't have a bus pass!");
//         } else if (!s1.bracuStudentHome.equals(bracuStudentRoute)) {

//             System.out.println("You got on the wrong bus!");
//         } else {

//             bracuBusPassengers[bracuStudentCount] = s1;
//             bracuStudentCount++;
//             System.out.println(s1.bracuStudentName + " boarded the bus.");
//         }
//     }

//     public void board(BracuStudent s1, BracuStudent s2) {
        
//         board(s1);
//         if (bracuStudentCount < studentCapacity) {

//             board(s2);
//         } else if (s2.bracuStudentPass && s2.bracuStudentHome.equals(bracuStudentRoute)) {

//             System.out.println("Bus is full!");
//         }
//     }
// }
