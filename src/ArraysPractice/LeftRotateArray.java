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
//        rightRotate(arr);
//        for (int j:arr)
//        {
//            System.out.print(j + " ");
//        }

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

    public static void rightRotate(int arr[])
    {
        int temp =arr[arr.length-1];
        for (int i = arr.length-1; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
