package Ms1_day3;

public class InterfaceExample {
    public static void main(String[] args) {
        Bank1 b = new SBI1();
        System.out.println(b.getRoi());

    }
}
interface Bank1 {
    public int getRoi();
}

class SBI1 implements Bank1{
    public int getRoi(){
        return 7;
    }
}
