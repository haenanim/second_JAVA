package Chapter12;

import java.io.PrintStream;
import java.util.Optional;

public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = "안녕"; // or String s1 = null;
        Optional<String> o1 = Optional.ofNullable(s1);
        String s2 = null;
        Optional<String> o2 = Optional.ofNullable(s2);

        if(o2.isPresent()) {
            NationUtil.print(o2.get());
        } else {
            System.out.println("데이터가 없습니다.");
        }

        String s = o2.orElse("데이터가 없음");
        System.out.println(s);
//        if(s1 != null)
//            NationUtil.print(s1);
//        else
//            NationUtil.print("없음");
//        if(o.isPresent())
//            NationUtil.print(o.get());
//        else
//            NationUtil.print("없음");
//        String s2 = o.orElse("없음");
//        NationUtil.print(s2);
//        o.ifPresentOrElse(NationUtil::print, () -> System.out.println("없음"));
    }
}
