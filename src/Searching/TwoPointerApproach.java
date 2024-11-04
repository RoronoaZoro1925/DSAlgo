package Searching;

public class TwoPointerApproach
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,4,5,6,12,23,40};
        int x = 46;
        System.out.println(matchedNumber(arr,x));
    }

    public static boolean matchedNumber(int arr[], int x)
    {
        int i = 0 , j = arr.length-1;
        while (i<j)
        {
            if (arr[i] + arr[j] == x)
                return true;
            else if (arr[i] + arr[j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
