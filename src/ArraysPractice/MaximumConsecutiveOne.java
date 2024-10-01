package ArraysPractice;

public class MaximumConsecutiveOne
{
    public static void main(String[] args)
    {
        int arr[] = {0,1,1,1,1,2,0,1,1};
        System.out.println(maxOne(arr));;

    }

    static int maxOne(int arr[])
    {
        int result = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int current = 0;
            for (int j = i; j < arr.length; j++)
            {
                if (arr[j]==1)
                {
                    current++;
                }
                else
                    break;

            }
            result=Math.max(current,result);
        }
        return result;
    }
}
