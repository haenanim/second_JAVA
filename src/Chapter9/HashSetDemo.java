package Chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
  public static void main(String[] args) {
    Set<String> set = Set.of("A","B","C","D","E");
    HashSet<String> hashSet = new HashSet<>(set);
    hashSet.add("F");
    System.out.println(set);
    System.out.println(hashSet);
    Iterator<String> iterator = hashSet.iterator();
    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println(hashSet.add("E"));
  }

  static <T> boolean isExist(Set<T> set, T obj){
    boolean isExist = false;
    for(T ele : set) {
      if(ele.hashCode() == obj.hashCode()) {
        isExist = true;
        break;
      }
    }
    return isExist;
  }
}
