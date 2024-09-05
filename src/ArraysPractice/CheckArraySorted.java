package ArraysPractice;

public class CheckArraySorted
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3};
        System.out.println(checkSorted(arr));
        System.out.println(checkSort(arr));

    }
    static boolean checkSorted(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i+1; j < arr.length ; j++)
            {
                if (arr[j]<arr[i])
                {
                    return false;
                }

            }

        }
        return true;
    }

    static boolean checkSort(int arr[])
    {
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i]<arr[i-1])
            {
                return false;
            }

        }
        return true;
    }
}
