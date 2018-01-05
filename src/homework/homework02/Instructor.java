package homework.homework02;

public class Instructor extends Employee{
    protected String title;
    protected Person person;
    protected Salary salary;

    public Instructor(int pesel, String name, String surname, Salary salary, Person person) {
        super(pesel, name, surname, salary, person);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public Person getPerson() {
        return person;
    }

    @Override
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public Salary getSalary() {
        return salary;
    }

    @Override
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    //public void getInfo() {}
}
