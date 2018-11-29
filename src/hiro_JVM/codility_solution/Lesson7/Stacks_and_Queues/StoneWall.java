package hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues;

import java.util.*;

public class StoneWall {
    public static int solution_lesson7_3(int[] H) {
        Stack<Integer> st = new Stack<>();
        int numBlock =0;

        for (int aH : H) {
            while (!st.isEmpty() && st.peek() > aH) {
                st.pop();
            }
            if (st.isEmpty()) {
                numBlock++;
                st.push(aH);
            }
            else if (st.peek() != aH) {
                if (st.peek() < aH) {
                    numBlock++;
                    st.push(aH);
                }
            }
        }
        
        return numBlock;
    }
}
