package ArraysPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestElement
{
    public static void main(String[] args)
    {
        int arr[] = {12,14,18,20,22};
        Arrays.sort(arr);
//        System.out.println(secondLargest(arr));
        System.out.println(secondLarge(arr));

    }
    static int getLargest(int arr[])
    {
        int result=arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>result)
            {
                result=i;
            }

        }
        return result;

    }

    static int secondLargest(int arr[])
    {
        int largest=getLargest(arr);
        int result=-1;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]!=arr[largest ])
            {
                if (result==-1)
                {
                    result=i;
                }
                else if (arr[i]>arr[result])
                {
                    result=i;
                }
            }

        }
        return result;
    }

    static int secondLarge(int arr[])
    {
        int result=-1;
        int largest =0;
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++)
        {
            if (arr[i]>arr[largest])
            {
                result=largest;
                largest=i;
            } else if (arr[i]!=arr[largest])
            {
                if (result==-1||arr[i]>arr[result])
                {
                    result=i;
                }

            }

        }
        return result;
    }

}
