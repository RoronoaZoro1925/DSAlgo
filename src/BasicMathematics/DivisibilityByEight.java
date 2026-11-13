package BasicMathematics;

public class DivisibilityByEight {
    public static void main(String[] args) {
        String s = "16";
        System.out.println(checkDivisibility(s));
    }

    static boolean checkDivisibility(String s){
        boolean flag = false;
        int length = s.length();
        int lastThreeDigitCounts = Math.min(3, length);
        String lastThreeDigitsStr = s.substring(length-lastThreeDigitCounts);
        int num = Integer.parseInt(lastThreeDigitsStr);
        if (num%8==0) {
            return true;
        }
        return flag;
    }
}
