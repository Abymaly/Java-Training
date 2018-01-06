package homework.homework02;

import homework.homework02.Person;

public class Employee extends Person {
    protected Salary salary;
    protected Person person;

    public Employee(int pesel, String name, String surname, Salary salary, Person person) {
        super(pesel, name, surname);
        this.salary = salary;
        this.person = person;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //public void getInfo() {}

}
