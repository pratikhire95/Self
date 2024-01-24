package Ms1_day3;

import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in); 
      
       EmploDao ed1 = new EmploDao();
       ed1.calcBonus(20, 20);
       
    }
}

class EmploDao{
    public String type;
    public float fsalary;

    public void calcBonus(int salary, int days){
       System.out.println("itn is invoked");
    }
    public void calcBonus(float salary, float percent){
        System.out.println("float is invoked");
    }
}
