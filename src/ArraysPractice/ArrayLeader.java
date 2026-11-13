package ArraysPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayLeader
{
    public static void main(String[] args)
    {
        int arr[] = {61,61,17};
       arrayLeader(arr);
        // leaderFromRightToLeft(arr);
        // for (int i : leaders(arr)) {
        //     System.out.print(i + " ");
        // }

        AtomicInteger atomicInteger = new AtomicInteger();

    }
    static void arrayLeader(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
        {
            boolean flag = false;
            for (int j = i+1; j <arr.length ; j++)
            {
                if (arr[i]<arr[j])
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

//    public static int [] functionalArrayLeader(int arr [])
//    {
//        if (arr==null||arr.length==0)
//            return new int[0];
//
//        List<Integer> result = Arrays.stream(arr)
//                .boxed()
//                .collect(ArrayList::new,(list,value)->{
//
//                })
//    }

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

    static ArrayList<Integer> leaders(int arr[]){
        ArrayList<Integer> maxArray = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1) {
                maxArray.add(arr[i]);
            }
            else if (arr[i]>=arr[i+1]) {
                maxArray.add(arr[i]);
            }
        }
        return maxArray;
    }
}
