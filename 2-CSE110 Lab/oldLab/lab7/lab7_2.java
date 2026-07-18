package oldLab.lab7;

public class lab7_2 {
    
    // TASK 2

     // Task A: circleArea method


     public static double circleArea(int radius) {

        return Math.PI * radius * radius; 
    }





    // Task B: sphereVolume method

    public static double sphereVolume(int radius) {

        return (4.0 / 3.0) * Math.PI * radius * radius * radius; 
    }



    
    // Task C: findSpace method


    public static void findSpace(int diameter, String shape) {

        int radius = diameter / 2; 

        if (shape.equalsIgnoreCase("circle")) {

            double area = circleArea(radius); 
            System.out.println(area);

        } else if (shape.equalsIgnoreCase("sphere")) {

            double volume = sphereVolume(radius); 
            System.out.println(volume);

        } else {

            System.out.println("Wrong Parameter");
        }
    }


    public static void main(String[] args) {

        // Test Task A
        double area = circleArea(5);
        System.out.println(area); 



        // Test Task B
        double volume = sphereVolume(5);
        System.out.println(volume); 





        // Test Task C
        findSpace(10, "circle");  
        findSpace(5, "sphere");  
        findSpace(10, "square"); 
    }
}
