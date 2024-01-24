package Ms1_Day2;
import java.util.*;
public class Factorial{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do{
            displayMenu();
            choice = in.nextInt();
            switch(choice){
                case 1: 
                        System.out.println("Enter the number");
                        int n = in.nextInt();
                        long fact = calculateFactorial(n);
                        System.out.println(fact);
                        break;
                case 2:
                        
                        int m = in.nextInt();
                        long ans = sumOfFactorial(m);
                        System.out.println(ans);
                        break;
                case 3: 
                        int p = in.nextInt();
                        int q = in.nextInt();
                        int divans = (int) divisonOfFactorial(p, q);
                        System.out.println(divans);
                case 4: 
                    break;
            }
            
        }while(choice!=4);
    }
    static void displayMenu(){
        System.out.println("1. Calculate Factorial: ");
        System.out.println("2. Sum of factorial");
        System.out.println("3. Factorial division");

    }
    public static long calculateFactorial(int n){
        if(n > 1)
            return n*calculateFactorial(n-1);
        else
            return 1;
    }

    public static long sumOfFactorial(int m){
        long sum = 0;
        for(int i = 1; i <= m; i++){
            sum = sum + calculateFactorial(i);
        }
        return sum;
    }
    public static double divisonOfFactorial(int p, int q){
        double div = calculateFactorial(p)/calculateFactorial(q);
        return div;
    }
}