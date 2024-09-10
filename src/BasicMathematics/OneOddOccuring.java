package BasicMathematics;
public class OneOddOccuring
{
    public static void main(String[] args)
    {
        int arr[]={8,7,8,8,7};
        int n = arr.length;
//        System.out.println(oddOccur(arr,n));
         System.out.println(findOdd(arr,n));
    }
    static int oddOccur(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            int count=0;
            for (int j = 0; j <n ; j++)
            {

                if (arr[j]==arr[i])
                {
                    count++;
                }
            }
            if (count%2!=0){
                return arr[i];
            }

        }
        return 0;
    }

    static int findOdd(int arr[],int n)
    {
        int result=arr[0];
        for (int i = 1; i < n; i++)
        {
            result=result^arr[i];

        }
        return result;

    }
}
