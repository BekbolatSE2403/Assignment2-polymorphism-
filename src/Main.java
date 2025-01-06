import models.Employee;
import models.Student;
import models.Person;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Bakebai", "Balenbai", 3.8));
        people.add(new Student("Atirgul", "Seksenkyzy", 2.1));
        people.add(new Employee("Make", "Sakenuly", "Manager", 50000));
        people.add(new Employee("Zhanna", "Zhakypkyzy", "Engineer", 45000));

        for(Person person : people) {
            System.out.println(person);
        }

    }
}