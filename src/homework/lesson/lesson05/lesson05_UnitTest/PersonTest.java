package homework.lesson.lesson05.lesson05_UnitTest;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test_constructorName() {
        Person person = new Person (123, "ja");
        assertEquals("ja", person.getName());
    }

   @Test
   public void test_constructorPesel() {
   Person person = new Person (123, "ja");
       assertEquals(123, person.getPesel());
   }

    @Test
    public void test_setName() {
        Person person = new Person (123, "ja");
        person.setName("ty");
        assertEquals("ty", person.getName());
    }

    @Test
    public void test_setPesel() {
        Person person = new Person (123, "ja");
        person.setPesel(456);
        assertEquals(456, person.getPesel());
    }

}