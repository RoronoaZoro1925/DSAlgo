package ArraysPractice;

public class LeftRotateArray
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        leftRotate(arr);
        for (int i:arr)
        {
            System.out.print(i + " ");
        }

    }
    public static void leftRotate(int arr[])
    {
        int temp =arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
