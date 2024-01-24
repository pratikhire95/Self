package Ms1_Day2;

import java.util.Scanner;

public class StaticIllustration {
    private int i1;
    private static int i2;
    public  StaticIllustration(int i1, int i2){
        this.i1 = i1;
        this.i2 = i2;
    }
    public int getI1(){
        return i1;
    }
    public int getI2(){
        return i2;
    }
    public void setI1(int i1){
        this.i1 = i1;
    }
    public  void setI2(int i2){
        this.i2 = i2;
    }
    public void display(){
        System.out.println("i1 = " + i1 + " i2 = " + i2);
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter object 1 details: ");
        int i1 = in.nextInt();
        int i2 = in.nextInt();
        StaticIllustration sI = new StaticIllustration(i1,i2);
        sI.display();
        StaticIllustration sI2 = new StaticIllustration(i1,i2);
        sI2.setI1(2);
        sI2.setI2(4);
        sI2.display();
        sI.display();


    }
}
