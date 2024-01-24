package Ms1_Day4;

import java.util.*;

public class Mapimpl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "Pratik");
        hm.put(1002, "Ashish");
        hm.put(1003, "Jigar");
        hm.put(1004, "Rajrit");
        hm.put(1004, "Ashish");
        System.out.println(hm);
        // Set hms1 = hm.keySet();
        // System.out.println(hms1);
        // Set hms2 = (Set) hm.values();
        // System.out.println(hms2);
        // List lhs = (List) hm.values();
        // System.out.println(lhs);
        
        Iterator it1 =  hm.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry m = (Map.Entry)it1.next();
            System.out.println(m.getKey()+" "+m.getValue());
            
        }

        
        
    }
}
