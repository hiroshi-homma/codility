package hiro_JVM.codility_solution;

import hiro_JVM.codility_solution.model.Point2D;
import hiro_JVM.codility_solution.model.Tree;
import java.util.*;

//---------------------------- Lesson0 DemoTask--------------------------------------- //
import static hiro_JVM.codility_solution.Lesson0.DemoTask.DemoTask.solution_demo; // index 1
//---------------------------- Lesson1 iterations------------------------------------- //
import static hiro_JVM.codility_solution.Lesson1.Iterations.BinaryGap.solution_lesson1_1; // index 2
//---------------------------- Lesson2 Arrays----------------------------------------- //
import static hiro_JVM.codility_solution.Lesson2.Arrays.CyclicRotation.solution_lesson2_1; // index 3
import static hiro_JVM.codility_solution.Lesson2.Arrays.OddOccurrencesInArray.solution_lesson2_2; // index 4
//---------------------------- Lesson3 Time_Complexity-------------------------------- //
import static hiro_JVM.codility_solution.Lesson3.Time_Complexity.PermMissingElem.solution_lesson3_1; // index 5
import static hiro_JVM.codility_solution.Lesson3.Time_Complexity.FrogJmp.solution_lesson3_2; // index 6
import static hiro_JVM.codility_solution.Lesson3.Time_Complexity.TapeEquilibrium.solution_lesson3_3; // index 7
//---------------------------- Lesson4 Counting_Elements------------------------------ //
import static hiro_JVM.codility_solution.Lesson4.Counting_Elements.PermCheck.solution_lesson4_1; // index 8
import static hiro_JVM.codility_solution.Lesson4.Counting_Elements.FrogRiverOne.solution_lesson4_2; // index 9
import static hiro_JVM.codility_solution.Lesson4.Counting_Elements.MaxCounters.solution_lesson4_3; // index 10
import static hiro_JVM.codility_solution.Lesson4.Counting_Elements.MissingInteger.solution_lesson4_4; // index 11
//---------------------------- Lesson5 Prefix Sums--------------------------- //
import static hiro_JVM.codility_solution.Lesson5.Prefix_Sums.PassingCars.solution_lesson5_1; // index 12
import static hiro_JVM.codility_solution.Lesson5.Prefix_Sums.GenomicRangeQuery.solution_lesson5_2; // index 13
import static hiro_JVM.codility_solution.Lesson5.Prefix_Sums.MinAvgTwoSlice.solution_lesson5_3; // index 14
import static hiro_JVM.codility_solution.Lesson5.Prefix_Sums.CountDiv.solution_lesson5_4; // index 15
//---------------------------- Lesson6 Sorting---------------------------------------- //
import static hiro_JVM.codility_solution.Lesson6.Sorting.Distinct.solution_lesson6_1; // index 16
import static hiro_JVM.codility_solution.Lesson6.Sorting.Triangle.solution_lesson6_2; // index 17
import static hiro_JVM.codility_solution.Lesson6.Sorting.MaxProductOfThree.solution_lesson6_3; // index 18
import static hiro_JVM.codility_solution.Lesson6.Sorting.NumberOfDiscIntersections.solution_lesson6_4_1; // index 19
import static hiro_JVM.codility_solution.Lesson6.Sorting.NumberOfDiscIntersections_SimpleLowPerformance.solution_lesson6_4_2; // index 20
//---------------------------- Lesson7 Stack and Queues------------------------------- //
import static hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues.Brackets.solution_lesson7_1; // index 21
import static hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues.Nesting.solution_lesson7_2; // index 22
import static hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues.StoneWall.solution_lesson7_3; // index 23
import static hiro_JVM.codility_solution.Lesson7.Stacks_and_Queues.Fish.solution_lesson7_4; // index 24
//---------------------------- Lesson8 Leader----------------------------------------- //
import static hiro_JVM.codility_solution.Lesson8.Leader.EquiLeader.solution_lesson8_1; // index 25
import static hiro_JVM.codility_solution.Lesson8.Leader.Dominator.solution_lesson8_2; // index 26
//---------------------------- Lesson9 Maximum slice problem-------------------------- //
import static hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem.MaxSliceSum.solution_lesson9_1; // index 27
import static hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem.MaxProfit.solution_lesson9_2; // index 28
import static hiro_JVM.codility_solution.Lesson9.Maximum_slice_problem.MaxDoubleSliceSum.solution_lesson9_3; // index 29
//---------------------------- Lesson10 Prime and composite numbers-------------------- //
import static hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers.CountFactors.solution_lesson10_1; // index 30
import static hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers.MinPerimeterRectangle.solution_lesson10_2; // index 31
import static hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers.Peaks.solution_lesson10_3; // index 32
import static hiro_JVM.codility_solution.Lesson10.Prime_and_composite_numbers.Flags.solution_lesson10_4; // index 33
//---------------------------- Lesson11 Sieve of Eratosthenes-------------------------- //
import static hiro_JVM.codility_solution.Lesson11.Sieve_of_Eratosthenes.CountNonDivisible.solution_lesson11_1; // index 34
import static hiro_JVM.codility_solution.Lesson11.Sieve_of_Eratosthenes.CountSemiprimes.solution_lesson11_2; // index 35
//---------------------------- Lesson12 Euclidean algorithm---------------------------- //
import static hiro_JVM.codility_solution.Lesson12.Euclidean_algorithm.ChocolatesByNumbers.solution_lesson12_1; // index 36
import static hiro_JVM.codility_solution.Lesson12.Euclidean_algorithm.CommonPrimeDivisors.solution_lesson12_2; // index 37
//---------------------------- Lesson13 Fibonacci numbers------------------------------ //
import static hiro_JVM.codility_solution.Lesson13.Fibonacci_numbers.FibFrog.solution_lesson13_1; // index 38
import static hiro_JVM.codility_solution.Lesson13.Fibonacci_numbers.Ladder.solution_lesson13_2; // index 39
//---------------------------- Lesson14 Binary search algorithm------------------------ //
import static hiro_JVM.codility_solution.Lesson14.Binary_search_algorithm.MinMaxDivision.solution_lesson14_1; // index 40
import static hiro_JVM.codility_solution.Lesson14.Binary_search_algorithm.NailingPlanks.solution_lesson14_2; // index 41
//---------------------------- Lesson15 Caterpillar method----------------------------- //
import static hiro_JVM.codility_solution.Lesson15.Caterpillar_method.AbsDistinct.solution_lesson15_1; // index 42
import static hiro_JVM.codility_solution.Lesson15.Caterpillar_method.CountDistinctSlices.solution_lesson15_2; // index 43
import static hiro_JVM.codility_solution.Lesson15.Caterpillar_method.CountTriangles.solution_lesson15_3; // index 44
import static hiro_JVM.codility_solution.Lesson15.Caterpillar_method.MinAbsSumOfTwo.solution_lesson15_4; // index 45
//---------------------------- Lesson16 Greedy algorithms------------------------------ //
import static hiro_JVM.codility_solution.Lesson16.Greedy_algorithms.MaxNonoverlappingSegments.solution_lesson16_1; // index 46
import static hiro_JVM.codility_solution.Lesson16.Greedy_algorithms.TieRopes.solution_lesson16_2; // index 47
//---------------------------- Lesson17 Dynamic programming---------------------------- //
import static hiro_JVM.codility_solution.Lesson17.Dynamic_programming.NumberSolitaire.solution_lesson17_1; // index 48
import static hiro_JVM.codility_solution.Lesson17.Dynamic_programming.MinAbsSum.solution_lesson17_2; // index 49
//---------------------------- Lesson90 Tasks from Indeed Prime 2015 challenge---------------------------- //
import static hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.LongestPassword.solution_lesson90_1; // index 50
import static hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.FloodDepth.solution_lesson90_2; // index 51
import static hiro_JVM.codility_solution.Lesson90.Tasks_from_Indeed_Prime_2015_challenge.SlalomSkiing.solution_lesson90_3; // index 52
//---------------------------- Lesson91 Tasks from Indeed Prime 2016 challenge---------------------------- //
import static hiro_JVM.codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.RectangleBuilderGreaterArea.solution_lesson91_1; // index 53
import static hiro_JVM.codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.DwarfsRafting.solution_lesson91_2; // index 54
import static hiro_JVM.codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.HilbertMaze.solution_lesson91_3; // index 55
import static hiro_JVM.codility_solution.Lesson91.Tasks_from_Indeed_Prime_2016_challenge.TreeProduct.solution_lesson91_4; // index 56
//---------------------------- Lesson92 Tasks from Indeed Prime 2016 College Coders challenge---------------------------- //
import static hiro_JVM.codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.TennisTournament.solution_lesson92_1; // index 57
import static hiro_JVM.codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.SocksLaundering.solution_lesson92_2; // index 58
import static hiro_JVM.codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.ArrayRecovery.solution_lesson92_3; // index 59
import static hiro_JVM.codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge.DiamondsCount.solution_lesson92_4; // index 60
//---------------------------- Lesson99 Future training ---------------------------- //
import static hiro_JVM.codility_solution.Lesson99.Future_training.StrSymmetryPoint.solution_lesson99_1; // index 61
import static hiro_JVM.codility_solution.Lesson99.Future_training.TreeHeight.solution_lesson99_2; // index 62
import static hiro_JVM.codility_solution.Lesson99.Future_training.ArrayInversionCount.solution_lesson99_3; // index 63
import static hiro_JVM.codility_solution.Lesson99.Future_training.PolygonConcavityIndex.solution_lesson99_4; // index 64

