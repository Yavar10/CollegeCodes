package lab;

import java.util.ArrayList;

public class alist {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(88);
        list.add(78);
        list.add(66);
        list.add(38);
        list.add(7);
        list.add(85);
        System.out.println(list);
        list.remove(1);
        list.remove(4);
        System.out.println(list.get(2));
        System.out.println(list);
        if (list.contains(66))
            System.out.println("Yes it does");
        else
            System.out.println("nope it doesn't");
        list.add(1,1);
        System.out.println(list);
        list.set(1,0);
        System.out.println("after setting");
        System.out.println(list);
    }
}
