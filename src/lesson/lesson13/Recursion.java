package lesson.lesson13;

import org.junit.Test;
import org.junit.Assert;

public class Recursion {

    public static int factorial(int x) {
        if (x == 1) {
            return x;
        } else return x * factorial(x - 1);
    }

    @Test
    public void test01() {
        Assert.assertEquals(120, factorial(5));
    }
}