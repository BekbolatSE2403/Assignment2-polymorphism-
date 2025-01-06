package models;

public class Person {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;


    public Person(String name, String surname) {
        this.id = idCounter++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + surname;
    }


}
