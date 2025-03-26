package String;

public class LPSArray
{
    public static void main(String[] args)
    {
        String txt = "ababacab";
        int lps[] = new int[txt.length()];
        fillLPS(txt,lps);
        for (int i: lps)
            System.out.print(i + " ");

    }

    public static void fillLPS(String str, int lps[])
    {
        for (int i = 0; i < str.length(); i++)
        {
            lps[i] = longestProperPrefSuff(str, i+1);

        }
    }

    private static int longestProperPrefSuff(String str, int n)
    {
        for (int length = n-1; length > 0 ; length--)
        {
            boolean flag = true;
            for (int i = 0; i < length; i++)
            {
                if (str.charAt(i)!=str.charAt(n-length+i))
                    flag=false;
            }
            if (flag)
                return length;
        }
        return 0;
    }
}
