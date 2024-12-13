package Sorting;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int arr[] = {20,5,40,60,10,30};
        insertionSort(arr);
        for (int i : arr)
            System.out.println(i);

    }

    public static void insertionSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key)//>= This sign was not included because of the stability of the algorithm.
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    
}
