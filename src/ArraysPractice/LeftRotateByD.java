package ArraysPractice;

public class LeftRotateByD
{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n = arr.length;
        leftreverseArray(arr,d,n);
        for (int i:arr)
        {
            System.out.print(i + " ");
        }

    }

    static void leftRotate(int arr[])
    {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }

    static void leftRotateOneByOne(int arr[], int d)
    {
        for (int i = 0; i < d; i++)
        {
            leftRotate(arr);

        }

    }

    static void leftRotateD(int arr[], int d)
    {
        int temp[] = new int [d];
        for (int i = 0; i < d; i++)
        {
            temp[i] = arr[i];
        }
        for (int i = d; i <arr.length ; i++)
        {
            arr[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++)
        {
            arr[arr.length-d+i] = temp[i];
        }

    }

    static void leftreverseArray(int arr[], int d, int n)
    {
        reverse(arr , 0 ,d-1);
        reverse(arr, d,n-1);
        reverse(arr,0,n-1 );
    }
    static void reverse(int arr[], int low, int high)
    {
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
