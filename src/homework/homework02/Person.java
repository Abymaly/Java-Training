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

    public String getName () {
        return name;
    }

    public String getSurname () {
        return surname;
    }

    public int getPesel () {
        return pesel;
    }


    //public void getInfo() {}

}
