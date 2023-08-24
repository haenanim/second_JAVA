package Chapter9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
  public static void main(String[] args) {
    List<String> cars = List.of("소타나","아반떼","캐스퍼","모닝");
    List<String> list = new ArrayList<>(cars);
    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    list.add("소울");
    for (String car : list) {
      System.out.println(car + ":");
    }
    list.add(0,"뉴그랜저");
    System.out.println(list);
    list.remove(5);
    System.out.println(list);
    list.remove("뉴그랜저");
    System.out.println(list);
    list.remove(list.get(0));
    System.out.println(list);
  }
}
