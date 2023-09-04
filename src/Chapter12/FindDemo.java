package Chapter12;

import java.util.Optional;

public class FindDemo {
    public static void main(String[] args) {
        Optional<Nation> first = Nation.nations.stream().limit(4).findFirst();
        Optional<Nation> second = Nation.nations.stream().skip(1).findFirst();
        Optional<Nation> therd = Nation.nations.stream().filter(Nation::isIsland).findAny();
    }
}
