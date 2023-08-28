package Chapter12;

public class Reduce2Demo {
    public static void main(String[] args) {
        Nation.nations.stream()
                .reduce((n1,n2) -> n1.getPopulation() > n2.getPopulation() ? n1 : n2)
                .ifPresent(System.out::println);
    }
}
