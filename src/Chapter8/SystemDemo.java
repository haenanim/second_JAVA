package Chapter8;

import java.util.Arrays;

public class SystemDemo {
  public static void main(String[] args) throws InterruptedException {
    int[] numbers = new int[10000];
    System.out.println(System.nanoTime());
    for (int i = 0; i < 10000; ++i) {
      numbers[i] = i;
    }
    System.out.println(Arrays.toString(numbers));
    System.out.println(System.nanoTime());
    int a = 0;
    long curruntTime = System.currentTimeMillis();
    System.out.println(System.currentTimeMillis());
    Thread.sleep(1000);
    System.out.println(System.currentTimeMillis());
//    while(true) {
//      a++;
//      System.out.println(a);
//    }
  }
}
