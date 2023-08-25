package Chapter9;

import static Chapter9.Example.maxOrMin;

public class ExampleTest5 {
    public static void main(String[] args) {
        int max = maxOrMin((x,y) -> x >= y ? x : y );
        System.out.println("최대값: " + max);
//최소값 얻기
        int min = maxOrMin((x,y) -> x <= y ? x : y );
        System.out.println("최소값: " + min);
    }
}
interface Operator {
    public int apply(int x, int y);
}
class Example {
    private static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }
}