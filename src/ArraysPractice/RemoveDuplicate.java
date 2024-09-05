package ArraysPractice;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        int arr[] = {2,3,4,4,5,6,6,6,6,6,7};
        int n = 11;
        n= removeDuplicateElements(arr,n);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
        n=removeDuplicate(arr,n);
        for (int i = 0; i <n ; i++)
        {
            System.out.print(arr[i] + " ");

        }

    }

    static int removeDuplicateElements(int arr[], int n)
    {

        int temp[] = new int [n];
        temp[0]=arr[0];
        int result = 1;
        for (int i = 1; i < arr.length; i++)
        {
            if (temp[result-1]!=arr[i])
            {
                temp[result]=arr[i];
                result++;
            }

        }
        for (int i = 0; i < result; i++)
        {
            arr[i]=temp[i];
        }
        return result;
    }

    static int removeDuplicate(int arr[], int n)
    {
        int result = 1;
        for (int i = 0; i < n; i++)
        {
            if (arr[i]!=arr[result-1])
            {
                arr[i]=arr[result];
                result++;
            }

        }
        return result;
    }
}
