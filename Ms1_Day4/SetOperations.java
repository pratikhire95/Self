package Ms1_Day4;

import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // HashSet<Integer> hs1 = new HashSet<Integer>();
        // HashSet<Integer> hs2 = new HashSet<Integer>();
        // hs1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        // hs2.addAll(Arrays.asList(new Integer[]{1, 3, 5, 6}));
        // System.out.println(hs1);
        // System.out.println(hs2);
        // hs1.retainAll(hs2);
        // System.out.println(hs1);
        // hs1.addAll(hs2);
        // System.out.println(hs1);
        
        // System.out.println(hs1);
        // hs1.removeAll(hs2);
        // System.out.println(hs1);
        TreeSet<Employee1> tset = new TreeSet<>();
        Employee1 emp1;
        Comparator<Employee1> comparator = 

        for(int i = 0; i < 2; i++){
            int sal = in.nextInt();
            int id = in.nextInt();
            in.nextLine();
            String nam = in.nextLine();
            emp1 =  new Employee1(sal, id, nam);
            tset.add(emp1);
        }
        

        


       
        
        System.out.println(tset);
       



    }

    
}
class Employee1{
    int salary;
    int id;
    String empName1;
    public Employee1(int sal, int id1, String name){
        salary = sal;
        id = id1;
        empName1 = name;
    }
}
