package ArraysPractice;

public class MaxSubArray
{
    public static void main(String[] args)
    {
        int arr[] = {1,-2,3,-1,2};
        System.out.println(maxSum(arr));

    }

    static int maxSum(int arr[])
    {
        int result = arr[0];
        for (int i = 0; i <arr.length ; i++)
        {
            int current = 0;
            for (int j = i; j < arr.length; j++)
            {
                current = current+arr[j];
                result = Math.max(result,current);

            }

        }
        return result;
    }
}
