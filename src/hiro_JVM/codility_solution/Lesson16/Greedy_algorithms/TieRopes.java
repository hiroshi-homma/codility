package hiro_JVM.codility_solution.Lesson16.Greedy_algorithms;

public class TieRopes {
    public static int solution_lesson16_2(int K, int[] A) {
        int total =0,currentLength=0;
        for (int aA : A) {
            currentLength = currentLength + aA;
            if (currentLength >= K) {
                total++;
                currentLength = 0;
            }
        }
        return total;
    }
}
