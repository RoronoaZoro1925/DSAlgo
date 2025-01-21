package Sorting;

public class SortTypes
{
    public static void main(String[] args)
    {
        int arr[] = {13,-12,18,-10};
//        naiveSegregate(arr);
        efficientSegregate(arr);
        for (int x:arr)
            System.out.print(x + " ");

    }

    public static void naiveSegregate(int arr[])
    {
        int temp [] = new int[arr.length];
        int i = 0;
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j]<0)
            {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if (arr[j]>0)
            {
                temp[i] = arr[j];
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            arr[j] = temp[j];

        }
    }

    public static void efficientSegregate(int arr[])
    {
        int i = -1;
        for (int j = 0; j < arr.length ; j++)
        {
            if (arr[j]<0)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
    }
}
