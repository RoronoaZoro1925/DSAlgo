package BasicMathematics;

public class MiddleOfThree {
    public static void main(String[] args) {
        int a = 978;
        int b = 518;
        int c = 300;
        System.out.println(findMiddle(a,b,c));
    }

    private static int findMiddle(int a, int b, int c) {
        if ((a>b&&a<c)|| (a<b&&a>c)) {
            return a;
        }
        else if ((b>a&&b<c) || (b<a&&b>c)) {
            return b;
        }
        else{
            return c;
        }
    }
}
