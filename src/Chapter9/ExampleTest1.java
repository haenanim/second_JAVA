package Chapter9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExampleTest1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);
        String name = null; //최고 점수를 받은 아이디를 저장하는 변수
        int maxScore = 0; //최고 점수를 저장하는 변수
        int totalScore = 0; //점수 합계를 저장하는 변수
        for(String mapName : map.keySet()) {
            if(map.get(mapName) > maxScore) {
                maxScore = map.get(mapName);
                name = mapName;
            }
            totalScore += map.get(mapName);
        }
        System.out.println("최고득점자 : " + name);
        System.out.println("최고점수 : " + maxScore);
        System.out.println("평균점수 : " + (totalScore/map.size()));

        Set<Map.Entry<String,Integer>> entrys = map.entrySet();
        for(Map.Entry<String,Integer> entry: entrys) {
            if(entry.getValue() == maxScore) {
                name = entry.getKey();
            }
        }

    }
}
