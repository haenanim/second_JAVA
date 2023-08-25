package Chapter9;

import java.util.function.Predicate;

public class FunctionalInterface2Demo {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        Predicate<Integer> isZero = i -> i == 0;

        isEmptyStr.test("");
        isEmptyStr.test("asdf");
        isZero.test(0);
    }
}
