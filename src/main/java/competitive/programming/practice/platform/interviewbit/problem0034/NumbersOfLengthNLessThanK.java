package competitive.programming.practice.platform.interviewbit.problem0034;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/">https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/</a>
 **/
public class NumbersOfLengthNLessThanK implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), " ");
        int B = Integer.parseInt(scanner.nextLine());
        int C = Integer.parseInt(scanner.nextLine());
        System.out.println(solve(A, B, C));
    }

    public int solve(int[] A, int B, int C) {
        int d = A.length;
        if (d == 0) {
            return 0;
        }
        char[] charArray = Integer.toString(C).toCharArray();
        int[] digits = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            digits[i] = Character.getNumericValue(charArray[i]);
        }
        if (B > digits.length) {
            return 0;
        } else if (B < digits.length) {
            if (A[0] == 0 && B != 1)
                return (int) ((d - 1) * Math.pow(d, B - 1));
            else
                return (int) Math.pow(d, B);
        } else {
            int d2;
            int[] dp = new int[B + 1];
            int[] lower = new int[10 + 1];

            // Update the lower[] array such that
            // lower[i] stores the count of elements
            // in A[] which are less than i
            for (int j : A) {
                lower[j + 1] = 1;
            }
            for (int i = 1; i <= 10; i++) {
                lower[i] = lower[i - 1] + lower[i];
            }

            boolean flag = true;
            dp[0] = 0;
            for (int i = 1; i <= B; i++) {
                d2 = lower[digits[i - 1]];
                dp[i] = dp[i - 1] * d;

                // For first index we can't use 0
                if (i == 1 && A[0] == 0 && B != 1) {
                    d2 = d2 - 1;
                }

                // Whether (i-1) digit of generated number
                // can be equal to (i - 1) digit of C
                if (flag) {
                    dp[i] += d2;
                }

                // Is digit[i - 1] present in A ?
                flag = (flag & (lower[digits[i - 1] + 1] == lower[digits[i - 1]] + 1));
            }
            return dp[B];
        }
    }

}