package competitive.programming.practice.platform.interviewbit.problem0035;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/">https://www.geeksforgeeks.org/maximum-absolute-difference-value-index-sums/</a>
 * @see <a href="https://www.interviewbit.com/problems/maximum-absolute-difference/">https://www.interviewbit.com/problems/maximum-absolute-difference/</a>
 **/
public class MaximumAbsoluteDifference implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(maxArr(A));
    }

    public int maxArr(int[] A) {
        int max1 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {

            // Updating max and min variables
            // as described in algorithm.
            max1 = Math.max(max1, A[i] + i);
            min1 = Math.min(min1, A[i] + i);
            max2 = Math.max(max2, A[i] - i);
            min2 = Math.min(min2, A[i] - i);
        }
        return Math.max(max1 - min1, max2 - min2);
    }
}