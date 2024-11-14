package Searching;

public class CountOne
{
    public static void main(String[] args)
    {
        int arr[] = {1,1,1,1,1,0,0,0};
        int N = args.length;
        System.out.println(counterOfOne(arr,N));

    }

    static int counterOfOne(int arr[], int N)
    {
        int low = 0 , high = N-1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == 0)
                low=mid+1;
            else
            {
                if(mid == 0 || arr[mid-1]==0)
                    return (N-mid);
                else
                    high=mid-1;
            }
        }
        return 0;
    }
}
