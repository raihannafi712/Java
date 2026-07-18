package OOP.polymorphism;

public class Tester {

    // Run time polymorphism
    public static void displayInfo(Animal a){       /* a = c1,d1 (objects) */   

        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();       /* Downcasting */
        } else {
            a.makeSound();  /* Upcasting */
        }
    }
    /* Objects are being referenced to Parent class because dog,cat every one of them are Animals */
    
    
    
    
    public static void main(String[] args) {
        

        Animal a1 = new Animal();
        Dog d1 = new Dog();
        Cat c1 = new Cat();


        // Complie time polymorphism
        a1.makeSound();;
        d1.makeSound();
        c1.makeSound();






        // Typecasting
        int x = 12;
        double d11 = (double) (x + 2);      /* Casting */
        double d2 = (x + 2);                /* Implicit casting */

        System.out.println(d11);
        System.out.println(d2);








        // Run time polymorphism

        // reference_type var = new object();
        // In compile time, it checks the reference type
        // In Run time, it checks the object


        
        Animal a2 = new Dog();      /* Upcasting (Implicit) */
        Dog d3 = new Dog();
        Animal a3 = (Animal) d3;    /* Upcasting (Manual) */

        a2.makeSound(); 
        a3.makeSound();










        // instanceof
        System.out.println(d1 instanceof Dog);
        System.out.println(d1 instanceof Animal);
        System.out.println(c1 instanceof Animal);
        System.out.println(a1 instanceof Dog);






        // Upcasting and Downcasting
        displayInfo(c1);        /* Animal a = (Animal) c1 */    /* Upcasting */
        displayInfo(d1);        /* Animal a = (Animal) c1 */    /* Downcasting */    

    }
}
