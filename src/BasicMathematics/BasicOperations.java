package BasicMathematics;

public class BasicOperations {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int sum = x+y;
        int subtraction = y-x;
        int multiplication = x*y;
        float floatPointDivision = (float)x/(float)y;
        int integerDivision = x/y;
        int moduloDivision = x%y;
        System.out.printf("%d %d %d %f %d %d\n",sum,subtraction,multiplication,floatPointDivision,integerDivision,moduloDivision);

    }
}
