package lab8.task4;

public class Vehicle2010 extends Vehicle {
    

    public void moveLowerLeft(){
        moveDown();
        moveLeft();
    }

    public void moveUpperRight(){
        moveUp();
        moveRight();
    }

    public void moveLowerRight(){
        moveDown();
        moveRight();
    }
}
