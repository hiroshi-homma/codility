package hiro_JVM.codility_solution.Lesson12.Euclidean_algorithm;

public class CommonPrimeDivisors {
    public static int solution_lesson12_2(int[] A, int[] B) {
        int c = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 1 && B[i] == 1) {
                c++;
                continue;
            }
            final int g = gcm(A[i], B[i]);
            int m = A[i] / g;
            int gcm = g;
            boolean containsA = false;

            while (true) {
                if (gcm % m == 0) {
                    containsA = true;
                    break;
                } else {
                    final int newG = gcm(gcm, m);
                    if (newG == 1) {
                        break;
                    }
                    m = m / newG;
                    gcm = newG;
                }
            }
            m = B[i] / g;
            gcm = g;
            boolean containsB = false;
            while (true) {
                if (gcm % m == 0) {
                    containsB = true;
                    break;
                } else {
                    final int newG = gcm(gcm, m);
                    if (newG == 1) {
                        break;
                    }
                    m = m / newG;
                    gcm = newG;
                }
            }
            if (containsA && containsB) {
                c++;
            }
        }
        return c;
    }

    private static int gcm(final int a, final int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcm(b, a % b);
        }
    }
}
