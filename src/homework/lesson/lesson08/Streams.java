package homework.lesson.lesson08;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

    @Test
    public void test01() {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(1, 5, 8, 2, 600)).stream();

        //stream.forEach(s -> System.out.println(s));     // to forEach steruje tym, co wykonujemy na strumieniu
        //stream.forEach(System.out::println);

        stream
                .filter((a) -> a > 3)
                .map(a -> "<<< " + a.toString(a) + " >>>")         // w tym miejscu strumień zmienił charakter, był strumień intów, jest strumień stringów
                .forEach(System.out::println);
    }

    @Test
    public void test02() {
        IntStream stream = IntStream.range(2, 10);
        stream.forEach(System.out::println);
    }

    @Test
    public void test03() {
        Stream<Integer> stream = Stream.iterate(3, n -> n + 2);
        stream
                .limit(10)
                .forEach(System.out::println);
    }

    @Test
    public void test04() {
        Stream<Integer> stream = Stream.iterate(3, n -> n + 2);

        List<Integer> list = new LinkedList<>(stream
                .limit(10)
                .collect(Collectors.toList()));
        System.out.println(list.toString());
    }

    @Test
    public void test05() {
        Stream<Integer> stream = Stream.of(1, 5, 5, 5, 2, 1, 1, 0);

        Map<Integer, Long> result =
                stream.collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        System.out.println(result);
    }

}

