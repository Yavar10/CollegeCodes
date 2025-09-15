package lab;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,5,8,5,7,8,8,6,4,2,4,6};
        for(int i:arr) {
            if(set.contains(i))
            {
                System.out.println("Duplicate: "+i);
            }
            set.add(i);
        }
    }
}
