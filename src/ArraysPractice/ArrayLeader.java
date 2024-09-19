package ArraysPractice;

public class ArrayLeader
{
    public static void main(String[] args)
    {
        int arr[] = {1,3,10,5,7,8,2,6,4,5};
//        arrayLeader(arr);
        leaderFromRightToLeft(arr);

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

    static void leaderFromRightToLeft(int arr[])
    {
        int current_leader = arr[arr.length-1];
        System.out.print(current_leader + " ");
        for (int i = arr.length-2; i >= 0; i--)
        {
            if (current_leader<arr[i])
            {
                current_leader = arr[i];
                System.out.print(current_leader + " ");
            }

        }
    }
}
