package Chapter9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = {"길이","물","보리","황금을"};
        List<String> list= Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list,"황금을");
        System.out.println(index);
    }
}
