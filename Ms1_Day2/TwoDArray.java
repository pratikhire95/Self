package Ms1_Day2;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int col = in.nextInt();
        long sum = 0;
        int[][] arr = new int[rows][col];
        int[][] arr1 = new int[rows][col];
        int flag = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = in.nextInt();
                arr1[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < col; j++){
                if(arr[i][j] != arr1[i][j]){
                    flag = 1;
                    break;    
                }else{
                    continue;
                }
            }
            if(flag == 1){
                break;
            }
        }
        if(flag == 1){
            System.out.println("Arrays are not equal in content");
        }else{
            System.out.println("Arrays are equal");
        }
        if(arr.length == arr1.length){
            System.out.println("Both arrays are equal in size");
        }

    }
}
