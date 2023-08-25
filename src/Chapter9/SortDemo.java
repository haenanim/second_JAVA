package Chapter9;

import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        String[] fruits = {"포도","수박","사과","키위","망고"};
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }
}
