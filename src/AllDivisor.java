public class AllDivisor
{
    public static void main(String[] args) {
        int N=5;
        divisor(N);
    }
    static int divisor(int N)
    {
        int i;
        int count=0;
        for (i = 1; i*i  <= N ; i++)
        {
            if (N%i==0)
            {
                System.out.println(i);
//                count=i;
                count++;
//                System.out.println(count);
            }

        }
        for (; i>=1; i--)
        {
            if (N%i==0)
            {
                System.out.println(N/i);
                count++;
//                System.out.println(count);

            }

        }
        return count;



    }
}
