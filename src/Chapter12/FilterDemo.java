package Chapter12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {
        String[] sa = {"a1","b1","c1","c2","c2"};
        Arrays.stream(sa)
                .filter(s -> s.startsWith("c"))
                .skip(1)
                .forEach(System.out::println);

        IntStream ints = new Random().ints(0, 10);
        ints.limit(5)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

        Nation.nations.stream().filter(x -> x.getPopulation() > 100.0).forEach(System.out::println);

    }
}
