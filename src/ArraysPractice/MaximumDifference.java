package ArraysPractice;

public class MaximumDifference
{
    public static void main(String[] args)
    {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maxDifference(arr));

    }

    static int maxDifference(int arr[])
    {
        int result = arr[1] - arr[0];
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i+1; j <arr.length ; j++)
            {


                result = Math.max(result,arr[j]-arr[i]);
            }
            
        }
        return result;
    }
}
