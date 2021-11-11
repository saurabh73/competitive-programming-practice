package competitive.programming.practice.platform.interviewbit.problem0042;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/">https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/</a>
 **/
public class KthRowOfPascalTriangle implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int K = scanner.nextInt();
        System.out.println(Arrays.toString(getRow(K)));

    }

    public int[] getRow(int K) {
        int[] ans = new int[K+1];
        for (int i=0;i<=K/2;i++) {
            if (i == 0) {
                ans[i] = ans[K-i] = 1;
            }
            else {
                ans[i] = ans[K-i] =  (ans[i-1]*(K-i+1))/i;
            }
        }
        return ans;
    }
}