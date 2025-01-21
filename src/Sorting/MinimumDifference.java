package Sorting;

import java.util.Arrays;

public class MinimumDifference
{
    public static void main(String[] args)
    {
        int arr[] = {5,3,8,4};
//        System.out.println(naiveMinimum(arr));;
        System.out.println(efficientDifference(arr));

    }

    public static int naiveMinimum(int arr[])
    {

        int result = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                result = Math.min(result,Math.abs(arr[i]-arr[j]));
            }
        }
        return result;
    }

    public static int efficientDifference(int arr[])
    {
        Arrays.sort(arr);
        int result = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++)
        {
            result = Math.min(result,Math.abs(arr[i]-arr[i-1]));

        }
        return result;

    }
}
