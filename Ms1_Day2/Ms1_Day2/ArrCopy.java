package Ms1_Day2.Ms1_Day2;

import java.util.Scanner;

public class ArrCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        char[] pArr = new char[10];
        char[] arr = {'j','a','v','a','p','y','t','h','o','n'};
        System.arraycopy(arr, 0, pArr, 0, 6);
        for (char c : pArr) {
            System.out.println(c);
        }

        pArr = arr.clone();
        System.out.println("cloned array");
        for (char c : pArr) {
            System.out.println(c);
        }
       
    }
}
