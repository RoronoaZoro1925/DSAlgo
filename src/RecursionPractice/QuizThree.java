package RecursionPractice;

public class QuizThree
{
    public static void main(String[] args)
    {
        fun(25);

    }
    static void fun(int n)
    {
        if (n==0)
            return;
        System.out.println(n%2);
        fun(n/2);
    }
}
