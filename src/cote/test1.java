package cote;

import java.util.Arrays;

public class test1 {
  public static void main(String[] args) {
    int n = 4;
    int[] slicer = {1, 5, 2};
    int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int a = 0,b = 0;
    int c = 1;
    if(n == 1) {
      b = slicer[1];
    } else if (n == 2) {
      a = slicer[0];
      b = num_list.length-1;
    } else if (n == 3) {
      a = slicer[0];
      b = slicer[1];
    } else if (n == 4) {
      a = slicer[0];
      b = slicer[1];
      c = slicer[2];
    }
    int[] answer = {};
    for(int i = a; i <= b; i+=c ) {
      answer = pushBack(answer,num_list[i]);
    }

    System.out.println(Arrays.toString(answer));
  }
  static int[] pushBack(int[]arr, int num) {
    int[] newArr = new int[arr.length+1];
    for(int i = 0; i < arr.length; ++i){
      newArr[i] = arr[i];
    }
    newArr[newArr.length-1] = num;
    return newArr;
  }
}
