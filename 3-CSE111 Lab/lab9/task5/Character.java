package lab9.task5;

public class Character {
    public String name;
    public int level;

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void specialMove() {
        System.out.println("Character uses a generic move.");
    }

    public boolean equals(Object moveObject) {

        if (moveObject instanceof Character) {

            Character other = (Character) moveObject;
            return this.name.equals(other.name) && this.level == other.level;
        }
        return false;
    }
}

