package hiro_JVM.codility_solution.Lesson99.Future_training;

import hiro_JVM.codility_solution.model.Point2D;

public class PolygonConcavityIndex {
    public static int solution_lesson99_4(Point2D[] A) {
        // write your code in Java SE 8
        int[] directions = new int[A.length];
        int arbiter = 0;
        for (int i = 0; i < A.length; i++) {
            directions[i] = direction(A[(i - 1 + A.length) % A.length], A[i], A[(i + 1) % A.length]);
            if (directions[i] != 0 && A[i].y <= A[arbiter].y) {
                arbiter = i;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (directions[arbiter] * directions[i] < 0) {
                return i;
            }
        }
        return -1;
    }
    private static int direction(Point2D a, Point2D b, Point2D c) {
        long scale = ((long) b.x - (long) a.x) * ((long) c.y - (long) b.y) - ((long) c.x - (long) b.x) * ((long) b.y - (long) a.y);
        return 0 < scale ? 1 : scale < 0 ? -1 : 0;
    }
}
