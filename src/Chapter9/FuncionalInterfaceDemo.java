package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuncionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunction f = (a, b) -> a > b ? a : b;
        MyFunction f1 = (a, b) -> a+b;

        List<String> list = Arrays.asList("abc", "aaa", "bbb", "ddd", "aaa");
//        Collections.sort(list, new Comparator<String>() {
//
//            public int compare(String s1, String s2) {
//                return s2.compareTo(s1);
//            }
//        });

        Collections.sort(list, (s1, s2)-> s2.compareTo(s1));


    }
}

interface MyFunction {
    int max(int a, int b);
}
