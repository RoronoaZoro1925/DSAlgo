package BasicMathematics;

import java.util.Arrays;

public class CombineLCMAndHCF {
    public static void main(String[] args) {
        int a = 17;
        int b = 13;
        System.out.println(Arrays.toString(lcmandgcd(a, b)));
        
    }

    public static int[] lcmandgcd(int a, int b){
        int[] lcmAndGcdResult = new int[2];
        lcmAndGcdResult[0] = lcmResult(a,b);
        lcmAndGcdResult[1] = hcfResult(a,b);
        return lcmAndGcdResult;
    }

    static int lcmResult(int a, int b){
        int result = Math.max(a, b);
        while (result>0) {
            if (result%a==0 && result%b==0) {
                break;
            }
            result++;
        }
        return result;
    }

    static int hcfResult(int a, int b){
        int result = Math.min(a, b);
        while (result>0) {
            if (a%result==0 && b%result==0) {
                break;
            }
            result --;
        }
        return result;
    }

    static int efficientLcmResult(int a, int b){
        return (a*b)/efficientHcfResult(a, b);
    }

    static int efficientHcfResult(int a, int b){
        if (a==0) {
            return b;
        }
        else if (b==0) {
            return a;
        }
        return efficientHcfResult(b, a%b);
    }
}
