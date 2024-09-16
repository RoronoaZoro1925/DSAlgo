package ArraysPractice;

public class ArrayLeader
{
    public static void main(String[] args)
    {
        int arr[] = {1,3,10,5,7,8,2,6,4,5};
        arrayLeader(arr);

    }
    static void arrayLeader(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean flag = false;
            for (int j = i+1; j <arr.length ; j++)
            {
                if (arr[i]<=arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if (flag==false)
            {
                System.out.print(arr[i] + " ");
            }

        }
    }

}
