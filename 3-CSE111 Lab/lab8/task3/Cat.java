package lab8.task3;

public class Cat extends Animal  {
    public String type;


    public Cat(String name, int age, String color , String t) {
        super(name, age, color);
        type = t;
    }

    public String info() {
        return "Name: "+name+"\nAge: "+age+"\nColor: "+color+"\n"+"\nBreed: " +type+"\n";
    }

    public void makeSound() {
        System.out.println(color + " color " + name + " is meowing");
    }
}