public class Main {
    public static void main(String[] args) {
    //---------------------------- DemoTask--------------------------------------- //
//            // Demo Task (clear)
//            System.out.println("Demo Task");
//            System.out.println(solution_demo(new int[] {1, 3, 6, 4, 1, 2})+"\n------------------");
    //---------------------------- iterations------------------------------------- //
//            // BinaryGap (clear)
//            System.out.println("BinaryGap");
//            System.out.println(solution_lesson1_1(1041));
//            System.out.println(solution_lesson1_1(15));
//            System.out.println(solution_lesson1_1(32)+"\n------------------");
    //---------------------------- Arrays----------------------------------------- //
//            // CyclicRotation (clear)
//            System.out.println("CyclicRotation");
//            System.out.println(Arrays.toString(solution_lesson2_1(new int[]{3, 8, 9, 7, 6}, 3)));
//            System.out.println(Arrays.toString(solution_lesson2_1(new int[]{1, 2, 3, 4}, 4))+"\n------------------");
//            // OddOccurrencesInArray (clear)
//            System.out.println("OddOccurrencesInArray");
//            System.out.println(solution_lesson2_2(new int[] {9, 3, 9, 3, 9, 7, 9})+"\n------------------");
    //---------------------------- Time_Complexity-------------------------------- //
//            // PermMissingElem (clear)
//            System.out.println("PermMissingElem");
//            System.out.println(solution_lesson3_1(new int[] {2,3,1,5})+"\n------------------");
//            // FrogJmp (clear)
//            System.out.println("FrogJmp");
//            System.out.println(solution_lesson3_2(10,85,30)+"\n------------------");
//            // TapeEquilibrium (clear)
//            System.out.println("TapeEquilibrium");
//            System.out.println(solution_lesson3_3(new int[] {3,1,2,4,3})+"\n------------------");
    //---------------------------- Counting_Elements------------------------------ //
//            // PermCheck (clear)
//            System.out.println("PermCheck");
//            System.out.println(solution_lesson4_1(new int[] {4,1,3,2})+"\n------------------");
//            // FrogRiverOne
//            System.out.println("FrogRiverOne");
//            System.out.println(solution_lesson4_2(5,new int[] {1,3,1,4,2,3,5,4})+"\n------------------");
//            // MaxCounters
//            System.out.println("MaxCounters");
//            System.out.println(Arrays.toString(solution_lesson4_3(5, new int[]{3, 4, 4, 6, 1, 4, 4}))+"\n------------------");
//            // MissingInteger
//            System.out.println("MissingInteger");
//            System.out.println(solution_lesson4_4(new int[] {1,3,6,4,1,2}));
//            System.out.println(solution_lesson4_4(new int[] {1,2,3}));
//            System.out.println(solution_lesson4_4(new int[] {-1,-3})+"\n------------------");
    //---------------------------- Prefix Sums--------------------------- //
//            // PassingCars
//            System.out.println("PassingCars");
//            System.out.println(solution_lesson5_1(new int[] {0,1,0,1,1})+"\n------------------");
//            // GenomicRangeQuery
//            System.out.println("GenomicRangeQuery");
//            System.out.println(Arrays.toString(solution_lesson5_2("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}))+"\n------------------");
//            // MinAvgTwoSlice
//            System.out.println("MinAvgTwoSlice");
//            System.out.println(solution_lesson5_3(new int[] {4,2,2,5,1,5,8})+"\n------------------");
//            // CountDiv
//            System.out.println("CountDiv");
//            System.out.println(solution_lesson5_4(6,11,2)+"\n------------------");
    //---------------------------- Sorting---------------------------------------- //
//            // Distinct
//            System.out.println("Distinct");
//            System.out.println(solution_lesson6_1(new int[] {2,1,1,2,3,1})+"\n------------------");
//            // Triangle
//            System.out.println("Triangle");
//            System.out.println(solution_lesson6_2(new int[] {10,2,5,1,8,20})+"\n------------------");
//            System.out.println(solution_lesson6_2(new int[] {10,50,5,1})+"\n------------------");
//            // MaxProductOfThree
//            System.out.println("MaxProductOfThree");
//            System.out.println(solution_lesson6_3(new int[] {-3,1,2,-2,5,6})+"\n------------------");
//            // NumberOfDiscIntersections
//            System.out.println("NumberOfDiscIntersections");
//            System.out.println(solution_lesson6_4_1(new int[] {1,5,2,1,4,0})+"\n------------------");
//            System.out.println(solution_lesson6_4_2(new int[] {1,5,2,1,4,0})+"\n------------------");
    //---------------------------- Stack and Queues------------------------------- //
//            // Brackets
//            System.out.println("Brackets");
//            System.out.println(solution_lesson7_1("{[()()]}")+"\n------------------");
//            // Nesting
//            System.out.println("Nesting");
//            System.out.println(solution_lesson7_2("(()(())())")+"\n------------------");
//            // StoneWall
//            System.out.println("StoneWall");
//            System.out.println(solution_lesson7_3(new int[] {8,8,5,7,9,8,7,4,8})+"\n------------------");
//            // Fish
//            System.out.println("Fish");
//            System.out.println(solution_lesson7_4(new int[] {4,3,2,1,5},new int[] {0,1,0,0,0})+"\n------------------");
    //---------------------------- Leader----------------------------------------- //
//            // EquiLeader
//            System.out.println("EquiLeader");
//            System.out.println(solution_lesson8_1(new int[] {4,3,4,4,4,2})+"\n------------------");
//            // Dominator
//            System.out.println("Dominator");
//            System.out.println(solution_lesson8_2(new int[] {3,4,3,2,3,-1,3,3})+"\n------------------");
    //---------------------------- Maximum slice problem-------------------------- //
//            // MaxSliceSum
//            System.out.println("MaxSliceSum");
//            System.out.println(solution_lesson9_1(new int[] {3,1,-6,4,0})+"\n------------------");
//            // MaxProfit
//            System.out.println("MaxProfit");
//            System.out.println(solution_lesson9_2(new int[] {23171,21011,21123,21366,21013,21367})+"\n------------------");
//            // MaxDoubleSliceSum
//            System.out.println("MaxDoubleSliceSum");
//            System.out.println(solution_lesson9_3(new int[] {3,2,6,-1,4,5,-1,2})+"\n------------------");
    //---------------------------- Prime and composite numbers-------------------- //
//            // CountFactors
//            System.out.println("CountFactors");
//            System.out.println(solution_lesson10_1(24)+"\n------------------");
//            // MinPerimeterRectangle
//            System.out.println("MinPerimeterRectangle");
//            System.out.println(solution_lesson10_2(30)+"\n------------------");
//            // Peaks
//            System.out.println("Peaks");
//            System.out.println(solution_lesson10_3(new int[] {1,2,3,4,3,4,1,2,3,4,6,2})+"\n------------------");
//            // Flags
//            System.out.println("Flags");
//            System.out.println(solution_lesson10_4(new int[] {1,5,3,4,3,4,1,2,3,4,6,2})+"\n------------------");
    //---------------------------- Sieve of Eratosthenes-------------------------- //
//            // CountNonDivisible
//            System.out.println("CountNonDivisible");
//            System.out.println(Arrays.toString(solution_lesson11_1(new int[]{3, 1, 2, 3, 6})) +"\n------------------");
//            // CountSemiprimes
//            System.out.println("CountSemiprimes");
//            System.out.println(Arrays.toString(solution_lesson11_2(26, new int[]{1, 4, 16}, new int[]{26, 10, 20})) +"\n------------------");
    //---------------------------- Euclidean algorithm---------------------------- //
//            // ChocolatesByNumbers
//            System.out.println("ChocolatesByNumbers");
//            System.out.println(solution_lesson12_1(10,4)+"\n------------------");
//            // CommonPrimeDivisors
//            System.out.println("CommonPrimeDivisors");
//            System.out.println(solution_lesson12_2(new int[] {15,10,3},new int[] {75,30,5})+"\n------------------");
    //---------------------------- Fibonacci numbers------------------------------ //
//            // FibFrog
//            System.out.println("FibFrog");
//            System.out.println(solution_lesson13_1(new int[] {0,0,0,1,1,0,1,0,0,0,0})+"\n------------------");
//            // Ladder
//            System.out.println("Ladder");
//            System.out.println(Arrays.toString(solution_lesson13_2(new int[]{4, 4, 5, 5, 1}, new int[]{3, 2, 4, 3, 1})) +"\n------------------");
    //---------------------------- Binary search algorithm------------------------ //
//            // MinMaxDivision
//            System.out.println("MinMaxDivision");
//            System.out.println(solution_lesson14_1(3,5,new int[] {2,1,5,1,2,2,2})+"\n------------------");
//            // NailingPlanks
//            System.out.println("NailingPlanks");
//            System.out.println(solution_lesson14_2(new int[] {1,4,5,8},new int[] {4,5,9,10},new int[] {4,6,7,10,2})+"\n------------------");
    //---------------------------- Caterpillar method----------------------------- //
//            // AbsDistinct
//            System.out.println("AbsDistinct");
//            System.out.println(solution_lesson15_1(new int[] {-5,-3,-1,0,3,6})+"\n------------------");
//            // CountDistinctSlices
//            System.out.println("CountDistinctSlices");
//            System.out.println(solution_lesson15_2(6,new int[] {3,4,5,5,2})+"\n------------------");
//            // CountTriangles
//            System.out.println("CountTriangles");
//            System.out.println(solution_lesson15_3(new int[] {10,2,5,1,8,12})+"\n------------------");
//            // MinAbsSumOfTwo
//            System.out.println("MinAbsSumOfTwo");
//            System.out.println(solution_lesson15_4(new int[] {1,4,-3}));
//            System.out.println(solution_lesson15_4(new int[] {-8,4,5,-10,3})+"\n------------------");
    //---------------------------- Greedy algorithms------------------------------ //
//            // MaxNonoverlappingSegments
//            System.out.println("MaxNonoverlappingSegments");
//            System.out.println(solution_lesson16_1(new int[] {1,3,7,9,9},new int[] {5,6,8,9,10})+"\n------------------");
//            // TieRopes
//            System.out.println("TieRopes");
//            System.out.println(solution_lesson16_2(4,new int[] {1,2,3,4,1,1,3})+"\n------------------");
    //---------------------------- Dynamic programming---------------------------- //
//            // NumberSolitaire
//            System.out.println("NumberSolitaire");
//            System.out.println(solution_lesson17_1(new int[] {1,-2,0,9,-1,-2})+"\n------------------");
//            // MinAbsSum
//            System.out.println("MinAbsSum");
//            System.out.println(solution_lesson17_2(new int[] {1,5,2,-2})+"\n------------------");
    //---------------------------- Tasks from Indeed Prime 2015 challenge ---------------------------- //
//            // LongestPassword
//            System.out.println("LongestPassword");
//            System.out.println(solution_lesson90_1("test 5 a0A pass007 ?xy1")+"\n------------------");
//            // FloodDepth
//            System.out.println("FloodDepth");
//            System.out.println(solution_lesson90_2(new int[] {1,3,2,1,2,1,5,3,3,4})+"\n------------------");
//            // SlalomSkiing
//            System.out.println("SlalomSkiing");
//            System.out.println(solution_lesson90_3(new int[] {5,10,4,15,1}));
//            System.out.println(solution_lesson90_3(new int[] {
//                    15,13,5,7,4,10,12,8,2,11,6,9,3
//            })+"\n------------------");
    //---------------------------- Tasks from Indeed Prime 2016 challenge ---------------------------- //
//            // RectangleBuilderGreaterArea
//            System.out.println("RectangleBuilderGreaterArea");
//            System.out.println(solution_lesson91_1(new int[] {1,2,5,1,2,3,5,1},5)+"\n------------------");
//            // DwarfsRafting
//            System.out.println("DwarfsRafting");
//            System.out.println(solution_lesson91_2(4, "1B 1C 4B 1D 2A","3B 2D")+"\n------------------");
//            // HilbertMaze
//            System.out.println("HilbertMaze");
//            System.out.println(solution_lesson91_3(1,2,1,3,4));
//            System.out.println(solution_lesson91_3(2,2,5,6,6)+"\n------------------");
            // TreeProduct
//            System.out.println("TreeProduct");
            System.out.println(solution_lesson91_4(
                    new int[] {0},
                    new int[] {1}
            )+"\n------------------");
            System.out.println(solution_lesson91_4(
                    new int[] {0,1},
                    new int[] {1,2}
                    )+"\n------------------");
            System.out.println(solution_lesson91_4(
                    new int[] {0,1,1},
                    new int[] {1,2,3}
            )+"\n------------------");
            System.out.println(solution_lesson91_4(
                    new int[] {0,1,2,3},
                    new int[] {1,2,3,4}
            )+"\n------------------");
            System.out.println(solution_lesson91_4(
                    new int[] {0,1,1,3,3,6,7},
                    new int[] {1,2,3,4,5,3,5}
                    )+"\n------------------");
            System.out.println(solution_lesson91_4(
                    new int[] {0,1,1,1,5,6,7,8},
                    new int[] {1,2,3,4,3,3,3,3}
            )+"\n------------------");
        System.out.println(solution_lesson91_4(
                new int[] {0,1,1,3,3,6,7,8,9},
                new int[] {1,2,3,4,5,3,5,5,5}
        )+"\n------------------");
    //---------------------------- Tasks from Indeed Prime 2016 College Coders challenge ---------------------------- //
//            // TennisTournament
//            System.out.println("TennisTournament");
//            System.out.println(solution_lesson92_1(10,3)+"\n------------------");
//            // SocksLaundering
//            System.out.println("SocksLaundering");
//            System.out.println(solution_lesson92_2(2,new int[] {1,2,1,1},new int[] {1,4,3,2,4})+"\n------------------");
//            // ArrayRecovery
//            System.out.println("ArrayRecovery");
//            System.out.println(solution_lesson92_3(new int[] {0,2,2},10));
//            System.out.println(solution_lesson92_3(new int[] {0,3,5,6},10)+"\n------------------");
//            // DiamondsCount
//            System.out.println("DiamondsCount");
//            System.out.println(solution_lesson92_4(
//                    new int[] {1,1,2,2,2,3,3},
//                    new int[] {3,4,1,3,5,3,4}
//            ));
//            System.out.println(solution_lesson92_4(
//                    new int[] {1,2,3,3,2,1},
//                    new int[] {1,1,1,2,2,2}
//            )+"\n------------------");
    //---------------------------- Future training ---------------------------- //
//            // StrSymmetryPoint
//            System.out.println("StrSymmetryPoint");
//            System.out.println(solution_lesson99_1("x")+"\n------------------");
//            // TreeHeight
//            System.out.println("TreeHeight");
//            Tree test = tree(5, tree(3, tree(20, null, null),
//                    tree(21, null, null)), tree(10, tree(1, null, null), null));
//            System.out.println(solution_lesson99_2(test)+"\n------------------");
//            // ArrayInversionCount
//            System.out.println("ArrayInversionCount");
//            System.out.println(solution_lesson99_3(new int[] {-1,6,3,4,7,4})+"\n------------------");
//            // PolygonConcavityIndex
//            System.out.println("PolygonConcavityIndex");
//            System.out.println(solution_lesson99_4(
//                    new Point2D[] {
//                            new Point2D(-1, 3),
//                            new Point2D(3, 1),
//                            new Point2D(0, -1),
//                            new Point2D(-2, 1),
//                    })+"\n------------------");
    }

//    private static Tree tree(final int x, final Tree l, final Tree r) {
//            final Tree tree = new Tree();
//            tree.x = x;
//            tree.l = l;
//            tree.r = r;
//            return tree;
//    }

}
