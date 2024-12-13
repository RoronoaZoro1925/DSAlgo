package Sorting;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int a[] = {10,15,20};
        int b[] = {5,6,6,15};
//        basicMerge(a,b);
        merge(a,b);

    }

    public static void basicMerge(int a[], int b[])
    {
        int c[] = new int[a.length+b.length];
        for (int i = 0; i < a.length; i++)
        {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++)
        {
            c[a.length+i] = b[i];
        }
        Arrays.sort(c);
        for(int i : c)
            System.out.print(i + "  ");
    }

    public static void merge(int a[], int b[])
    {
        int i = 0, j = 0;
        while(i< a.length&&j< b.length)
        {
            if(a[i]<b[j])
            {
                System.out.print(a[i++] + " ");
            }
            else
            {
                System.out.print(b[j++] + " ");
            }
        }
        while (i< a.length)
            System.out.print(a[i++] + " ");
        while (j< b.length)
            System.out.print(b[j++] + " ");
    }
}
