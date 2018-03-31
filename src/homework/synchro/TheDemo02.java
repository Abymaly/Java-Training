package org.jbanaszczyk.homework.synchro;

public class TheDemo02 {

    public static void main(String[] args) {
        Drop drop = new Drop();
        (new Thread(new Produceer(drop))).start();
        (new Thread(new Consumer(drop))).start();
    }}
