package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyInSortedArray
{
    public static void main(String[] args)
    {
        int arr[] = {10,20,20,20,30,30,40,40,50};
        frequencyOccur(arr);

//        int ar[] = {2,3,5,2,1,9,7};
//        Arrays.sort(ar);
//        for (int i : ar)
//        {
//            System.out.println(i);
//        }
//        ArrayList<Integer> ar = new ArrayList<>(Collections.singleton(arr));

    }
    static void frequencyOccur(int arr[])
    {
        int frequency = 1, i = 1;
        while (i<arr.length)
        {
            while (i<arr.length && arr[i] == arr[i-1])
            {
                frequency++;
                i++;
            }
            System.out.println(arr[i-1] + " " + frequency);
            i++;
            frequency=1;
        }
        if (arr.length==1||arr.length-1!= arr.length-2)
            System.out.println(arr[arr.length-1] + " " + 1);
    }

}
