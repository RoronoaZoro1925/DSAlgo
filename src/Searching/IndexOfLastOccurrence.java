package Searching;

public class IndexOfLastOccurrence
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,4,4,5,5,6,6,6,6,6,7,8};
        int x = 6;
        System.out.println(recursiveLastIndex(arr,0,arr.length,x));

    }

    static int recursiveLastIndex(int arr[],int low, int high, int x)
    {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]<x)
            return recursiveLastIndex(arr,mid+1,high,x);
        else if (arr[mid]>x)
        {
            return recursiveLastIndex(arr,low,mid-1,x);
        }
        else
        {
            if (mid == arr.length - 1 || arr[mid] != arr[mid+1])
            {
                return mid;
            }
            return recursiveLastIndex(arr, mid+1,high,x);
        }

    }
}
