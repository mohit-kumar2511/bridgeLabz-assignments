package assignment2;
import java.util.*;

public class Question2 {
    
    
    public static String customSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String substringUsingCharAt = customSubstring(text, start, end);
        String substringUsingBuiltIn = text.substring(start, end);
        boolean areEqual = compareStrings(substringUsingCharAt, substringUsingBuiltIn);

        System.out.println("Substring using charAt: " + substringUsingCharAt);
        System.out.println("Substring using built-in: " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
    
}

