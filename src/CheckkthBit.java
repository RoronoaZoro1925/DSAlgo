public class CheckkthBit
{
    public static void main(String[] args)
    {
        int n=1;
        int k=4;
        int x=1;
        for (int i = 0; i < (k-1); i++)
        {
            x=x*2;
        }
        if ((n&x)!=0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

    }
}
