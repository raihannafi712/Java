package lab4;


public class testerLab4 {
    
    // TASK 1

    // public static void main(String[] args){
    //     Student s1 = new Student("Harry", "CSE");
    //     System.out.println(s1.name);
    //     s1.updateName("Harry Potter");
    //     System.out.println(s1.name);
    //     System.out.println(s1.prog);
    //     s1.updateProgram("CS");
    //     String var = s1.accessProgram();
    //     System.out.println(var);
    // }
 




    // TASK 2

    //     public static void main(String[] args){
    //     Toy t1 = new Toy("Car", 230);
    //     System.out.println("1=================");
    //     t1.updatePrice(250);
    //     System.out.println("2=================");
    //     System.out.println(t1.name);
    //     t1.showPrice();
    //     System.out.println("3=================");
    //     Toy t2 = new Toy("Robot", 450);
    //     System.out.println("4=================");
    //     t2.updateName("Autobot");
    //     System.out.println("5=================");
    //     System.out.println(t2.name);
    //     t2.showPrice();
    // }





    // TASK 3

        // public static void main(String[] args) {
        //   Shape2D sq = new Shape2D();
        //   System.out.println("---------1----------");
        //   sq.area();
        //   System.out.println("---------2----------");
        //   Shape2D rectangle = new Shape2D(5,6);
        //   System.out.println("---------3----------");
        //   rectangle.area();
        //   System.out.println("---------4----------");
        //   Shape2D tri1 = new Shape2D(5,6,"Triangle");
        //   System.out.println("---------5----------");
        //   tri1.area();
        //   System.out.println("---------6----------");
        //   Shape2D tri2 = new Shape2D(5,6,7);
        //   System.out.println("---------7----------");
        //   tri2.area();
        //   System.out.println("---------8----------");
        // }




        //  TASK 4

        // public static void main(String[] args){
        //     Student student1 = new Student(12345678);
        //     System.out.println("1-----------------");
        //     student1.addCourse("CSE110");
        //     System.out.println("2-----------------");
        //     student1.storeCG(2.5);
        //     student1.addCourse("CSE110");
        //     student1.addCourse("ENG101");
        //     student1.showAdvisee();
        //     System.out.println("3-----------------");
        //     student1.removeAllCourse();
        //     student1.showAdvisee();
        //     System.out.println("4-----------------");
        //     student1.storeID(54652365);
        //     String[] courses = {"SOC101","CSE111","ENG102"};
        //     student1.addCourse(courses);
        //     student1.showAdvisee();
        //     System.out.println("5-----------------");
        //     student1.addCourse("CSE230");
        //     student1.showAdvisee();
        //     System.out.println("6-----------------");
        //     Student student2 = new Student(975738383,3.7);
        //     System.out.println("7-----------------");
        //     String[] courses2 = {"CSE220","PHY112","MAT120","BUS101","CHN101"};
        //     student2.addCourse(courses2);
        //     student2.showAdvisee();
        //   }
        


        //  TASK 5

        // public static void main(String args[]){
        //     Triangle t1 =  new Triangle(4, 4, 4);
        //     Triangle t2 =  new Triangle(4, 5, 6);
        //     Triangle t3 =  new Triangle(4, 5, 6);
        //     Triangle t4 =  new Triangle(5, 4, 6);
         
        //     t1.triangleDetails();
        //     System.out.println("--------1--------");
        //     System.out.println(t1.printTriangleType());
        //     System.out.println("--------2--------");
        //     t3.triangleDetails();
        //     System.out.println(t3.printTriangleType());
        //     System.out.println("--------3--------");
        //     t4.triangleDetails();
        //     System.out.println(t4.printTriangleType());
        //     System.out.println("--------4--------");
        //     t2.compareTrinagles(t3);
        //     System.out.println("--------5--------");
        //     t1.compareTrinagles(t2);
        //     System.out.println("--------6--------");
        //     t1 = t2;
        //     t1.compareTrinagles(t2);
        //     System.out.println("--------7--------");
        //     t3.compareTrinagles(t4);
        //   }




