package Sorting;

public class KthSmallestElement
{
    public static void main(String[] args)
    {
        int arr[] = {10,4,5,8,11,6,26};
        int k = 5;
        int index = partitionIndex(arr,k);
        System.out.println(arr[index]);

    }

    public static int partitionIndex(int arr[], int k)
    {
        int l = 0, h = arr.length-1;
        while (l<=h)
        {
            int partition = pivotPartition(arr,l,h);
            if (partition == k-1)
            {
                return partition;
            }
            else if (partition>k-1)
            {
                h = partition-1;
            }
            else
            {
                l=partition+1;
            }
        }
        return -1;
    }

    public static int pivotPartition(int[] arr, int low, int high)
    {
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
