package homework.homework02;

public class Faculty {
    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    private String facultyName;

    public Faculty (String facultyName) {
        this.facultyName = facultyName;
    }
}
