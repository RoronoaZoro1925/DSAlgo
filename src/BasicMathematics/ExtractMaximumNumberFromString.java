package BasicMathematics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractMaximumNumberFromString {
    public static void main(String[] args) {
        String s = "abcdefgP";
        System.out.println(extractMaxNumber(s));
    }

    static int extractMaxNumber(String s){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(s);
        int maxValue = -1;
        while (matcher.find()) {
            int currentNumber = Integer.parseInt(matcher.group());
            if (currentNumber>maxValue) {
                maxValue=currentNumber;
            }
        }
        return matcher.find(0)?maxValue : -1;
    }
}
