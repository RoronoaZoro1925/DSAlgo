package ArraysPractice;

public class MaximumConsecutiveOne
{
    public static void main(String[] args)
    {
        int arr[] = {0,1,1,1,1,0,0,1,1};
//        System.out.println(maxOne(arr));
        System.out.println(maxOneByOne(arr));

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
            result=Math.max(result,current);
        }
        return result;
    }

    static int maxOneByOne(int arr[])
    {
        int result = 0;
        int count = 0;
        for (int i = 0; i < arr.length ; i++)
        {

            if (arr[i]==0)
            {
                count = 0;
            }
            else
            {
                count++;
                result = Math.max(result,count);
            }
        }
        return result;
    }
}
