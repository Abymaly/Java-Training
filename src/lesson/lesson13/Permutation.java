package lesson.lesson13;

import org.junit.Test;

import java.util.*;

public class Permutation {

    private void perm01Helper(List<Integer> constItems, List<Integer> items) {

        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);

        if (items.size() == 0) {
            System.out.println(constItems.toString());
            return;
        }

        for (int i = 0; i < itemsCopy.size(); ++i) {
            constItems = new ArrayList<>(constItemsCopy);
            items = new ArrayList<>(itemsCopy);
            constItems.add(items.get(i));
            items.remove(i);
            perm01Helper(constItems, items);
        }
    }

    void perm01(List<Integer> items) {
        perm01Helper(new ArrayList<>(), items);
    }


    private void perm02Helper(List<Integer> constItems, List<Integer> items) {

        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);

        if (items.size() == 0) {
            System.out.println(constItems.toString());
            return;
        }

        for (int i = 0; i < itemsCopy.size(); ++i) {

            constItems = new ArrayList<>(constItemsCopy);
            items = new ArrayList<>(itemsCopy);

            if (i < (items.size()-1)) {
                if (items.get(i).equals(items.get(i + 1))) {
                    continue;
                }
            }

            constItems.add(items.get(i));
            items.remove(i);

            perm02Helper(constItems, items);
        }
    }

    void perm02(List<Integer> items) {
        Collections.sort(items);
        perm02Helper(new ArrayList<>(), items);
    }


    int sumHelper(List<Integer> items) {
        int sum = 0;
        for (int item : items) {
            sum += item;
        }
        return sum;
    }

    private void perm03Helper(List<Integer> constItems, List<Integer> items) {

        List<Integer> constItemsCopy = new ArrayList<>(constItems);
        List<Integer> itemsCopy = new ArrayList<>(items);

        if (items.size() == 0) {

            return;
        }

        for (int i = 0; i < itemsCopy.size(); ++i) {

            constItems = new ArrayList<>(constItemsCopy);
            items = new ArrayList<>(itemsCopy);

            if (sumHelper(constItems) == 6) {
                System.out.println(constItems.toString());
                return;
            }

            constItems.add(items.get(i));
            items.remove(i);

            perm03Helper(constItems, items);
        }
    }

    void perm03(List<Integer> items) {
        perm03Helper(new ArrayList<>(), items);
    }


    @Test
    public void testPerm01() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        perm01(items);
    }

    @Test
    public void testPerm02() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 3, 5, 3));
        perm02(items);
    }

    @Test
    public void testPerm03() {
        List<Integer> items = new ArrayList<>(Arrays.asList(1, 3, 5, 3));
        perm03(items);
    }
}