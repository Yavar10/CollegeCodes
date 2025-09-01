package lab.exp2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.next();
        boolean flag=true;
        int len=str.length();
        int r=len-1;
        int l=0;
        while(l<=r)
        {
            if(str.charAt(l)!=str.charAt(r))
            {
                System.out.println("NOT A PALINDROME");
                flag=false;
                break;
            }
            l++;
            r--;
        }
        if(flag)
            System.out.println("PALINDROMEE");

    }
}
