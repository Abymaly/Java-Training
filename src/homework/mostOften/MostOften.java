package homework.mostOften;

import java.util.Arrays;

public class MostOften {

    public static void arrayToBollean(int[] myArr) {

        boolean[] boolArr = new boolean[myArr.length - 1];

        int count = 1;
        int maxCount = 0;
        int winner = 0;

        for (int i = 0; i < myArr.length - 1; ++i) {
            int[] subArray = Arrays.copyOfRange(myArr, i, i + 2);
            boolArr[i] = subArray[0] <= subArray[1];
//            System.out.print(Arrays.toString(subArray));
//            System.out.println(boolArr[i]);
        }

//        System.out.println(Arrays.toString(boolArr));

        for (int i = 0; i < boolArr.length - 1; ++i) {
            int j = 1;
            while (((i + j) < boolArr.length) && (boolArr[i] == boolArr[i + j])) {
                count = count + 1;
                if (count > maxCount) {
                    maxCount = count;
                    if (boolArr[i] == false) {
                        winner = myArr[i];
                    } else {
                        winner = myArr[myArr.length - 1 - i];
                    }
                }
                j++;
            }
            count = 1;
        }
        System.out.println("Najczęściej spadnie z: " + winner);
        System.out.println("Spadnie " + maxCount + " razy");
    }

    public static void main(String[] args) {

        int[] testArr = {2, 1, 2, 3, 4, 6, 7, 2};

        arrayToBollean(testArr);

    }
}