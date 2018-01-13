package homework.homework02;

public class Faculty implements IFaculty {
    private String facultyName;

    public Faculty(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    @Override
    public String getFacultyName() {
        return facultyName;
    }
}
