package ArraysPractice;

public class LargestNumberInArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,10,10};
//        System.out.println(getLargest(arr));
        System.out.println(getLarge(arr));

    }
    static int getLargest(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            boolean flag = true;
            for (int j = 0; j < n; j++)
            {
                if (arr[j]>arr[i])
                {
                    flag=false;
                    break;
                }

            }
            if (flag==true)
            {
                return i;
            }
        }
        return -1;

    }

    static int getLarge(int arr[])
    {
        int res = arr[0];
//        int n = arr.length;
        for (int i = 0; i <arr.length ; i++)
        {
            if (res<arr[i])
            {
                res=i;
            }
        }
        return res;
    }
}
