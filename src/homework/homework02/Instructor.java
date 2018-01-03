package homework.homework02;

public class Instructor extends Employee{

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Instructor (int pesel, String name, String surname, double salary, String title) {
        super (pesel, name, surname, salary);
        this.title = title;
    }

    public void instructorInfo() {
        super.employeeInfo();
        System.out.println("title: " + title);
    }

}
