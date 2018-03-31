package homework.lesson.lesson05.lesson05_builderPattern.homework02;

public class Person implements IPerson {

    private String firstName;
    private String surName;
    private int pesel;

    public Person (String firstName, String surName, int pesel) {
        this.firstName = firstName;
        this.surName = surName;
        this.pesel = pesel;
    }

    public Person () {}

    public static Person getPerson () {
        Person p1 = new Person();
        return p1;
    }

    @Override
    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public Person setSurName(String surName) {
        this.surName = surName;
        return this;
    }

    @Override
    public Person setPesel(int pesel) {
        this.pesel = pesel;
        return this;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getSurName() {
        return surName;
    }

    @Override
    public int getPesel() {
        return pesel;
    }

    public Person validate() {              // tutaj powinien być throw, będzie lepiej później
        if (firstName == null) {
            System.out.println("Nie bangla");
        }
        return this;
    }

}