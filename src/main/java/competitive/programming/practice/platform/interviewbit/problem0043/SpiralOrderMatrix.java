package competitive.programming.practice.platform.interviewbit.problem0043;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/spiral-order-matrix-ii/">https://www.interviewbit.com/problems/spiral-order-matrix-ii/</a>
 **/
public class SpiralOrderMatrix implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = scanner.nextInt();
        int[][] ans = generateMatrix(N);
        for (int[] row : ans) {
            System.out.println(Arrays.toString(row));
        }
    }

    public int[][] generateMatrix(int A) {
        int[][] ans = new int[A][A];
        int num = 0;
        // left - right
        int left = 0;
        int right = A - 1;
        int top = 0;
        int bottom = A - 1;
        int direction = 0;
        while (num < A * A) {
            switch (direction) {
                case 0:
                    for (int i = left; i <= right; i++) {
                        num++;
                        ans[top][i] = num;
                    }
                    top++;
                    break;
                case 1:
                    for (int i = top; i <= bottom; i++) {
                        num++;
                        ans[i][right] = num;
                    }
                    right--;
                    break;
                case 2:
                    for (int i = right; i >= left; i--) {
                        num++;
                        ans[bottom][i] = num;
                    }
                    bottom--;
                    break;
                case 3:
                    for (int i = bottom; i >= top; i--) {
                        num++;
                        ans[i][left] = num;
                    }
                    left++;
                    break;
            }

            direction = (direction + 1) % 4;

        }


        return ans;
    }
}