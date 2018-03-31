package homework.lesson.lesson05.lesson05_builderPattern.homework02;

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
