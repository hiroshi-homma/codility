package hiro_JVM.codility_solution.Lesson4.Counting_Elements;

public class MaxCounters {
    public static int[] solution_lesson4_3(int N, int[] A) {
        int max = 0;
        int min =0;
        int[] my_array = new int[N];

        for (int aA : A) {
            if (aA >= 1 && aA <= N) {
                if (my_array[aA - 1] < min) {
                    my_array[aA - 1] = min;
                }
                my_array[aA - 1]++;
                if (my_array[aA - 1] > max) {
                    max = my_array[aA - 1];
                }
            } else if (aA == N + 1) {
                min = max;
            }
        }

        for(int i=0; i<my_array.length; i++){
            if(my_array[i] < min){
                my_array[i] = min; // update it to "min"
            }
        }

        return my_array;
    }
}
