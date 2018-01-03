package homework.homework02;

import homework.homework02.Person;

public class Employee extends Person {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public Employee(int pesel, String name, String surname, double salary) {
        super(pesel, name, surname);
        this.salary = salary;
    }

    public void employeeInfo () {
        super.personInfo();
        System.out.println("salary: " + salary);
    }
}
