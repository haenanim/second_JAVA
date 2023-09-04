package Chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CpEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(

                "This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
        list.stream()
                .map(x -> x.toLowerCase())
                .filter(x -> x.contains("java"))
                .forEach(System.out::println);



        List<Member> list1 = Arrays.asList(
                new Member("홍길동", 30,"a"),
                new Member("신용권", 40,"a"),

                new Member("감자바", 26,"a")
        );

        double avg = list1.stream().mapToInt(x -> x.getAge()).average().getAsDouble();

        System.out.println("평균 나이: " + avg);

        List<Member> list2 = Arrays.asList(
                new Member("홍길동", 30,"a"),
                new Member("신용권", 40,"a"),

                new Member("감자바", 26,"a")
        );

    }
}

class Member {
    private String name;
    private int age;
    private String job;
    public Member(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}