        //  TASK 6

        // public static void main(String [] args){
        //     Teacher t1 = new Teacher("Matin Saad Abdullah","MSA");
        //     Teacher t2 = new Teacher("Mumit Khan","MMK");
        //     Teacher t3 = new Teacher("Sadia Hamid Kazi","SKZ");                         
        //     Course c1 = new Course("CSE 110");
        //     Course c2 = new Course("CSE 111");
        //     Course c3 = new Course("CSE 220"); 
        //     Course c4 = new Course("CSE 221");
        //     Course c5 = new Course("CSE 230"); 
        //     Course c6 = new Course("CSE 310");
        //     Course c7 = new Course("CSE 320"); 
        //     Course c8 = new Course("CSE 340");
        //     t1.addCourse(c1);
        //     t1.addCourse(c2);
        //     t2.addCourse(c3);
        //     t2.addCourse(c4);
        //     t2.addCourse(c5);
        //     t3.addCourse(c6);
        //     t3.addCourse(c7); 
        //     t3.addCourse(c8);
        //     System.out.println("1========================");
        //     t1.printDetail();
        //     System.out.println("2========================");
        //     t2.printDetail();
        //     System.out.println("3========================");
        //     t3.printDetail();
        //   }


        // TASK 7

        // public static void main(String[] args) {
        //     BracuStudent st1 = new BracuStudent("Afif", "Mirpur");
        //     System.out.println("1===============");
        //     BracuStudent st2 = new BracuStudent("Shanto", "Motijheel");
        //     BracuStudent st3 = new BracuStudent("Taskin", "Mirpur");
        //     st1.showDetails();
        //     st2.showDetails();
        //     System.out.println("2===============");
        //     st3.showDetails();
        //     System.out.println("3===============");
        //     BracuBus bus1 = new BracuBus("Mirpur");
        //     BracuBus bus2 = new BracuBus("Azimpur", 5);
        //     bus1.showDetails();
        //     bus2.showDetails();
        //     System.out.println("4===============");
        //     st2.getPass();
        //     st3.getPass();
        //     System.out.println("5===============");
        //     st2.showDetails();
        //     st3.showDetails();
        //     System.out.println("6===============");
        //     bus1.board();
        //     System.out.println("7===============");
        //     bus1.board(st1, st2);
        //     System.out.println("8===============");
        //     st1.getPass();
        //     st2.updateHome("Mirpur");
        //     st1.showDetails();
        //     st2.showDetails();
        //     System.out.println("9===============");
        //     bus1.board(st1);
        //     bus1.board(st2, st3);
        //     System.out.println("10===============");
        //     bus1.showDetails();
        //    }




        // TASK 8

        public static void main(String[] args) {
            Student rakib = new Student("Rakib", 12301455, "CSE");
            Student roy = new Student("Roy", 12501345, "CS");
            System.out.println("1*************");
            Usis usisObj = new Usis();
            System.out.println("2*************");
            usisObj.login(rakib);
            System.out.println("3*************");
            usisObj.advising(rakib);
            System.out.println("4*************");
            rakib.email = "rakib@hotmail.com";
            rakib.password = "1234";
            System.out.println("5*************");
            usisObj.login(rakib);
            System.out.println("6*************");
            usisObj.advising(rakib);
            System.out.println("7*************");
            usisObj.advising(rakib, "CSE110", "PHY111", "MAT110", "CSE260");
            System.out.println("8*************");
            usisObj.advising(rakib, "CSE110", "PHY111","MAT110");
            System.out.println("9*************");
            usisObj.allAdviseeInfo();
            System.out.println("10*************");
            roy.email = "roy@hotmail.com";
            roy.password = "abcd";
            usisObj.login(roy);
            System.out.println("11*************");
            usisObj.advising(roy, "CSE110", "ENG101", "PHY112");
            System.out.println("12*************");
            usisObj.allAdviseeInfo();
          }
        
          


        
         
      

}
