package hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers;

public class MinPerimeterRectangle {
    public static int solution_lesson10_2(int N) {
        int sqrtN = (int) Math.sqrt(N);
        int perimeter = 2 + (N * 2);
        for(int i = sqrtN; i > 0; i--){
            if( N % i ==0){
                int B = N/i;
                perimeter = (i * 2) + (B * 2);
                break;
            }
        }
        return perimeter;
     }
}
