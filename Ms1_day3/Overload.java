package Ms1_day3;

public class Overload {
    public static void main(String[] args) {
        Arithmatic ar = new Arithmatic();
        System.out.println(ar.add(3, 7));
        System.out.println(ar.add(2, 8, 4));
    }
}
class Arithmatic{
    public int add(int a, int b){
    return a+b;
   }
   public String add(int a, float b, int c){
    return Integer.toString((int)(a+b+c));
   }
}
