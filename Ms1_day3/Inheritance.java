package Ms1_day3;
class Inheritance extends Emp{
    String type;
    Inheritance(int id, String name, double sal, String type){
        super(id, name, sal);
        this.type = type;
    }
    public static void main(String[] args) {
        Inheritance inh = new Inheritance(1,"pratik",20000.0,"TTTT");
        inh.display();
    }
}

class Emp{
   public int id;
    public String name;
    public double sal;
    Emp(int id, String name, double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    void display(){
        System.out.println(id +" "+ name + " " + sal);
    }
}
