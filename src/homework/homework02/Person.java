package homework.homework02;

public class Person {

    private int pesel;
    private String name;
    private String surname;

    public Person(int pesel, String name, String surname) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
    }

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public int getPesel () {
        return pesel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }
}