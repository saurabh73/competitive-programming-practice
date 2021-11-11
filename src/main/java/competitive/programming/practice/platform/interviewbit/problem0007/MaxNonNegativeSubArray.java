package competitive.programming.practice.platform.interviewbit.problem0007;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/max-non-negative-subarray/">https://www.interviewbit.com/problems/max-non-negative-subarray/</a> 
*
**/
public class MaxNonNegativeSubArray implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        int[] maxSubArr = maxset(A);
        System.out.println(Arrays.toString(maxSubArr));
    }

    public int[] maxset(int[] A) {
        long maxSum = Long.MIN_VALUE;
        int maxStartIndex = 0;
        int maxEndIndex=0;
        long currentSum = 0;
        int currentStartIndex=0;
        int currentEndIndex=0;

        for (int i=0;i<A.length;i++) {
            if (A[i] >= 0) {
                currentSum+=A[i];
                currentEndIndex = i;
            }
            else {
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                    maxEndIndex = currentEndIndex;
                    maxStartIndex = currentStartIndex;
                }
                currentSum = 0;
                currentEndIndex=i+1;
                currentStartIndex=i+1;
            }
        }

        if(currentSum > maxSum) {
            maxEndIndex = currentEndIndex;
            maxStartIndex = currentStartIndex;
        }

        int size = maxEndIndex - maxStartIndex + 1;
        int[] result = new int[size];
        int index=0;
        for (int i=maxStartIndex; i<=maxEndIndex; i++) {
            result[index++] = A[i];
        }
        return Arrays.stream(result).filter(i -> i>=0).toArray();
    }
}