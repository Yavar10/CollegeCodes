package lab;

import java.util.Scanner;

public class Number {
   private double num=652;
    public static void main(String[] args) {
        Number obj= new Number();
        System.out.println("Zero="+obj.isZero());
        System.out.println("isPositive="+obj.isPositive());
        System.out.println("isNegative="+obj.isNegative());
        System.out.println("isOdd="+obj.isOdd());
        System.out.println("isEven="+obj.isEven());
        System.out.println("isPrime="+obj.isPrime());
        System.out.println("isArmstrong="+obj.isArmstrong());
    }
    boolean isZero()
    {
        return num == 0;
    }
    boolean isPositive(){
        return num > -1;
    }
    boolean isNegative()
    {
        return num<0;
    }
    boolean isOdd()
    {
        return num%2==1;
    }
    boolean isEven()
    {
        return num%2==0;
    }
    boolean isPrime()
    {
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    boolean isArmstrong()
    {
        String str= num+"";
        int power=str.length();
        double x=num;
        double sum=0;
        while(x!=0)
        {
            sum+=Math.pow(x%10,power);
            x=x/10;
        }
        return sum==num;
    }

}
