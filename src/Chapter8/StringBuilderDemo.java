package Chapter8;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s = new String("Hi");
    System.out.println(s.hashCode());
    s += "!";
    System.out.println(s.hashCode());
    StringBuilder a = new StringBuilder("Hi");
    System.out.println(a);
    System.out.println(a.hashCode());
    a.append("!");
    System.out.println(a);
    System.out.println(a.hashCode());
  }
}
