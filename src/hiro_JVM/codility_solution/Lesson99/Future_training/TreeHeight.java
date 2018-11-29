package hiro_JVM.codility_solution.Lesson99.Future_training;

import hiro_JVM.codility_solution.model.Tree;

public class TreeHeight {
    public static int solution_lesson99_2(Tree T) {
        if (T == null) return -1;
        return 1 + Math.max(solution_lesson99_2(T.l), solution_lesson99_2(T.r));
    }
}
