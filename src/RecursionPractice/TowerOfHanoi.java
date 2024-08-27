package RecursionPractice;

public class TowerOfHanoi
{
    static int count = 1;
    public static void main(String[] args)
    {
        int n=4;
        toh(n,'A','B','C');;

    }
    static void toh(int n, char A, char B, char C)
    {

        if (n == 1)
        {

            System.out.println("Move 1 from" + " " + A + " " + "to" + " " + C + " " + count++);
            return;
        }
        toh(n-1,A,C,B);
        System.out.println("Move" + " " + n + " " + "from" + " " + A + " " + "to" + " " + C + " " + count++);
        toh(n-1,B,A,C);

    }
}
