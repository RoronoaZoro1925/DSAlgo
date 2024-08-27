package RecursionPractice;

public class JosephusProblem
{
    public static void main(String[] args)
    {
        int n= 5;
        int k=3;
        System.out.println(jos(n,k));
        System.out.println(oneJos(n,k));

    }
    static int jos(int n, int k)
    {
        if (n == 1)
        {
            return 0;
        }
        return (jos(n - 1, k) + k) % n;

    }

    static int oneJos(int n, int k)
    {
        return jos(n,k)+1;
    }
}
