package homework.homework02;

import homework.homework02.Person;

public class Employee implements iEmployee, iFaculty  {
    private String title;
    private double salary;
    private Faculty faculty;

    public Employee (String title, double salary, Faculty faculty) {
        this.title = title;
        this.salary = salary;
        this.faculty = faculty;
    }


    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public void setFacultyName(String facultyName) {
        faculty.setFacultyName(facultyName);
    }

    @Override
    public String getFacultyName() {
        return faculty.getFacultyName();
    }
}
