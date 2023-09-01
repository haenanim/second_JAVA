package Chapter14;

public class ThreadDemo1 {
  public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnablee());
//    thread.run();
    thread.start();
    for (int i = 0; i < 5; ++i) {
      System.out.println("메인입니다");

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}


class MyRunnablee implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; ++i) {
      System.out.println("안녕");

      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}