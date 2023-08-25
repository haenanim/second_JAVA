package Chapter9;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Objects;

public class HashMap1Demo {
    public static void main(String[] args) {
//        Map<Fruit,Integer> fruits = new HashMap<>();
        Map<Fruit,Integer> fruits = new Hashtable<>();
        fruits.put(new Fruit("사과"),10);
        fruits.put(new Fruit("바나나"),5);
        fruits.put(new Fruit("딸기"),5);
        fruits.put(new Fruit("사과"),3);
//        fruits.put(null,3);

        System.out.println(fruits);
    }
}


class Fruit {
    String name;

    @Override
    public int hashCode() {
        return name.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Fruit fruit) {
            return fruit.hashCode() == this.hashCode();
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }

    public Fruit(String name) {
        this.name = name;
    }
}