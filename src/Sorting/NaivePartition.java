package Sorting;

public class NaivePartition
{
    public static void main(String[] args)
    {
        int arr[] = {5,13,6,9,12,11,8};
        partition(arr,0, arr.length-1, arr.length-1);
        for (int i:arr)
            System.out.print(i + " ");

    }

    public static void partition(int arr[], int low, int high, int part)
    {
        int temp [] = new int[high-low+1];
        int index = 0;
        for (int i = low; i <=high; i++)
        {
            if (arr[i]<arr[part] && i!=part)
            {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++ ] = arr[part];
        for (int i = low; i <= high; i++)
        {
            if (arr[i]>arr[part])
            {
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[part];
        for (int i = low; i <=high ; i++)
        {
            arr[i] = temp[i-low];
        }
    }
}
