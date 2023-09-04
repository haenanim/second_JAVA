package Chapter12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a1","a2","d2","b1","c2");
        s1.sorted()
                .forEach(NationUtil::print);
        System.out.println();
        //d2,c2,b1,a2,a1
        Stream<String> s2 = Stream.of("a1","a2","d2","b1","c2");
        s2.sorted((x,y)-> y.hashCode() - x.hashCode())
                .forEach(NationUtil::print);
        System.out.println();

        Nation.nations.stream()
                .sorted(Comparator.comparing(x -> x.getName()))
                .map(x->x.getName())
                .forEach(NationUtil::printWithParenthesis);
        System.out.println();
    }
}
