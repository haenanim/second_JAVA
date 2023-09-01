package Chapter14;

public class ThreadDemo5 {
  public static void main(String[] args) {
    Thread thread = new Thread(()->{
      for (int i = 0; i < 5; i++) {
        System.out.println("안녕");
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {

        }
      }
    });
    thread.start();

    for (int i = 0; i < 5; i++) {
      System.out.println("안녕2");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {

      }
    }

  }
}




