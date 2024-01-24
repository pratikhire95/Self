package Ms1_day3;

public class Override extends Vehicle{
    void print(){
        System.out.println("Ovveride is happening...");
    }
    public static void main(String[] args) {
        Override over = new Override();
        over.print();
    }
}

class Vehicle{
    void print(){
        System.out.println("Vehicle is running......");
    }
}
