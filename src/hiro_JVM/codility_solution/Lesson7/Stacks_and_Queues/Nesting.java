package hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues;

// you can also use imports, for example:
import java.util.*;

public class Nesting {
    public static int solution_lesson7_2(String S) {

        if( S.length() ==0) return 1;
        else if( S.length() % 2 == 1) return 0;

        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<S.length(); i++){
            if(S.charAt(i)=='('){
                st.push(')');
            }else if(S.charAt(i)==')'){
                if(st.isEmpty()){
                    return 0;
                }
                else{
                    char temp = st.pop();
                    if( temp != ')'){
                        return 0;
                    }
                }
            }
        }

        if( !st.isEmpty() ) return 0;
        else return 1;
    }
}
