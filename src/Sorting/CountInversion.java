package Sorting;

public class CountInversion
{
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
//        System.out.println(naiveCount(arr));
        System.out.println(countInversion(arr,0,arr.length-1));
    }

    public static int naiveCount(int arr[])
    {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j <arr.length ; j++)
            {
                if (arr[i]>arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }

    static int countInversion(int arr[], int l, int r)
    {
        int result = 0;
        if (l<r)
        {
            int m = (r+l)/2;
            result += countInversion(arr,l,m);
            result += countInversion(arr,m+1,r);
            result += countMerge(arr,l,m,r);
        }
        return result;
    }

    public static int countMerge(int[] arr, int l, int m, int r)
    {
        int n1 = m-l+1, n2 = r-m;
        int [] left = new int[n1];
        int [] right = new int[n2];
        for (int i = 0; i < n1; i++)
        {
            left[i] = arr[i+l];
        }
        for (int j = 0; j < n2; j++)
        {
            right[j] = arr[m+1+j];
        }
        int result = 0,i=0,j=0,k=l;
        while (i<n1&&j<n2)
        {
            if (left[i]<=right[j])
            {
                arr[k++] = left[i++];
            }
            else
            {
                arr[k++] = right[j++];
                result = result+(n1-i);
            }
        }
        while (i<n1)
            arr[k++] = left[i++];
        while (j<n2)
            arr[k++] = right[j++];
        return result;
    }
}
