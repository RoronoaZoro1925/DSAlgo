package RecursionPractice;

public class PrintOnetoN
{
    public static void main(String[] args)
    {
        function(7);
    }

    static void function(int n)
    {
        if (n == 0)
        {
            return;
        }
        function(n-1);
        System.out.println(n);
    }
}
