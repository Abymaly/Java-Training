package lesson.lesson12;

import org.junit.Test;

public class Bindings {

    class A {
        void doIt() {
            System.out.println("Doing A");
        }
    }

    class B extends A {
        void doIt() {
            System.out.println("Doing B");
        }
    }

    @Test
    public void testBinding01() {
        A a = new A();
        B b = new B();
        a.doIt();
        b.doIt();
    }

    @Test
    public void testBinding02() {
        A a = new A();
        A b = new B();          // ten obiekt dalej wie, że jest klasy B, więc jeśli może to wykorzysta metody klasy B
        a.doIt();
        b.doIt();
    }

    class A1 {
        void doIt() {
            System.out.println("Doing A");
        }
    }

    class B1 extends A1 {
        void doIt() {
            System.out.println("Doing B");
        }
    }

    @Test
    public void testBinding03() {
        A1 a = new A1();
        A1 b = new B1();
        a.doIt();
        b.doIt();
    }
}
