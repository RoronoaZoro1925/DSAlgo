package ArraysPractice;

import java.math.BigInteger;

public class DigitsThatDivideString {
    public static void main(String[] args) {
        String s = "111111111111111111111111111111";
        System.out.println(checkDivisorDigits(s));
    }

    static int checkDivisorDigits(String s) throws NumberFormatException{
        int divisor = 0;
        BigInteger dividend = new BigInteger(s);
        for (int i = 0; i < s.length(); i++) {
            int currentDigit = Character.getNumericValue(s.charAt(i));
            if (currentDigit!=0) {
                BigInteger digitValue = BigInteger.valueOf(currentDigit);
                if (dividend.mod(digitValue).equals(BigInteger.ZERO)) {
                    divisor++;
                }
            }
        }
        return divisor;
    }

    static int checkDivisorEfficient(String s){
        int divisor = 0;
        
        return divisor;
    }
}
