package lab8.task6;

public class Developer extends Employee{
    public String prog;

    public Developer(String name, double baseSalary, int hoursWorked , String p){
        super(name, baseSalary, hoursWorked);
        prog = p;
    }

    public void calculateSalary() {

        if (prog.equals("Java")) {

            double newSalary = getBaseSalary() + 700;
            setBaseSalary(newSalary);
        }
    }

    public void displayInfo() {

        System.out.println("Name: " + name);
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println("Work Hours: " + getHoursWorked());
        System.out.println("Language: " + prog);
        System.out.println("Final Salary: $" + getBaseSalary());
    }
   
}
