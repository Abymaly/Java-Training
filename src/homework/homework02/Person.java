package homework.homework02;

public class Person {
    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
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

    private int pesel;
    private String name;
    private String surname;

    public Person(int pesel, String name, String surname) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
    }

    public void personInfo() {
        System.out.println("pesel: " + pesel + "\nname: " + name + "\nsurname: " + surname);
    }
}
