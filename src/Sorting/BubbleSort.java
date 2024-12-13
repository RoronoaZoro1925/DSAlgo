package Sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {41 ,9, 9, 48, 11, 2, 11, 12, 28, 10, 15, 4, 16, 48};
        int n = arr.length;
        doBubbleSort(arr,n);
        for (int i:arr)
        {
            System.out.print(i + " ");
        }

    }

    public static void doBubbleSort(int arr[], int n)
    {
        boolean swapped;
        for (int i = 0; i < n ; i++)
        {
            swapped = false;
            for (int j = 0; j < n - i - 1 ; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if (!(swapped != false));
            break;
        }
    }
}
