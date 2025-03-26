package String;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter
{
    static int CHAR = 256;
    public static void main(String[] args)
    {
        String s = "abbcd";
        System.out.println(leftMostNonRepeating(s));

    }

    public static int left(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            boolean flag = false;
            for (int j = 0; j < str.length(); j++)
            {
                if (i!=j&&str.charAt(i)==str.charAt(j))
                {
                    flag=true;
                    break;
                }

            }
            if (flag==false)
                return i;

        }
        return -1;

    }

    public static int leftMost(String str)
    {
        int [] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i)==1)
                return i;

        }
        return -1;
    }

    public static int leftMostNonRepeating(String str)
    {
        int firstIndex[] = new int[CHAR];
        Arrays.fill(firstIndex,-1);
        for (int i = 0; i < str.length(); i++)
        {
            if (firstIndex[str.charAt(i)]==-1)
                firstIndex[str.charAt(i)]=i;
            else
                firstIndex[str.charAt(i)]=-2;
        }
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < CHAR; i++)
        {
            if (firstIndex[i]>=0)
                result=Math.min(result,firstIndex[i]);

        }
        return (result==Integer.MAX_VALUE)?-1:result;
    }
}
