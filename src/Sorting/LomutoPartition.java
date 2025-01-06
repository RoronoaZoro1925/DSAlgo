package Sorting;

public class LomutoPartition
{
    public static void main(String[] args)
    {
        int arr[] = {10,80,30,90,40,50,70};
        int brr[] = {50,30,11,10,5,20};
//        int n = brr.length;
        pivotPartition(arr,0, arr.length-1);
        for(int i:arr)
            System.out.print(i + " ");

    }

    public static int pivotPartition(int brr[], int low, int high)
    {
        int pivot = high;
        int i = low-1;
        for (int j = low; j <= high-1 ; j++)
        {
            if (brr[j]<brr[pivot])
            {
                i++;
                int temp = brr[i];
                brr[i] = brr[j];
                brr[j] = temp;
            }
        }
        int temp = brr[i+1];
        brr[i+1] = brr[high];
        brr[high] = temp;
        return i+1;
    }
}
