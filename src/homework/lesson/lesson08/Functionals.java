package homework.lesson.lesson08;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class Functionals {

    public Function<Integer, Integer> add5 = (a) -> a + 5;
    public Function<Integer, Integer> minus15 = (a) -> 2 * a - 5;


    public BiFunction<Integer, Integer, Integer> calcPlus = (a, b) -> a + b;
    public BiFunction<Integer, Integer, Integer> calcMinus = (a, b) -> a - b;
    public BiFunction<Integer, Integer, Integer> calcMult = (a, b) -> a * b;
    public BiFunction<Integer, Integer, Integer> calcDiv = (a, b) -> a / b;

    @Test
    public void calculator01() {
        Map<String, Function<Integer, Integer>> operations = new HashMap<>();
        operations.put("+", add5);
        operations.put("-", minus15);

        System.out.println(operations.get("+").apply(21));
    }

    @Test
    public void calculatorChained() {

        System.out.println(add5.andThen(minus15).apply(10));
        System.out.println(minus15.andThen(add5).apply(10));
    }

    @Test
    public void calculatorComposed() {

        System.out.println(add5.andThen(minus15).apply(10));
        System.out.println(add5.compose(minus15).apply(10));    // compose liczy od tyłu
    }

    @Test
    public void calculator02() {
        Map<String, BiFunction<Integer, Integer, Integer>> operations = new HashMap<>();
        operations.put("+", calcPlus);
        operations.put("-", calcMinus);
        operations.put("*", calcMult);
        operations.put("/", calcDiv);

        System.out.println(operations.get("*").apply(20, 5));

    }
}

