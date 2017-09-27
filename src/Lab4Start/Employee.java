package Lab4Start;

/**
 * Created by evanfolk on 9/27/17.
 */
public class Employee implements Rules {

    private String name;
    private double salary;

    public Employee() {
        name = "New Employee";
        salary = 0;
    }

    public Employee(String inName, double inSalary) {
        setName(inName);
        setSalary(inSalary);
    }

    public void setName(String inName) {
        name = inName;
    }

    public void setSalary(double inSalary) {
        salary = inSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Employee: " + name + " earns " + salary;
    }
}
