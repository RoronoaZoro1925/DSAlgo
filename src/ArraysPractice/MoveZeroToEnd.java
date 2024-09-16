package ArraysPractice;

import java.lang.reflect.Array;

public class MoveZeroToEnd
{
    public static void main(String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
//        moveZeroEnd(arr);
        pushZeroToEnd(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }
    static void swap(int firstIndex, int secondIndex)
    {

        int temp = firstIndex;
        firstIndex = secondIndex;
        secondIndex = temp;

    }
    static void moveZeroEnd(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i+1; j < arr.length; j++)
                {
                    if (arr[j]!= 0)
                    {
                        swap(arr[i],arr[j]);
                    }

                }

            }

        }
    }

    static void pushZeroToEnd(int arr[])
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[count++] = arr[i];
            }
        }
        while (count<arr.length)
        {
            arr[count++] = 0;
        }
    }
}
