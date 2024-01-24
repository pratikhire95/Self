package Ms1_Day4;
import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class WrapClasses {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(5);

       
        arr.add(30);
        arr.add(40);
        arr.add(40);
        arr.add(50);
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        ListIterator<Integer> iterator =  arr.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
        

    }
}
