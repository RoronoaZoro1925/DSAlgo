package Sorting;

public class QuickHSort
{
    public static void main(String[] args)
    {
        int arr[] = {8,4,7,9,3,10,5,12,2};
        quickSort(arr,0,arr.length-1);
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static void quickSort(int arr[], int low, int high)
    {
        if (low<high)
        {
            int partition = hoaresPartion(arr,low,high);
            quickSort(arr,low,partition);
            quickSort(arr, partition+1,high);
        }

    }

    public static int hoaresPartion(int arr[], int low, int high)
    {
        int pivot = arr[low];
        int i = low-1;
        int j = high+1;
        while (true)
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
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }
}
