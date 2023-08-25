package Chapter9;

public class LambdaParameDemo {
    public static void main(String[] args) {
        MyFunction f = (a,b) -> a > b ? a : b;
        myMethod(f);
        MyFunction myFunction = myFunction2();
        System.out.println(myFunction.max(2,3));
    }
    static void myMethod(MyFunction f){
        System.out.println(f.max(   3,5));
    }
    static MyFunction myFunction2() {
        MyFunction f = ((a, b) -> a>b?a:b);
        return f;
    }
}
