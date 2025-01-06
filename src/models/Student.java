package models;

public class Student extends Person {
    private double gpa;
    private static double stipend = 47125.00;


    public Student(String name, String surname, double gpa){
        super(name,surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getPaymentAmount(){
        return gpa > 2.67 ? stipend : 0.00;
    }

    @Override
    public String toString(){
        return "Student: " + super.toString() + " , GPA " + gpa +  " earns " + getPaymentAmount() + " tenge ";
    }
}
