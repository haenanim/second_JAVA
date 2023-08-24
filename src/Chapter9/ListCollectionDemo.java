package Chapter9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ListCollectionDemo {
  public static void main(String[] args) {
    String[] animals1 = {"사슴","호랑이","바다표범","곰"};
    List<String> animals2 = Arrays.asList(animals1);
    animals2.set(1, "앵무새");
    Iterator<String> iterator = animals2.iterator();

    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }
    animals2.sort(Comparator.naturalOrder());
    for(String s : animals2) {
      System.out.print(s + " ");
    }
    System.out.println();

    animals1 = animals2.toArray(new String[0]);
    System.out.println(animals1[2]);
  }
}
