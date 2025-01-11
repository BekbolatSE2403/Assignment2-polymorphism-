import models.Employee;
import models.Payable;
import models.Student;
import models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Payable> people = new ArrayList<>();

        people.add(new Student("Bakebai", "Balenbai", 3.8));
        people.add(new Student("Atirgul", "Seksenkyzy", 2.1));
        people.add(new Employee("Make", "Sakenuly", "Manager", 50000));
        people.add(new Employee("Zhanna", "Zhakypkyzy", "Singer", 45000));

        
        Collections.sort(people, new Comparator<Payable>() {
            @Override
            public int compare(Payable o1, Payable o2) {
                return Double.compare(o1.getPaymentAmount(), o2.getPaymentAmount());
            }
        });

        printData(people);
    }

    public static void printData(Iterable<? extends Payable> payables) {
        for (Payable payable : payables) {
            System.out.println(payable);
        }
    }
}
