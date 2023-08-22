package Chapter8;

import java.security.Key;

public class ObjectMethodDemo {
  public static void main(String[] args) {
    Mouse mouse1 = new Mouse("Samsung");
    Mouse mouse2 = new Mouse("Samsung");
    Keyboard keyboard1 = new Keyboard("Samsoung");
    Keyboard keyboard2 = new Keyboard("Samsoung");
    System.out.println(mouse1.equals(mouse2));
    System.out.println(keyboard1.equals(keyboard2));
//
//    Class c = keyboard1.getClass();
//    System.out.println(c.getName());
//    System.out.println(c.getSimpleName());
//    System.out.println(c.getTypeName());
//    System.out.println(c.getPackage().getName() );



  }
}

class Mouse {
  String name;

  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || this.getClass() != obj.getClass()) return false;
    return this.name == ((Mouse)obj).name;
  }

  public Mouse(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name + "키보드";
  }
}
class Keyboard {
  String name;
  public Keyboard(String name) {
    this.name = name;
  }
  @Override
  public boolean equals(Object obj) {
    if(this == obj) return true;
    if(obj == null || this.getClass() != obj.getClass()) return false;
    return this.name == ((Keyboard)obj).name;
  }
  @Override
  public String toString() {
    return name + "키보드";
  }
}
