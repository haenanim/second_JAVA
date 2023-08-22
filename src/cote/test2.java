package cote;

import java.util.ArrayList;
import java.util.Arrays;

public class test2 {
  public static void main(String[] args) {
    Solution test = new Solution();
    int[] arr = {1,2,3,4,5};
    int[][] intervals = {{1,3},{0,4}};
    System.out.println(Arrays.toString(test.solution(arr, intervals)));
  }
}
class Solution {
  public int[] solution(int[] arr, int[][] intervals) {
    int[] answer = new int[intervals[0][1] - intervals[0][0] + intervals[1][1] - intervals[1][0] + 2];
    int count = 0;
    for(int i = 0; i < 2; ++i) {
      for(int j = intervals[i][0]; j <= intervals[i][1]; ++j) {
        answer[count] = arr[j];
        count++;
      }
    }
    return answer;
  }
}
