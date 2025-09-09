import java.util.*;

public class date_27_08_2025extrastring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // question1
        /*
        String str = "Hello World";
        int[] counts = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
        */

        // question2
        /*
        String original = "Hello";
        String reversed = reverseString(original);
        System.out.println("Reversed String: " + reversed);
        */

        // question3
        /*
        String text = "madam";
        boolean isPalin = isPalindrome(text);
        System.out.println("Is Palindrome: " + isPalin);
        */

        // question4
        /*
        String str = "programming";
        String unique = removeDuplicates(str);
        System.out.println("Modified String: " + unique);
        */

        // question5
        /*
        String sentence = "Java is a powerful programming language";
        String longest = findLongestWord(sentence);
        System.out.println("Longest word: " + longest);
        */

        // question6
        /*
        String str = "abababa";
        String sub = "aba";
        int count = countSubstringOccurrences(str, sub);
        System.out.println("Occurrences: " + count);
        */

        // question7
        /*
        String str = "HeLLo WoRLD";
        String toggled = toggleCase(str);
        System.out.println("Toggled Case: " + toggled);
        */

        // question8
        /*
        String s1 = "apple";
        String s2 = "banana";
        String result = compareStrings(s1, s2);
        System.out.println(result);
        */

        // question9
        /*
        String str = "success";
        char frequent = mostFrequentChar(str);
        System.out.println("Most Frequent Character: " + frequent);
        */

        // question10
        /*
        String str = "Hello World";
        char ch = 'l';
        String modified = removeCharacter(str, ch);
        System.out.println("Modified String: " + modified);
        */

        // question11
        /*
        String str1 = "listen";
        String str2 = "silent";
        boolean result = areAnagrams(str1, str2);
        System.out.println("Are Anagrams: " + result);
        */

        // question12
        /*
        String sentence = "Java is fun and Java is powerful";
        String toReplace = "Java";
        String replacement = "Python";
        String modified = replaceWord(sentence, toReplace, replacement);
        System.out.println("Modified Sentence: " + modified);
        */

    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) >= 0) vowels++;
                else consonants++;
            }
        }
        return new int[]{vowels, consonants};
    }

    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) rev += str.charAt(i);
        return rev;
    }

    public static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static String removeDuplicates(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (result.indexOf(ch) == -1) result += ch;
        }
        return result;
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        return longest;
    }

    public static int countSubstringOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) sb.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch)) sb.append(Character.toUpperCase(ch));
            else sb.append(ch);
        }
        return sb.toString();
    }

    public static String compareStrings(String s1, String s2) {
        int len = Math.min(s1.length(), s2.length());
        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) < s2.charAt(i)) return "\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order";
            if (s1.charAt(i) > s2.charAt(i)) return "\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order";
        }
        if (s1.length() < s2.length()) return "\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order";
        if (s1.length() > s2.length()) return "\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order";
        return "Both strings are equal";
    }

    public static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }
        int max = 0;
        char result = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                result = (char) i;
            }
        }
        return result;
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) sb.append(c);
        }
        return sb.toString();
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        return Arrays.equals(a1, a2);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) sb.append(newWord).append(" ");
            else sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}
