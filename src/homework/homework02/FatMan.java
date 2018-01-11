package homework.homework02;

public class FatMan implements iEmployee, iStudent, iPerson {
    private Person person;
    private Student student;
    private Employee employee;

    public FatMan(Person person, Student student, Employee employee) {
        this.person = person;
        this.student = student;
        this.employee = employee;
    }


    @Override
    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public String getTitle() {
        return employee.getTitle();
    }

    @Override
    public void setSalary(double salary) {
        employee.setSalary(salary);
    }

    @Override
    public void setTitle(String title) {
        employee.setTitle(title);
    }

    @Override
    public void setFirstName(String firstName) {
        person.setFirstName(firstName);
    }

    @Override
    public void setSurName(String surName) {
        person.setSurName(surName);
    }

    @Override
    public void setPesel(int pesel) {
        person.setPesel(pesel);
    }

    @Override
    public String getFirstName() {
        return person.getFirstName();
    }

    @Override
    public String getSurName() {
        return person.getSurName();
    }

    @Override
    public int getPesel() {
        return person.getPesel();
    }

    @Override
    public void setSemester(int semester) {
        student.setSemester(semester);
    }

    @Override
    public int getSemeseter() {
        return student.getSemeseter();
    }
}
