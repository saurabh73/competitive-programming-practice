package competitive.programming.practice.platform.geeksforgeeks.problem0017;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/2caf0501a39567d653197364a2b5c8a9f5943b7e/1/">https://practice.geeksforgeeks.org/problems/2caf0501a39567d653197364a2b5c8a9f5943b7e/1/</a>
 **/
public class RestrictedPacman implements ISolution {


    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        System.out.println(candies(M, N));
    }

    public int candies(int m, int n) {
        int[] dp = new int[250001];
        Arrays.fill(dp, -1);
        int lcm = m * n;
        int count = 0;
        for (int i = 1; i <= lcm; i++) {
            if (!isDivisible(i, m, n, dp)) {
                count++;
            }
        }
        return count;
    }

    private boolean isDivisible(int num, int m, int n, int[] dp) {
        if (num < 0) {
            return false;
        } else if (num == 0) {
            return true;
        } else {
            if (dp[num] == 1) {
                return true;
            } else if (dp[num] == 0) {
                return false;
            } else {
                dp[num] = (isDivisible(num - m, m, n, dp) || isDivisible(num - n, m, n, dp)) ? 1 : 0;
                return dp[num] == 1;
            }
        }
    }


}