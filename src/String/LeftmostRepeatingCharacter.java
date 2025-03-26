package String;

import java.util.Arrays;

public class LeftmostRepeatingCharacter
{
    static final int CHAR = 256;
    public static void main(String[] args)
    {
        String s = "abbcd";
//        System.out.println(left(s));
//        System.out.println(leftMost(s));
        System.out.println(leftMostRepeated(s));

    }

    public static int left(String str)
    {
        int [] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if (count[str.charAt(i)]>1)
                return i;

        }
        return -1;
    }

    public static int leftMost(String str)
    {
        int []fIndex = new int[CHAR];
        Arrays.fill(fIndex,-1);
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < str.length(); i++)
        {
            int fI= fIndex[str.charAt(i)];
            if (fI==-1)
                fIndex[str.charAt(i)]=i;
            else
                result=Math.min(result,fI);

        }
        return (result==Integer.MAX_VALUE)?-1:result;
    }

    public static int leftMostRepeated(String str)
    {
        boolean[] visited = new boolean[CHAR];
        int result = -1;
        for (int i = str.length()-1; i >= 0 ; i--)
        {
            if (visited[str.charAt(i)])
                result = i;
            else
                visited[str.charAt(i)]=true;
        }
        return result;
    }
}
