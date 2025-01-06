package Sorting;

import java.util.Arrays;

public class HoaresPartition
{
    public static void main(String[] args)
    {
        int arr [] = {5,3,8,4,2,7,1,10};
        int brr[] = {4,6,2,5,7,9,1,3};
        partition(brr,0,brr.length-1);
//        Arrays.sort(arr);
        for (int i:brr)
            System.out.print(i + " ");

    }

    public static int partition(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low-1,j=high+1;
        while(true)
        {
            do {
                i++;
            }while (arr[i]<pivot);
            do {
                j--;
            }while (arr[j]>pivot);
            if (i>=j)
                return j;
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}
