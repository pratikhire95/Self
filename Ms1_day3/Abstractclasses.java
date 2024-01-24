package Ms1_day3;

public class Abstractclasses {
    public static void main(String[] args) {
        Bank b = new SBI();
        System.out.println("Rate of INterest" + b.getRateOfInterest());
        b = new PNB();
        System.out.println("Rate of INterest " + b.getRateOfInterest());

    }
}

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class Axis extends Bank {
    int getRateOfInterest() {
        return 6;
    }
}
