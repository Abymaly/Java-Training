package homework.delegate_pattern;

public class Main {

    public static void main(String[] args) {
        Person a = new Person("A.", "P.", 007);
        Person t = new Person("T.", "P.", 001);

        Faculty f1 = new Faculty("knowledge abot nothing");
        Faculty f2 = new Faculty("some knowledge");

        Student st1 = new Student(2, f1);
        Student st2 = new Student(1, f2);

        Employee e1 = new Employee("mgr", 2400.0);
        Employee e2 = new Employee("doc", 10000.0);

        FatMan skinnyMan = new FatMan(a, st2, e2);

        System.out.println(skinnyMan.getFacultyName());

        skinnyMan.setFacultyName("test");

        System.out.println(st2.getFacultyName());
    }
}
