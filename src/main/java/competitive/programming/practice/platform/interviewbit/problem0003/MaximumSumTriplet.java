package competitive.programming.practice.platform.interviewbit.problem0003;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/maximum-sum-triplet/">https://www.interviewbit.com/problems/maximum-sum-triplet/</a>
 **/
public class MaximumSumTriplet implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(solve(A));
    }

    public int solve(int[] A) {
        if (A.length < 3) {
            return 0;
        } else {
            int max = 0;
            for (int i = 1; i < A.length - 1; i++) {
                int current = A[i];
                int maxLeft = 0;
                int maxRight = 0;

                for (int j = 0; j < i; j++) {
                    if (A[j] < current) {
                        maxLeft = Math.max(maxLeft, A[j]);
                    }
                }

                if (maxLeft > 0) {
                    for (int j = i + 1; j < A.length; j++) {
                        if (A[j] > current) {
                            maxRight = Math.max(maxRight, A[j]);
                        }
                    }
                    if (maxRight > 0) {
                        max = Math.max(max, current + maxLeft + maxRight);
                    }
                }
            }
            return max;
        }
    }
}