package models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee( String name, String surname, String position,  double salary) {
        super( name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double getPaymentAmount() {
        return salary;
    }

    @Override
    public String toString() {
        return "models.Employee: " + super.toString() + " earns " + salary + " tenge ";
    }
}