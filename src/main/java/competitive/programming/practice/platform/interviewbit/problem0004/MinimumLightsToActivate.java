package competitive.programming.practice.platform.interviewbit.problem0004;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://www.interviewbit.com/problems/minimum-lights-to-activate/">https://www.interviewbit.com/problems/minimum-lights-to-activate/</a> 
*
**/
public class MinimumLightsToActivate implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        //TODO: Implement Solution
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), " ");
        int B = scanner.nextInt();
        System.out.println(solve(A, B));
    }

    public int solve(int[] A, int B) {
        int range = B-1;
        boolean[] lighted = new boolean[A.length];
        boolean[] picked = new boolean[A.length];
        int lightedCount =0;
        int pickCount=0;
        for(int i=0;i<A.length;i++) {
            if (!lighted[i]) {
                for (int j=Math.min(A.length-1, i+range);j>=Math.max(0, i-range);j--) {
                    if (A[j] == 1) {
                        if (!picked[j]) {
                            pickCount++;
                            picked[j] = true;
                            // light all bulbs from picked bulb
                            for (int k=Math.max(0, j-range); k<=Math.min(A.length-1, j+range); k++) {
                                if (!lighted[k]){
                                    lighted[k] = true;
                                    lightedCount++;
                                }
                            }
                        }
                        break;
                    }
                }
            }
        }
        return lightedCount == A.length ? pickCount : -1;
    }
}