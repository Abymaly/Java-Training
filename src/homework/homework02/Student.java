package homework.homework02;

public class Student {
    private Faculty faculty;
    private int semester;
    private Person person;

    public Student(Faculty faculty, int semester, Person person) {
        this.faculty = faculty;
        this.semester = semester;
        this.person = person;
    }

    public String getName() {
        return person.getName();
    }

    public void setName(String name) {
        person.setName(name);
    }

    public String getSurname() {
        return person.getSurname();
    }

    public void setSurname(String surname) {
        person.setSurname(surname);
    }

    public int getPesel() {
        return person.getPesel();
    }

    public void setPesel(int pesel) {
        person.setPesel(pesel);
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
}