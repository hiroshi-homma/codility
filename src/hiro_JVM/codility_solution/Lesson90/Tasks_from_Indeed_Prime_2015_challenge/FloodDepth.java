package hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge;

public class FloodDepth {
    public static int solution_lesson90_2(int[] A) {
        int maxDepth = 0, beginHeight = 0, lowestHeight = 0, height;
        for (int aA : A) {
            if (aA < lowestHeight) lowestHeight = aA;
            else if (aA < beginHeight)
                maxDepth = Math.max(maxDepth, aA - lowestHeight);
            else {
                maxDepth = Math.max(maxDepth, beginHeight - lowestHeight);
                beginHeight = aA;
                lowestHeight = aA;
            }
        }
        return maxDepth;
    }
}
