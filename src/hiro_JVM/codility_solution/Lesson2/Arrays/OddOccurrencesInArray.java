package hiro_JVM.codility_solution.Lesson2.Arrays;

public class OddOccurrencesInArray {
    public static int solution_lesson2_2(int[] A) {
        if(A.length == 0) return 0;
        int unpaired;
        unpaired = A[0]; // initial
        for(int i=1; i< A.length; i++) unpaired = unpaired ^ A[i];

        return unpaired;
    }
}
