package lab;

public class merge {
    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int n = arr.length;


        divide(arr, 0, n - 1);


        System.out.print("Sorted Array: ");
        for (int x : arr)
            System.out.print(x + " ");
    }
    static void divide(int arr[],int l,int r)
    {
        int m=(l+r)/2;
        if(l<r)
        {divide(arr,l,m);
            divide(arr,m+1,r);
            Merge(arr,l,m,r);}
    }

    static void Merge(int arr[],int l,int m,int r)
    {
        int n=r-l+1;
        int temp[]=new int[n];

        int i=l,j=m+1; //pointer for left right
        int k=0; //temp variable

        while(i<=m&&j<=r)//since mid & r are all in the arrayso well put <=
        {
            if(arr[i]<arr[j])
                temp[k++]=arr[i++];
            else
                temp[k++]=arr[j++];
        }
        while(i<=m)
            temp[k++]=arr[i++];
        while(j<=r)
            temp[k++]=arr[j++];

        for (int x = 0; x < n; x++)
            arr[l + x] = temp[x];
    }


}