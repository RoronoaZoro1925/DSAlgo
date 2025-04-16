package String;

public class Palindrome
{
    public static void main(String[] args)
    {
        String s = "ABCDCBA";
//        System.out.println(naivePal(s));
        System.out.println(efficientPal (s));

    }

    public static boolean naivePal(String str)
    {
        StringBuilder reversal = new StringBuilder(str);
        reversal.reverse();
        return str.equals(reversal.toString());
    }

    public static boolean efficientPal(String str)
    {
        int begin = 0;
        int end = str.length()-1;
        while (begin<end)
        {
            if (str.charAt(begin)!=str.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
}
