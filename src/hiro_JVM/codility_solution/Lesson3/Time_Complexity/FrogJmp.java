package hiro_JVM.codility_solution.Lesson3.Time_Complexity;

//import java.util.*;

public class FrogJmp {
    public static int solution_lesson3_2(int X, int Y, int D) {
        long difference = Y - X;
        long plus =0;
        if( difference % D !=0 ) plus =1;
        long result;
        result = difference / D;
        result = result + plus;
        return (int) result;
    }
}
