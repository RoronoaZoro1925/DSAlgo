package Sorting;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int arr[] = {10,5,8,20,2,18};
        int n = arr.length;
//        basicSelectSort(arr,n);
//        selectSort(arr,n);
//        Arrays.stream(arr).forEach(System.out::println);
//        for(int i : arr)
//            System.out.println(i);
        double d = 55.5;
        d = d%10;
        System.out.println(d);

    }

    public static void basicSelectSort(int arr[], int n)
    {
        int temp[] = new int [n];
        for (int i = 0; i < n; i++)
        {
            int min_mid = 0;
            for (int j = 1; j < n; j++)
            {
                if(arr[j]<arr[min_mid])
                {
                    min_mid=j ;
                }
            }
            temp[i] = arr[min_mid];
            arr[min_mid] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++)
        {
            arr[i] = temp[i];

        }

    }

    public static void selectSort(int arr[], int n)
    {
        int temp = 0;
        for (int i = 0; i < n-1; i++)
        {
            int min_number = i;

            for (int j = i+1; j < n; j++)
            {
                if (arr[j]<arr[min_number])
                {
                    min_number = j;
                }
            }
            temp = arr[min_number];
            arr[min_number] = arr[i];
            arr[i] = temp;
        }
    }
}