package BasicMathematics;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(Math.max(a, b),c);
        System.out.println(max + " " + "is the greates among the three");

    }
}
