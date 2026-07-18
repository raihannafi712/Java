package oldLab.lab7;

public class lab7_3 {
    

    // Task A: isTriangle method

    public static boolean isTriangle(int a, int b, int c) {

        return (a + b > c) && (b + c > a) && (c + a > b);
    }






    // Task B: triArea method
    
    public static void triArea(int a, int b, int c) {

        if (isTriangle(a, b, c)) {

            double s = (a + b + c) / 2.0;

            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            System.out.println(area);
        } else {

            System.out.println("Can’t form triangle");
        }
    }

    public static void main(String[] args) {

        // Test Task A

        boolean res = isTriangle(7, 5, 10);
        System.out.println(res); 

        res = isTriangle(3, 2, 1);
        System.out.println(res);







        // Test Task B
        triArea(3, 2, 1); // Output: Can’t form triangle
        triArea(7, 5, 10); // Output: 16.24807680927192
    }
}
