public class DecimalToBinary
{
    public static void main(String[] args)
    {
        function(12);

    }

    static void function(int n)
    {
        if (n == 0)
        {
            return;
        }
        function(n/2);
        System.out.print(n%2);
    }

}
