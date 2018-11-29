package hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues;

// you can also use imports, for example:
import java.util.*;

public class Fish {
    public static int solution_lesson7_4(int[] A, int[] B) {
        if(A.length == 0) return 0;
        Stack<Integer> st = new Stack<>(); 
        int numAlive = A.length;
        
        for(int i=0; i<A.length; i++){
            if(B[i] ==1){
                st.push(A[i]);
            }
            if(B[i] ==0){
                while( !st.isEmpty() ){
                    if( st.peek() > A[i] ){
                        numAlive--;
                        break;
                    }
                    else if(st.peek() < A[i]){
                        numAlive--;
                        st.pop();
                    }
                }
            }  
        }
        return numAlive;
    }
}
