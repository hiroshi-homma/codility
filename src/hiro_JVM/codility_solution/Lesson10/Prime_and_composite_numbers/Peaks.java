package hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers;

// you can also use imports, for example:
import java.util.*;

public class Peaks {
    public static int solution_lesson10_3(int[] A) {
        List<Integer> peaksIndexList = new ArrayList<>();
        for(int i=1; i<A.length-1; i++){
            if( A[i-1]<A[i] && A[i]>A[i+1] ){
                peaksIndexList.add(i);
            }
        }
        int N = A.length;
        for(int numBlocks =N; numBlocks >=1; numBlocks--){
            if( N % numBlocks ==0){
            
                int blockSize = N / numBlocks; 
                int ithOkBlock =0;

                for(int peaksIndex : peaksIndexList){
                    if( peaksIndex/blockSize == ithOkBlock){
                        ithOkBlock++;
                    }
                }

                if(ithOkBlock == numBlocks){
                    return numBlocks;
                }
            }
        }
        return 0;
    }
}
