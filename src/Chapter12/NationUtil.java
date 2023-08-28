package Chapter12;

public class NationUtil {
    public static <T> void print(T t) {
        System.out.print(t + " ");
    }
    public static <T> void printWithParenthesis(T t) {
        System.out.print("(" + t + ") ");
    }
}
