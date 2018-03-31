package homework.lesson.lesson05.lesson05_builderPattern.homework02;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testBuilder() {
        Person person =
                Person.getPerson()
                        .setFirstName("a.")
                        .setSurName("p.")
                        .setPesel(123)
                        .validate();

        assertEquals("a.", person.getFirstName());
    }


}