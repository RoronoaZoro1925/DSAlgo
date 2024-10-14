package Searching;

public class CountAppearance
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,20,20,40,60};
        int x = 20;
        System.out.println(countOfOccurrence(arr,x));

    }
    static int firstOccurrence(int[] arr, int x)
    {
        int low = 0 , high = arr.length-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(x>arr[mid])
                low = mid+1;
            else if (arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(mid==0||arr[mid-1]!=arr[mid])
                {
                    return mid;
                }
                else
                    high = mid-1;
            }
        }
        return -1;
    }

    static int lastOccurrence(int arr[], int x)
    {
        int low = 0 , high = arr.length-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if (arr[mid]<x)
                low=mid+1;
            else if (arr[mid]>x)
            {
                high=mid-1;
            }
            else
            {
                if(mid==arr.length-1||arr[mid+1]!=arr[mid])
                    return mid;
                else
                    low = mid+1;
            }
        }
        return -1;
    }

    static int countOfOccurrence(int arr[], int x)
    {
        int first = firstOccurrence(arr,x);
        if (first == -1)
            return 0;
        else
            return lastOccurrence(arr,x) - first +1;
    }

}

