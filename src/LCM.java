public class LCM
{
    public static void main(String[] args) {
        int M=15;
        int N=18;
//        System.out.println(LCM(M,N));
        System.out.println(moreEffLCM(M,N));
    }
    static int LCM(int M, int N)
    {
        int result=Math.max(M,N);
        while (result>0)
        {
            if (result%M==0 && result%N==0)
            {
                return result;
            }
            result++;
        }
        return result;

    }

    static int moreEffLCM(int M, int N)
    {
        return (M*N)/HCF(M,N);
    }
    static int HCF(int M, int N)
    {
        if(N==0)
            return M;
        else
            return HCF(N, M%N);

    }
}
