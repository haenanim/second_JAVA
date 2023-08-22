package Chapter8;

import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    char[] c1 = {'j','a','v','a'};
    char[] c2 =  Arrays.copyOf(c1,c1.length);
    String[] s1 = {"A","B","C","D"};
    Arrays.binarySearch(s1, "D");
    int a,b,c = 0;
  }
}
