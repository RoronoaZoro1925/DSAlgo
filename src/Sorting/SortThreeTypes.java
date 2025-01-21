package Sorting;

public class SortThreeTypes
{
    public static void main(String[] args)
    {
        int arr[] = {0,1,1,2,0,1,1,2};
//        naiveSort(arr);
        dutchNationalFlagAlgo(arr);
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static void naiveSort(int arr[])
    {
        int temp [] = new int[arr.length];
        int i = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 0)
            {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 1)
            {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j] == 2)
            {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length-1; j++)
        {
            arr[j] = temp[j];

        }
    }

    public static void dutchNationalFlagAlgo(int[] arr)
    {
        int low = 0, mid = 0, high = arr.length-1;
        while (mid<=high)
        {
            switch (arr[mid])
            {
                case 0:
                {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }

            }


        }
    }
}
