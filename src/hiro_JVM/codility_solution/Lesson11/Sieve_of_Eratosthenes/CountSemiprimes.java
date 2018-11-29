package hiro_JVM.codility_solution.Lesson11.Sieve_of_Eratosthenes;

//import java.util.*;

public class CountSemiprimes {
    public static int[] solution_lesson11_2(int N, int[] P, int[] Q) {
        final int[] primes = erastothenesSieve(N);
        final int[] semiPrimes = new int[N + 1];

        for (int num = 2; num <= N; num++) {
            semiPrimes[num] = semiPrimes[num - 1];
            if (primes[num] != 0) {
                if (primes[num / primes[num]] == 0) {
                    semiPrimes[num]++;
                }
            }
        }

        int[] result = new int[P.length];
        for(int index = 0; index < Math.min(P.length, Q.length); index++) {
            result[index] = semiPrimes[Q[index]] - semiPrimes[P[index] - 1];
        }
        return result;
    }

    private static int[] erastothenesSieve(int N) {

        final int[] primes = new int[N + 1];

        for (int num = 2; num * num <= N; num++) {
            if (primes[num] == 0) {
                for (int mul = num * num; mul <= N; mul += num) {
                    if (primes[mul] == 0) {
                        primes[mul] = num;
                    }
                }
            }
        }
        return primes;
    }
}
