package Sorting;

public class QuickLSort
{
    public static void main(String[] args) {
        int arr[] = {4, 1, 3, 9, 7};
        quickSort(arr,0,arr.length-1);
        for (int x:arr)
            System.out.print(x + " ");
    }

    public static void quickSort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int partition = lomutoPartition(arr, low, high);
            quickSort(arr, low, partition-1);
            quickSort(arr, partition+1, high);
        }
    }

    private static int lomutoPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j = low; j <= high-1; j++)
        {
            if (arr[j]<pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}
