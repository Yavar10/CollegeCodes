package lab;

import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<>();

        int[] arr = {1, 5, 8, 5, 7, 8, 8, 6, 4, 2, 4, 6};

        System.out.println("Finding duplicates using TreeSet:");
        for (int i : arr) {
            if (!set.add(i)) {  //addition ka operation here
                System.out.println("Duplicate: " + i);
                set.remove(i);  //remove ka here
            }
        }

        System.out.println("Final elements in the TreeSet (sorted):");
        System.out.println(set.contains(2));
        System.out.println(set);
    }
}