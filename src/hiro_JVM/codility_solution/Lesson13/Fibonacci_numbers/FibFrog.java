package hiro_JVM.codility_solution.Lesson13.Fibonacci_numbers;

import java.util.*;
import java.awt.*;

public class FibFrog {
    public static int solution_lesson13_1(int[] A) {

        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0);
        fibonacci.add(1);

        while(true){
            int temp1 = fibonacci.get( fibonacci.size()-1 );
            int temp2 = fibonacci.get( fibonacci.size()-2 );
            fibonacci.add( temp1 + temp2 );
            if(temp1 + temp2 > A.length) break;
        }

        Collections.reverse(fibonacci);

        ArrayList<Point> queue = new ArrayList<>(); 
        queue.add( new Point(-1, 0) );

        int index=0; 
        while(true){
            if(index == queue.size() ) return -1;

            Point current = queue.get(index); 

            for(Integer n: fibonacci){
                int nextPosition = current.x + n;

                if(nextPosition == A.length) return current.y + 1;
                else if ((nextPosition <= A.length) && (nextPosition >= 0) && (A[nextPosition] != 0)) {
                    Point temp = new Point(nextPosition, current.y + 1);
                    queue.add(temp);
                    A[nextPosition] = 0;
                }
            }
            
            index++;
        }
    }
}
