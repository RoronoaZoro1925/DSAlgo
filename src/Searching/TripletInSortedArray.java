package Searching;

public class TripletInSortedArray
{
    public static void main(String[] args) {

    }

    public static boolean isPair(int arr[], int x, int si)
    {
        int i = si, j = arr.length-1;
        while (i<j)
        {
            if (arr[i]+arr[j]==x)
//                System.out.println("The ");
                return true;
            else if (arr[i]+arr[j]<x) {
                i++;
            }
            else
                j--;
        }
        return false;
    }

    public static boolean isTriplet(int arr[], int x)
    {
        for (int i = 0; i < arr.length-2; i++)
        {
            if (isPair(arr,x-arr[i],i+1));
            {
                return true;
            }
        }
        return false;
    }
}
