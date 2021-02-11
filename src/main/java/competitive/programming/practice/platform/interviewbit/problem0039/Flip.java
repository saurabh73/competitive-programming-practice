package competitive.programming.practice.platform.interviewbit.problem0039;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/flip/">https://www.interviewbit.com/problems/flip/</a>
 **/
public class Flip implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println(Arrays.toString(flip(scanner.nextLine())));
    }

    public int[] flip(String A) {
        // convert 0 -> 1 and 1 -> -1 and apply modify Kadane's Algorithm to find L and R of max subarray
        int[] arr = A.chars().map(i -> i - 48).map(i -> i == 0 ? 1 : -1).toArray();
        int L = -1, R = -1;
        int bestSum = 0, currentSum = 0;
        int currentL = 0, currentR = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            // reset current sum if negative
            if (currentSum < 0) {
                currentSum = num;
                currentL = currentR = i;
            } else {
                currentSum += num;
                currentR = i;
            }
            if (currentSum > bestSum) {
                bestSum = currentSum;
                L = currentL;
                R = currentR;
            }
        }
        return L < 0 && R < 0 ? new int[]{} : new int[]{L + 1, R + 1};
    }
}