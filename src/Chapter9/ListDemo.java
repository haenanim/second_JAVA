package Chapter9;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add(0, "바다표범");
        list.add(1, "표범");
        list.add(2, "범");
        list.add(3, "개");
        list.sort((o1, o2)-> o1.length() - o2.length());
        list.forEach(s -> System.out.println(s));
    }
}
