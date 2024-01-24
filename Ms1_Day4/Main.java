package Ms1_Day4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> hash_set = new HashSet<>();
        hash_set.add("Java");
        hash_set.add("Python");
        hash_set.add("Golang");
        hash_set.add("Ashish");
        hash_set.addAll(Arrays.asList(new String[] {"Pratik","Ashish", "Jigar"}));
        // LinkedHashSet<String> lhs = new LinkedHashSet<>(hash_set);
        System.out.println(hash_set);
        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7}));
        Iterator<Integer> iterator = set.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            sum = sum + iterator.next();
        }
        System.out.println(sum);

    }
}
