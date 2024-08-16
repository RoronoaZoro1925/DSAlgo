package RecursionPractice;

public class QuizOne
{
    public static void main(String[] args)
    {
        System.out.println(fun(2));

    }
    static int fun(int n)
    {
        if (n == 4)
        {
            return n;

        }
        else
        {
            return 2*fun(n+1);
        }

    }
}
