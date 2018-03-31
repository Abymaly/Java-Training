package org.jbanaszczyk.homework.synchro;

import java.util.Random;

public class Produceer implements Runnable {
    private Drop drop;

    public Produceer(Drop drop) {
        this.drop = drop;
    }

    public void run() {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };
        Random random = new Random();

        for (int i = 0;
             i < importantInfo.length;
             i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(50));
            } catch (InterruptedException e) {}
        }
        drop.put("DONE");
    }
}
