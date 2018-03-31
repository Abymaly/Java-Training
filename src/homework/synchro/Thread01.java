package org.jbanaszczyk.homework.synchro;

public class Thread01 extends Thread {
    String name;
    TheDemo01 theDemo;

    public Thread01(String name, TheDemo01 theDemo) {
        this.theDemo = theDemo;
        this.name = name;
        start();
    }

    @Override
    public void run() {
        theDemo.test(name);
    }
}
