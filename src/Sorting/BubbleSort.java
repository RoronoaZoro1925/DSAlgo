package Sorting;

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr = {2,1,4,3};
//        int n = arr.length;
        doBubbleSort(arr);
        for (int i:arr)
        {
            System.out.print(i + " ");
        }

    }

    public static void doBubbleSort(int arr[])
    {
        boolean swapped;
        for (int i = 0; i < arr.length ; i++)
        {
            swapped = false;
            for (int j = 0; j < arr.length-i-1 ; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }

            }
            if (!swapped);
            break;
        }
    }
}
