package Searching;

public class SearchInfiniteArray
{
    public static void main(String[] args)
    {
        int arr [] = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int x = 12;
        System.out.println(searchInfinite(arr,x));

    }
    public static int searchInfinite(int arr[], int x)
    {
        if(arr[0] == x)
            return -1;
        int i = 1;
        while (arr[i]<x)
        {
            i = i*2;
        }
        if (arr[i]==x)
            return i;
        return binarySearch(arr,x,i/2+1,i-1);
    }
    public static int binarySearch(int arr[], int x, int low, int high)
    {
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid] == x)
            return mid;
        else if (arr[mid]>x)
        {
            return binarySearch(arr, x, low , mid-1);
        }
        else
        {
            return binarySearch(arr, x, mid+1 , high);
        }

    }
}
