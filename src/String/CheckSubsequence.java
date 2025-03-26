package String;

public class CheckSubsequence
{
    public static void main(String[] args)
    {
        String s1 = "ABCD";
        String s2 = "ADC";
        int m = s1.length();
        int n = s2.length();
         System.out.println(iterativeCheck(s1,s2));
        System.out.println(recursiveCheck(s1,s2,m,n));

    }

    public static boolean iterativeCheck(String s1, String s2)
    {
        int j = 0;
        for (int i = 0; i < s1.length() && j<s2.length(); i++)
        {
            if (s1.charAt(i)==s2.charAt(j))
            {
                j++;
            }

        }
        return j==s2.length();

    }

    public static boolean recursiveCheck(String s1, String s2,int m,int n)
    {
        if (m==0)
            return false;
        if (n==0)
            return true;
        if (s1.charAt(m-1)==s2.charAt(n-1))
            return recursiveCheck(s1,s2,m-1,n-1);
        else
            return recursiveCheck(s1,s2,m-1,n);
    }
}
