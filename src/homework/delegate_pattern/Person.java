package homework.delegate_pattern;

public class Person implements IPerson {

    private String firstName;
    private String surName;
    private int pesel;

    public Person (String firstName, String surName, int pesel) {
        this.firstName = firstName;
        this.surName = surName;
        this.pesel = pesel;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public void setPesel(int pesel) {
        this.pesel = pesel;
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
}