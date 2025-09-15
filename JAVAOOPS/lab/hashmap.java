package lab;

import java.util.HashMap;

public class hashmap {

    static HashMap<Integer,Integer> map = new HashMap<>();
    public static void main(String[] args) {
        hashmap obj= new hashmap();
        obj.add(62);
        obj.add(68);
        obj.add(64);
        obj.add(64);
        obj.display();
        System.out.println("62 exists?: "+obj.exists(62));
        obj.delete(62);
        System.out.println("62 exists?: "+obj.exists(62));
        System.out.println("66 exists?: "+obj.exists(68));
        obj.display();
        obj.delete(64);
        obj.display();
    }
    static void add(int x)
    {
        map.put(x, map.getOrDefault(x, 0) + 1);
    }
    static void delete(int x)
    {
        map.remove(x);
    }
    static boolean exists(int x)
    {
       return map.containsKey(x);
    }
    static void display()
    {
        for (int key:map.keySet())
        {
            System.out.println(key+": "+map.get(key));
        }
    }
}
