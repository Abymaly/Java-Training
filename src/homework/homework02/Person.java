package homework.homework02;

public class Person {

    protected int pesel;
    protected String name;
    protected String surname;

    public Person(int pesel, String name, String surname) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
    }

    public Person () {}

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    //public void getInfo() {}

}
