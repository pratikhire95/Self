package Ms1_Day2;

import java.util.Scanner;

public class ArrayPractice {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int min = Integer.MAX_VALUE;
    int[] arr = new int[n];
    int max = -1;
    for (int i = 0; i < n; i++) {
      arr[i] = in.nextInt();
    }
    for (int i = 0; i < n; i++) {
      if (max < arr[i]) {
        max = arr[i];
      } else {
        min = arr[i];
      }
    }
    System.out.println(max);
    System.out.println(min);
  }

}
