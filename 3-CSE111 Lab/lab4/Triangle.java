// package lab4;


// TASK 5
// public class Triangle {
    
//     int triSideOne, triSideTwo, triSideThree;

//     public Triangle(int a, int b, int c) {
//         triSideOne = a;
//         triSideTwo = b;
//         triSideThree = c;
//     }

//     public void triangleDetails() {
        
//         System.out.println("Three sides of the triangle are: " + triSideOne + ", " + triSideTwo + ", " + triSideThree);
//         int triParameter = triSideOne + triSideTwo + triSideThree;
//         System.out.println("Perimeter: " + triParameter);
//     }

//     public String printTriangleType() {

//         if (triSideOne == triSideTwo && triSideTwo == triSideThree) {

//             return "This is an Equilateral Triangle.";
//         } else if (triSideOne == triSideTwo || triSideOne == triSideThree || triSideTwo == triSideThree) {

//             return "This is an Isosceles Triangle.";
//         } else {

//             return "This is a Scalene Triangle.";
//         }
//     }

//     public void compareTrinagles(Triangle other) {

//         if (this == other) {

//             System.out.println("These two triangle objects have the same address.");
//         } else if (this.triSideOne == other.triSideOne &&
//                    this.triSideTwo == other.triSideTwo &&
//                    this.triSideThree == other.triSideThree) {

//             System.out.println("Addresses are different but the sides of the triangles are equal.");
//         } else if ((this.triSideOne + this.triSideTwo + this.triSideThree) ==
//                    (other.triSideOne + other.triSideTwo + other.triSideThree)) {

//             System.out.println("Only the perimeter of both triangles is equal.");
//         } else {

//             System.out.println("Addresses, length of the sides and perimeter all are different.");
//         }
//     }
// }
