package lab8.task5;

public class ComplexNumber extends RealNumber {
    public double img;


    public ComplexNumber(){
        super(1.0);
    }

    public ComplexNumber(double r , double i){
        realValue = r;
        img = i;
    }

    public String toString(){
        return super.toString() + "\nImaginaryPart: " + img;
    }
}
