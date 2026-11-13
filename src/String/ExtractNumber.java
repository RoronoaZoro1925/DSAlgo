package String;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumber {
    public static void main(String[] args) {
        String s = "1: Geeks for geeks, 2: geeksfor geeks, 3: forGeeksgeeks 56";
        for (String string : extractNumbers(s)) {
            System.out.println(string);
        }

        for (String string : twoPointerExtractNumber(s)) {
            System.out.println(string);
        }
    }

    static List<String> extractNumbers(String s){
        List<String> numericVaList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\d+"); 
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            numericVaList.add(matcher.group());
        }
        return numericVaList;
    }

    static List<String> twoPointerExtractNumber(String s){
        List<String> numList = new ArrayList<>();
        int n = s.length();
        int start = 0;
        int found = start;
        for (int i = 0; i < n; i++) {
            Character ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                start=i;
                found++;
                String number = s.substring(start, found);
                numList.add(number);
            }
            found=start;
            
        }
        return numList;
    }
}
