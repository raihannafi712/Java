package lab9.task1;

public class Pokemon {

    public String characterName;

    public Pokemon(String nm){
        characterName = nm;
    }

    public void attack(){
        System.out.println(characterName + " attacks with a basic move!");
    }

    public void attack(String nm){
        System.out.println(characterName + " uses " + nm + "!");
    }

    public void attack(String nm , int p){
        System.out.println(characterName + " uses " + nm + " with power " + p );
    }


    // This is compile time polymorphism
}
