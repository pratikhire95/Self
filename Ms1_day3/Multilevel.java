package Ms1_day3;

public class Multilevel{
    
    public static void main(String[] args) {
        
       Sheep s =new Sheep(0, "Pratik", "white&black");
       Multilevel mul = new Multilevel();
       mul.eat();
       s.eat(); 
       s.bark();
       s.sound();
    }

    private void eat() {
    }
}
class Animal{
    int a;
    String b;
    public Animal(int a, String b){
        this.a = a;
        this.b = b;
    }
    void eat(){
        System.out.println("Eating......" + a + b);
    }
}
class Dog extends Animal{
    
   public Dog(int a, String b) {
        super(a, b);
       
    }

public void bark(){
        System.out.println("Barking......");
    }
}
class Sheep extends Dog{
    String sheep;
    public Sheep(int a, String b, String sheep) {
        super(a, b);
        this.sheep = sheep;
    }

    void sound(){
        System.out.println("ba ba ....." + sheep);

    }
}
