package hiro_JVM.codility_solution.Lesson12.Euclidean_algorithm;

public class ChocolatesByNumbers {
    public static int solution_lesson12_1(int N, int M) {
        return N/(gcd(N,M));
    }

    private static int gcd(int a, int b){
        if(a % b == 0)
            return b;
        else
            return gcd(b,a % b);
    }
}
