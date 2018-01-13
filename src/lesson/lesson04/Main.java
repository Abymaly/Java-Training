package lesson.lesson04;

public class Main {

    public static void main(String[] args) {

        int x = 5;
        switch (x) {
            case 1:
                System.out.println("nie bangla");
                break;
            case 5:
                System.out.println("OK!");
                break;
            default:
                System.out.println("default");
        }

        int a = 0;
        int b = 0;

        b = (a == 3 ? 5 : 19);

        System.out.println(b);

        int c = 0;
        int d = 5;

        c = (d > 2 ? 100 : 1000);
        System.out.println(c);


        int [] myArray = {3, 5, 19};

        for (int value : myArray) {
            System.out.println(value);
        }

            for (int i = 0; i < myArray.length; ++i) {
                ++myArray[i];
                System.out.println(myArray[i]);
        }

        }
    }


