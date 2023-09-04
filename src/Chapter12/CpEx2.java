package Chapter12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CpEx2 {
    public static void main(String[] args) {
        List<Memberj> list = Arrays.asList(
                new Memberj("홍길동", "개발자"),

                new Memberj("김나리", "디자이너"),
                new Memberj("신용권", "개발자")
        );
        List<Memberj> developers = list.stream()
                        .filter(x -> x.getJob().equals("개발자"))
//                                .toList();
                                .collect(Collectors.toList());

        developers
                .stream()
                .forEach(m -> System.out.println(m.getName()));

        List<Memberj> list2 = Arrays.asList(
                new Memberj("홍길동", "개발자"),

                new Memberj("김나리", "디자이너"),
                new Memberj("신용권", "개발자")
        );
        Map<String, List<Memberj>> groupingMap = list2.stream().collect(Collectors.groupingBy(Memberj::getJob));
        groupingMap.get("개발자").forEach(x -> System.out.println(x.getName()+x.getJob()));
        groupingMap.get("디자이너").forEach(x -> System.out.println(x.getName()+x.getJob()));

    }
}
class Memberj {
    private String name;
    private String job;
    public Memberj(String name, String job) {
        this.name = name;
        this.job = job;
    }
    public String getName() { return name; }
    public String getJob() { return job; }
}
