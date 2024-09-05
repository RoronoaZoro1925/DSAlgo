package ArraysPractice;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7};
        reverse(arr);
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }

    static void reverse(int arr[])
    {
        int low = 0 , high = arr.length-1;
        while (low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
