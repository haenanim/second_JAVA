package Chapter9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        map.put("김열공",80);
        map.put("최고봉",90);
        map.put("우등생",95);
        map.put("나자바",88);
        System.out.println(map.get(in.nextLine()));

        Map<String,String> animal = Map.of("호랑이","tiger","표범","leopard","사자","lion");
        Map<String,String> animals = new HashMap<>(animal);

    }
}
