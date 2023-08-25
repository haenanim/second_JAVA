package Chapter9;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> fruits = Map.of("사과",5,"바나나",3,"딸기",10,"배",1);
        Map<String,Integer> hashFruits = new HashMap<>(fruits);

        hashFruits.put("키위",15);
        System.out.println(hashFruits);

        hashFruits.put("키위",1);
        System.out.println(hashFruits);

        hashFruits.remove("키위");
        System.out.println(hashFruits);

        hashFruits.clear();
        System.out.println(hashFruits.size());
    }
}
