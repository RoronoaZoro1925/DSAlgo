package Sorting;

public class IntersectionOfTwoSortedArrays
{
    public static void main(String[] args)
    {
        int a[] = {3,5,10,10,10,15,15,20};
        int b[] = {5,10,10,15,30};
        int m = a.length;
        int n = b.length;
//        basicIntersection(a,b,m,n);
        intersection(a,b,m,n);

    }

    public static void basicIntersection(int a[], int b[], int m, int n)
    {
        for (int i = 0; i < m; i++)
        {
            if (i>0&&a[i-1]==a[i])
                continue;
            for (int j = 0; j < n; j++)
            {
                if (a[i]==b[j])
                {
                    System.out.print(a[i] + " ");
                    break;
                }
            }

        }
    }

    public static void intersection(int a[], int b[], int m, int n)
    {
        int i = 0, j = 0;
        while (i<m&&j<n)
        {
            if (i>0&&a[i-1]==a[i])
            {
                i++;
                continue;
            }

            if (a[i]<b[j])
                i++;
            else if (a[i]>b[j]) {
                j++;
            }
            else
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }

        }
    }
}
