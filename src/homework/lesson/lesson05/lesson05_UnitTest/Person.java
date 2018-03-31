package homework.lesson.lesson05.lesson05_UnitTest;

public class Person {
    private long pesel;
    private String name;

    public Person(long pesel, String name) {
        this.pesel = pesel;
        this.name = name;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

