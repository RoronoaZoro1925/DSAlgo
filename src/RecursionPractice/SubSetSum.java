package RecursionPractice;

public class SubSetSum
{
    public static void main(String[] args)
    {
        int n=3, sum=45, arr[]={10,20,25};
        System.out.println(subSum(arr,n,sum));

    }
    static int subSum(int arr[], int n, int sum)
    {
        if (n == 0)
        {
            return sum==0?1:0;
        }
        return subSum(arr,n-1,sum)+subSum(arr,n-1,sum-arr[n-1]);
    }
}
