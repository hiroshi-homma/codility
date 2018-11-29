package hiro_JVM.codility_solution.Lesson99.Future_training;

public class StrSymmetryPoint {
    public static int solution_lesson99_1(String S) {
        int length = S.length();
        if (length % 2 != 0 && isPalindrome(S)) {
            return length / 2;
        } else {
            return -1;
        }
    }

    private static boolean isPalindrome(String S) {
        for (int i = 0, j = S.length() - 1; i < j; i++, j--) {
            if (S.charAt(i) != S.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
