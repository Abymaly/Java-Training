package homework.homework02;

public class Student extends Person {
    private Faculty faculty;
    private int semester;
    private Person person;

    public Student(Faculty faculty, int semester, Person person) {
        this.faculty = faculty;
        this.semester = semester;
        this.person = person;
    }

    public String getStudentName() {
        return person.name;
    }

    public void setStudentName(String name) {
        person.name = name;
    }

    public String getStudentSurname() {
        return person.surname;
    }

    public void setStudentSurname(String surname) {
        person.surname = surname;
    }

    public int getStudentPesel() {
        return person.pesel;
    }

    public void setStudentPesel(int pesel) {
        person.pesel = pesel;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getFacultyName() {
        return faculty.getFacultyName();
    }

    //public void getInfo() {}

}