package RecursionPractice;

public class Palindrome
{
    public static void main(String[] args) {
        String str = "abba";
        System.out.println(isPal(str,0,str.length()-1));
        System.out.println(str.length());
    }
    static boolean isPal(String str, int start, int end)
    {
        if(start>=end)
            return true;
        return (str.charAt(start)==str.charAt(end)&&isPal(str,start+1,end-1));
    }
}
