package homework.lesson.lesson12;

import org.junit.Test;

public class Swapper {
    private int x;
    private int y;


    void swap1() {
        int z = y;
        y = x;
        x = z;
    }

    void swap2(){
        x = x + y;
        y = x - y;
        x = x - y;
    }

    void swap3() {      // ^ -> alternatywa wykluczająca;
        x ^= y;
        y ^= x;
        x ^= y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Swapper{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Test
    public void testSwapper() {
        Swapper swapper = new Swapper();
        swapper.setX(10);
        swapper.setY(15);

        swapper.swap2();
        System.out.println(swapper);
    }
}
