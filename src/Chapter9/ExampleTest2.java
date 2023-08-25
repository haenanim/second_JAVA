package Chapter9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ExampleTest2 {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("호랑이","tiger","표범","leopard","사자","lion");
        HashMap<String, String> animals = new HashMap<>(map);
        animals.replaceAll((k,v)->v.toUpperCase());
        animals.forEach((k,v)-> System.out.println(k+v));
    }
}
