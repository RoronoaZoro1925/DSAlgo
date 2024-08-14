package RecursionPractice;

public class TwoStepRecursion
{
    public static void main(String[] args)
    {
//        fun(3);
//        System.out.println(fun1(64));
        fun2(7);

    }
    static void fun(int n)
    {
        if (n == 0)
        {
            return;
        }
        fun(n-1);
        System.out.println(n);
        fun(n-1);
    }

    static int fun1(int n)
    {
        if (n == 1)
        {
            return 0;
        }
        else
        {
            return 1 + fun1(n/2);
        }
    }

    static void fun2(int n)
    {
        if (n == 0)
        {
            return;
        }
        fun2(n/2);
        System.out.println(n%2);
    }
}
