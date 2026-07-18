package OOP;
public class Laptop {
    public static int count = 0;
    public String[] displayInfo = new String[2];
    public String[] ramInfo = new String[2];
    public int displayIndex = 0;
    public int ramIndex = 0;
    public String name = " ";
    public String size;

    public Laptop(){

    }

    public Laptop(String nm){
        name = nm;
        count++;
    }


    public void updateName(String nm){
        name = nm;
        count++;
    }

    public void addFeature(String d , String s){
        if (name != " ") {
            if (d == "Display") {
                displayInfo[displayIndex] = s;
                displayIndex++;
            } else if (d == "Ram") {
                ramInfo[ramIndex] = s;
                ramIndex++;
            }
        } else {
            System.out.println("Feature cannot be added without laptop name"); 
           
        }
    }
    public void printDetail(){
        System.out.println("Name: " + name);
        System.out.print("Display: ");

        for (int i = 0; i < displayIndex; i++) {
            System.out.print(displayInfo[i] + ", ");
        }
        System.out.println();
        if (ramInfo[0] == " ") {
            System.out.print("");
        } else {
             System.out.print("Ram: ");
            for (int i = 0; i < ramIndex; i++) {
                System.out.print(ramInfo[i] + ", ");
            }
        }
        System.out.println();
    }







    public void add_course(String[] v){

    }
}
