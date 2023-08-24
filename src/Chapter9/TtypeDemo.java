package Chapter9;

import java.util.Collection;

public class TtypeDemo {
  public static void main(String[] args) {
    Coffee coffee = new Coffee();
    Pocari pocari = new Pocari();
    Cup cup = new Cup();
    cup.showKind(coffee);
    cup.showKind(pocari);
  }
}


class Water {
  String name = "";
}

class Coffee extends Water {
  String name = "Stabucks";
}
class Pocari extends Water {
  String name = "Pocari";
}

class Cup<T extends Water> {
  public void showKind(T water) {
    System.out.println(water.name);
  }
}