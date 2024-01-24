package Ms1_day3;

public class Covariant extends A {
    
    Covariant get() {
        return this;
    }

    void message() {
        System.out.println("Welcome to Covariant");
    }

    public static void main(String[] args) {

        System.out.println(new Covariant().get());
    }
}

class A {
    A get() {
        return this;
    }
}