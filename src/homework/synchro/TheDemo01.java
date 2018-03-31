package org.jbanaszczyk.homework.synchro;

public class TheDemo01 {
    public void test(String name) {
        int q = 1;

        for (int i = 0; i < 10; i++) {
            SOP.print(name + " :: " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                SOP.print(e.getMessage());
            }
        }

    }

    public static void main(String[] args) {
        TheDemo01 theDemo = new TheDemo01();
        Thread thread1 = new Thread01("THREAD 1", theDemo);
        Thread thread2 = new Thread01("THREAD 2", theDemo);
        Thread thread3 = new Thread01("THREAD 3", theDemo);
//        thread3.interrupt();
//        thread2.interrupt();
//        thread1.interrupt();
    }
}
