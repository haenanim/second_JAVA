package Chapter12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StatisticDemo {
    public static void main(String[] args) {
        IntStream is = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(is.sum());
//        System.out.println(is.average());

        Stream<String> ss = Stream.of("a","b","c","d","e");
//        System.out.println(ss.count());
        System.out.println(ss.max((x,y) -> x.hashCode() - y.hashCode()));
        Stream<String> ss1 = Stream.of("a","bb","ccc","dd","ee");
        System.out.println(ss1.max((x,y)-> x.length() - y.length()));
    }
}
