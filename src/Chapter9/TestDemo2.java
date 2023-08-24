package Chapter9;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TestDemo2 {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    int point = 0;
    while(point >= 0) {
      System.out.print("점수를 입력하세요 : ");
      point = in.nextInt();
      if(point > 0) {
        points.add(point);
      }
    }
    System.out.println(points);
    int topPoint = 0;
    for(int i = 0; i < points.size(); ++i) {
      if(topPoint < points.get(i)) topPoint = points.get(i);
    }

    for(int i = 0; i < points.size(); ++i) {
      System.out.print(i+"번 학생의 성적은 "+points.get(i)+"점이며 등급은");
      if(topPoint - 10 < points.get(i)) {
        System.out.print("A");
      } else if (topPoint - 20 < points.get(i)) {
        System.out.print("B");
      } else {
        System.out.print("C");
      }
      System.out.println("이다");
    }
  }
}
