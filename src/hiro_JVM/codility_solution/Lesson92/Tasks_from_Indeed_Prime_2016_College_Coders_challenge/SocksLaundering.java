package hiro_JVM.codility_solution.Lesson92.Tasks_from_Indeed_Prime_2016_College_Coders_challenge;

import java.util.*;

public class SocksLaundering {
    public static int solution_lesson92_2(int K, int[] C, int[] D){
        int res = 0;
        int maxClean = C[0];
        for (int aC1 : C) if (aC1 > maxClean) maxClean = aC1;
        int[] typesInClean = new int[maxClean];
        for (int aC : C) typesInClean[aC - 1]++;
        for (int i = 0; i < maxClean; i++) {
            res += typesInClean[i] / 2;
            typesInClean[i] = (typesInClean[i] % 2 == 0 ? 0 : 1);
        }
        int maxDirty = D[0];
        for (int aD : D) if (aD > maxDirty) maxDirty = aD;
        int[] typesInDirty = new int[maxDirty];
        for (int aD : D) typesInDirty[aD - 1]++;
        int i = 0;
        while (K > 0 && i < maxClean) {
            if (typesInClean[i] == 1 && i < maxDirty) {
                if (typesInDirty[i] >= 1) {
                    typesInDirty[i]--;
                    res++;
                    K--;
                }
            }
            i++;
        }
        i = 0;
        while (K > 1 && i < maxDirty) {
            while (typesInDirty[i] / 2 > 0 && K > 1) {
                res++;
                K -= 2;
                typesInDirty[i] -= 2;
            }
            i++;
        }
        return res;
    }
}
