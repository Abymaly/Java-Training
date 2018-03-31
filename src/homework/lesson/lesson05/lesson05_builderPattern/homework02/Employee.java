package homework.lesson.lesson05.lesson05_builderPattern.homework02;

public class Employee implements IEmployee {
    private String title;
    private double salary;

    public Employee (String title, double salary) {
        this.title = title;
        this.salary = salary;
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
}
