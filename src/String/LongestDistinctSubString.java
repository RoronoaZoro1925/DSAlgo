package String;

public class LongestDistinctSubString
{
    static int CHAR = 256;
    public static void main(String[] args)
    {
        String s = "ABBCD";
        System.out.println(longestSub(s));;

    }
    public static int longestSub(String str)
    {
        int n = str.length(), result = 0;
        for (int i = 0; i < n; i++)
        {
            boolean visited[] = new boolean[CHAR];
            for (int j = i; j < n; j++)
            {
                if (visited[str.charAt(j)])
                    break;
                else
                {
                    result = Math.max(result,j-i+1);
                    visited[str.charAt(j)]=true;
                }
            }
        }
        return result;
    }
}
