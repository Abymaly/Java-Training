package homework.homework02;

public class Student extends Person{
    private int semester;
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }

    private Faculty faculty;

    public Student (int pesel, String name, String surname, Faculty faculty, int semester) {
        super (pesel, name, surname);
        this.semester = semester;
    }

    public void studentInfo() {
        super.personInfo();
        System.out.println("faculty: " + faculty + "\nsemester: " + semester);
    }

}
