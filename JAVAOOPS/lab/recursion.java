package lab;

import java.util.Scanner;

public class recursion {
     static int s=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num={1,5,7,8,9,4};
        System.out.println(sortcheck(num, 0));

        /*rev(num);
        System.out.println(s);
        System.out.println(zero(num));*/
    }
   static void rev(int n)
    {
       if(n==0) return;
       s=s*10+n%10;
       rev(n/10);

    }
    static int zero(int n)
    {
        if(n==0)return 0;
        if(n%10==0)
        return 1+zero(n/10);
        else return zero(n/10);
    }
    static boolean sortcheck(int num[],int i)
    {
        if(i== num.length-1)
            return true;
        if(num[i]<=num[i+1])
            return sortcheck(num, i+1);
        else
            return false;
    }
}
