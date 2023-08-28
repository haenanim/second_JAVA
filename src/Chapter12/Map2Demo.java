package Chapter12;

public class Map2Demo {
    public static void main(String[] args) {
        Nation.nations.stream()
                .map(x -> x.getName())
                .limit(4)
                .forEach(NationUtil::printWithParenthesis);
    }
}
