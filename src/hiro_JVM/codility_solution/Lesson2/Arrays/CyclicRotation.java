package hiro_JVM.codility_solution.Lesson2.Arrays;

public class CyclicRotation {
    public static int[] solution_lesson2_1(int[] A, int K) {
        int[] new_array = new int[A.length]; // a new array
        for(int i=0; i< A.length; i++){
            int new_position = (i + K) % A.length; // using "mod" to do Cyclic Rotation
            new_array[new_position] = A[i]; // put A[i] to the new position
        }
        return new_array;
    }
}
