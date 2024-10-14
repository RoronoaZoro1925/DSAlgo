package Searching;

public class SquareRootBinarySearch
{
    public static void main(String[] args)
    {
        int x = 17;
        System.out.println(sqrtFloorBinary(x));

    }

    static int sqrtFloorBinary(int x)
    {
        int low = 1 , high = x , answer = -1;
        while (low<=high)
        {
            int mid = (low+high)/2;
            int midSquare = mid * mid;
            if(midSquare == mid)
                return mid;
            else if (midSquare>x)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
                answer = mid;
            }
        }
        return answer;
    }
}
