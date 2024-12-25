package Sorting;

import java.util.Arrays;

public class TwoSortedArrayUnion
{
    public static void main(String[] args)
    {
        int a[] = {2,3,8,10,10};
        int b[] = {2,8,9,10,10,15};
        int m = a.length;
        int n = b.length;
//        naiveUnion(a,b);
//        sortedUnion(a,b);
        geeksSortedUnion(a,b,m,n);
    }

    public static void naiveUnion(int a[], int b[])
    {
        int c[] = new int[a.length+ b.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++)
        {
            c[a.length+j] = b[j];
        }
        Arrays.sort(c);
        for (int k = 0; k < a.length+ b.length; k++)
        {
            if (k==0||c[k]!=c[k-1])
                System.out.print(c[k] + " ");

        }
    }

    public static void sortedUnion(int a[], int b[])
    {
        int i = 0, j = 0;
        while(i< a.length&&j< b.length)
        {
            if(i>0&&a[i-1]==a[i])//Ye condition duplicate avoid karne ke liye hai
            {
                i++;
                continue;
            }
            if (j>0&&b[j-1]==b[j])
            {
                j++;
                continue;
            }
            if (a[i]<b[j])
            {
                System.out.print(a[i] + " ");
                i++;
            } else if (a[i]>b[j])
            {
                System.out.print(b[j] + " ");
                j++;
            }
            else
            {
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        while (i< a.length)
        {
            if (i==0||a[i]!=a[i-1])
            {
                System.out.print(a[i] + " ");
                i++;
            }
        }
        while (j< b.length)
        {
            if (j==0||b[j]!=b[j-1])
            {
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static void geeksSortedUnion(int a[], int b[], int m, int n)
    {
                int i=0,j=0;
                while(i<m && j<n){
                    if(i>0 && a[i-1]==a[i]){i++;continue;}
                    if(j>0 && b[j-1]==b[j]){j++;continue;}
                    if(a[i]<b[j]){System.out.print(a[i]+" ");i++;}
                    else if(a[i]>b[j]){System.out.print(b[j]+" ");j++;}
                    else{System.out.print(a[i]+" ");i++;j++;}
                }
                while(i<m){if(i==0||a[i]!=a[i-1])System.out.print(a[i]+" ");i++;}
                while(j<n){if(j==0||b[j]!=b[j-1])System.out.print(b[j]+" ");j++;}
            }

}
