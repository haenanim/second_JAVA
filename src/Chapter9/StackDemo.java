package Chapter9;

import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    System.out.println(stack.isEmpty());
    stack.push("main");
    stack.push("add");
    stack.push("println");
//    System.out.println(stack);
//    System.out.println(stack.pop());
//    System.out.println(stack);
    System.out.println(stack.size());
    for(int i = stack.size(); i > 0; --i) {
      System.out.println(stack );
      stack.pop();
    }
//    while(!stack.isEmpty()) {
//      System.out.println(stack.pop());
//    }
    stack.push("asdf");
    stack.push("af");
    stack.push("asd2");
    stack.add("sdufh");
    System.out.println(stack);
  }
}
