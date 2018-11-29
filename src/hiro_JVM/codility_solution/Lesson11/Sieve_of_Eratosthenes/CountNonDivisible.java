package hiro_JVM.codility_solution.Lesson11.Sieve_of_Eratosthenes;

import java.util.*;

public class CountNonDivisible {
    public static int[] solution_lesson11_1(int[] A) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
        for (int aA : A) {
            if (!map1.containsKey(aA)) {
                map1.put(aA, 1);
            } else {
                map1.put(aA, map1.get(aA) + 1);
            }
        }

        HashMap<Integer, Integer> map2 = new HashMap<>();

        for( int n : map1.keySet() ){            
            int numDivisors =0;

            int sqrtN = (int)Math.sqrt(n);  
            for(int i=1; i<=sqrtN; i++ ){
                if( n % i == 0){
                    int anotherDivisor = n/i; 
    
                    if(map1.containsKey(i)){
                        numDivisors = numDivisors + map1.get(i);
                    }
                    if(anotherDivisor != i){
                        if(map1.containsKey(anotherDivisor)){
                            numDivisors = numDivisors + map1.get(anotherDivisor);
                        }
                    }
                }
            }
            
            int numNonDivisors = A.length - numDivisors;
            map2.put(n, numNonDivisors); 
        }

        int[] results = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            results[i] = map2.get(A[i]);
        }

        return results;
    }
}
