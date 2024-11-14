package Searching;

import java.util.Arrays;

public class BinarySearchIterative
{
    public static void main(String[] args) {
       int arr[] = {2,3,4,6,70,80,80};
       int sr[] = {4,10,2,6,40,5};
       int x = 3;
//        System.out.println(indexSearch(arr,x));
        System.out.println(binarySearch(arr,x));
//        System.out.println(recursiveBinarySearch(arr,0,arr.length,x));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);

    }
    static int indexSearch(int arr[], int x)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == x)
            {
                return i;
            }

        }
        return -1;
    }

    static int [] sortArray(int arr[])
    {
        int temp = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j <arr.length ; j++)
            {
                if (arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        return arr;
    }

    static int binarySearch(int arr[], int x)
    {
        sortArray(arr);
        int low = 0, high = arr.length-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if (arr[mid]==x)
                return mid;
            else if (arr[mid]>x)
            {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return -1;
    }

    static int recursiveBinarySearch(int arr[], int low, int high, int x)
    {
        if (low>high)
            return -1;
        int mid = (low+high)/2;
        if (arr[mid]==x)
            return mid;
        else if (arr[mid]>x)
        {
            return recursiveBinarySearch(arr,low,mid-1,x);
        }
        else
            return recursiveBinarySearch(arr,mid+1,high,x);
    }
}
