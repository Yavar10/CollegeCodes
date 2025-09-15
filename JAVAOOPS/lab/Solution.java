package lab;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        ArrayList<Integer>[] list = new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            list[i] = new ArrayList<Integer>();
            int size=sc.nextInt();
            for(int j=0;j<size;j++)
            {
                list[i].add(sc.nextInt());
            }
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int y=sc.nextInt();
            int x=sc.nextInt();
            //  System.out.println(x +" : "+y);
            if(list[y-1].size()-1>=x-1)
                System.out.println(list[y-1].get(x-1));
            else
                System.out.println("ERROR!");

        }
    }
}