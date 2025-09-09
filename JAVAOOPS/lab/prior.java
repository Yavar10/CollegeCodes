package lab;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class prior {
    public static void main(String[] args) {
        PriorityQueue<Integer> pri=new PriorityQueue<Integer>();
        pri.add(45);
        pri.add(78);
        pri.add(66);
        System.out.println(pri.peek());
        System.out.println(pri.poll());
        System.out.println(pri.peek());
    }
}
