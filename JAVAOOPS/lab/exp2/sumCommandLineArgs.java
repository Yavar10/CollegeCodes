package lab.exp2;

import java.util.Scanner;

public class sumCommandLineArgs {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < args.length; i++) {
            args[i]=sc.next();
        }
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.println("Sum = " + sum);
    }
}

