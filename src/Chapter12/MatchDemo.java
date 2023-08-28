package Chapter12;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {
    public static void main(String[] args) {
        Stream.of("a1","b1","c1").anyMatch(x -> x.startsWith("c"));
        IntStream.of(1,3,5,7,9).allMatch(n -> n%2==1);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            arr.add(i);
        }
        boolean odd = true;
        for(int i = 0; i < arr.size(); i++) {
            if(!(arr.get(i) % 2 == 1)) {
                odd = false;

                break;
            }
        }
        System.out.println(odd);

        IntStream.of(1,3,5,7,9).noneMatch(n -> n%2 == 0);
        if(Nation.nations.stream().allMatch(n-> n.getPopulation() > 100.0)) {
            System.out.println("모든 국가의 인구가 1억이 넘는다");
        }else{
            System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
        }
    }
}
