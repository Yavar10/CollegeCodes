/*
import java.util.Arrays;
import java.util.Scanner;

public class ALEXBOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        int l=0;
        int min=Integer.MAX_VALUE;
        int r=n-1;
        min=Math.min(min,arr[r]-arr[l]);
        while(k!=0)
        {
            arr[r]--;
            k--;
            if(arr[r]<arr[r-1])
                r--;
            min=Math.min(min,arr[r]-arr[l]);
            if(k==0)
                break;            arr[l]++;
            k--;
            if(arr[l]>arr[l+1])
                l++;
            min=Math.min(min,arr[r]-arr[l]);
        }
        System.out.println(min);
    }
}
*/
