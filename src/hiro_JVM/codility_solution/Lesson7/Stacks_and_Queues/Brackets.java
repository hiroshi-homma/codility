package hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues;

// you can also use imports, for example:
import java.util.*;

public class Brackets {
    public static int solution_lesson7_1(String S) {
        if(S.length() == 0) return 1;
        Stack<Character> stack = new Stack<>();
        for(int i=0; i< S.length(); i++){
            if( S.charAt(i) == '(' ){
                stack.push(')');
            }
            else if( S.charAt(i) == '[' ){
                stack.push(']');
            }
            else if( S.charAt(i) == '{' ){
                stack.push('}');
            }
            else if( S.charAt(i) == ')' || S.charAt(i) == ']' || S.charAt(i) == '}'){
                if(stack.isEmpty()){
                    return 0;
                }
                else{
                    char temp = stack.pop();
                    if(temp != S.charAt(i)){
                        return 0;
                    }
                }
            }
        }
        if( !stack.isEmpty() ){
            return 0;
        }
        else{
            return 1;
        }
    }
}
