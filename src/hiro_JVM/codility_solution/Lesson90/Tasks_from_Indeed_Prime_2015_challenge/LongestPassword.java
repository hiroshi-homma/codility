package hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestPassword {
    public static int solution_lesson90_1(String S) {
        String[] words = S.replaceAll("\\s+", " ").split(" ");
        int maxLength = -1;
        for (String word : words) {
            if (word.matches("^[0-9a-zA-Z]*$") &&
                    word.replaceAll("[0-9]+", "").length() % 2 == 0 &&
                    word.replaceAll("[a-zA-Z]+", "").length() % 2 == 1) {
                maxLength = Math.max(maxLength, word.length());
            }
        }
        return maxLength;
    }
}
