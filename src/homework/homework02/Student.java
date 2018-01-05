package homework.homework02;

public class Student extends Person{
    protected Faculty faculty;
    protected int semester;
    protected Person person;

    public Student(int pesel, String name, String surname, Faculty faculty, int semester, Person person) {
        super(pesel, name, surname);
        this.faculty = faculty;
        this.semester = semester;
        this.person = person;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //public void getInfo() {}

}
