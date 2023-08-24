package Chapter9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestDemo {
  public static void main(String[] args) {
    ArrayList<String> animals = new ArrayList<>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("다람쥐");
    animals.add("라마");
    for(String a : animals) {
      if(a.length() == 2) {
        System.out.println(a);
      }
    }
    Set<Person> set = new HashSet<>();
//    Set<Person> set = new HashSet<>(){
//      @Override
//      public boolean add(Person person) {
//        for(Person p: this) {
//          if(p.name.hashCode() == person.name.hashCode() &&
//          p.age == person.age) {
//            return false;
//          }
//        }
//        return super.add(person);
//      }
//    };
    set.add(new Person("김열공",20));
    set.add(new Person("최고봉",56));
    set.add(new Person("우등생",16));
    set.add(new Person("나자바",35));
    set.add(new Person("나자바",35));
    set.add(new Person("나자바",34));
    set.add(new Person("김자바",34));
    Iterator<Person> iterator = set.iterator();
    for(Person a : set) {
      System.out.println("포문 : " +a);
//      System.out.println("이터 : " +iterator.next());
      System.out.println(a.equals(new Person("김열공",20)));
    }
    System.out.println();

  }
}

class Person {
  String name;
  int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return this.name  + " : " + this.age;
  }

  @Override
  public int hashCode() {
    return name.hashCode()+age;
  }

  @Override
  public boolean equals(Object obj) {
    if (this.hashCode() == obj.hashCode()){
      return true;
    }
    return false;
  }
}