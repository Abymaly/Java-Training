package homework.lesson.lesson05.lesson05_builderPattern.homework02;

public interface IPerson {
    Person setFirstName(String firstName);
    Person setSurName(String surName);
    Person setPesel(int pesel);

    String getFirstName();
    String getSurName();
    int getPesel();
}
