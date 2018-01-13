package homework.homework02;

public class Student implements IStudent, IFaculty {
    private int semester;
    private Faculty faculty;

    public Student (int semester, Faculty faculty) {
        this.semester = semester;
        this.faculty = faculty;
    }

    @Override
    public void setSemester(int semester) {
        this.semester = semester;
    }

    @Override
    public int getSemester() {
        return semester;
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