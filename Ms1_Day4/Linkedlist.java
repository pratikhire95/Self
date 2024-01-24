package Ms1_Day4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        ArrayList<Person1> arr1 = new ArrayList<Person1>();
        Person1 p;
        for(int i = 0; i <=1; i++){
            int id1 = in.nextInt();
            in.nextLine();
            String name1 = in.nextLine();
            int salary1 = in.nextInt();
            p = new Person1(id1, name1, salary1);
            arr1.add(p);

        }
        
        
        
        System.out.println(arr1);
        if(arr1.contains(p)){
            arr1.remove(p.name);
        }
        System.out.println(arr1);
    }
}

class Person1{
    int id;
    String name;
    int salary;
    public Person1(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public String toString(){
        return id + " "+ name +" "+ salary;
    }
}
