package String;

import java.util.Stack;

public class ReverseAString
{
    public static void main(String[] args)
    {
        String s = "Hello World";
        char[] str = s.toCharArray();
        int n = s.length();
//        System.out.println(stackReverse(s));
        reverseWord(str,n);
        System.out.println(str);
    }

    public static String stackReverse(String str)
    {
        char[] reverse = new char[str.length()];
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty())
        {
            reverse[i++]=stack.pop();
        }
        return new String(reverse);
    }

    public static void reverse(char[] str, int low, int high)
    {
        while(low<=high)
        {
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }

    public static void reverseWord(char[] str, int n)
    {
        int start = 0;
        for (int end = 0; end<n;end++)
        {
            if (str[end]==' ')
            {
                reverse(str,start,end-1);
                start = end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
}
