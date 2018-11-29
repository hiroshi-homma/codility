package hiro_JVM.codility_solution.Lesson14.Binary_search_algorithm;

public class MinMaxDivision {
    public static int solution_lesson14_1(int K, int M, int[] A) {
        int minSum =0,maxSum =0;

        for (int aA : A) {
            maxSum = maxSum + aA;
            minSum = Math.max(minSum, aA);
        }
        
        int possibleResult = maxSum;

        while(minSum <= maxSum){

            int midSum = (minSum + maxSum) /2;

            boolean ok = checkDivisable(midSum, K, A);

            if(ok){
                possibleResult = midSum;
                maxSum = midSum - 1; 
            }
            else{
                minSum = midSum + 1;
            }
        }
        
        return possibleResult;
    }

    private static boolean checkDivisable(int mid, int k, int[] a){
        int numBlockAllowed = k;
        int currentBlockSum = 0;

        for (int anA : a) {
            currentBlockSum = currentBlockSum + anA;

            if (currentBlockSum > mid) {
                numBlockAllowed--;
                currentBlockSum = anA;
            }

            if (numBlockAllowed == 0) {
                return false;
            }
        }
        return true;   
    }
}
