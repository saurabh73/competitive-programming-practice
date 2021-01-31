package competitive.programming.practice.platform.geeksforgeeks.problem0006;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.io.input.InputReader;

import java.io.InputStream;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/">https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/</a>
 **/
public class CoinsOfGeekland implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        InputReader inputReader = new InputReader(in);
        int N = inputReader.nextInt();
        int K = inputReader.nextInt();
        int[][] mat = inputReader.nextIntMatrix(N, N);
        System.out.println(Maximum_Sum(mat, N, K));
    }

    public int Maximum_Sum(int[][] mat, int N, int K) {
        int[][] sumArray = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sumArray[i][j] = mat[i][j];
                if (i > 0) {
                    sumArray[i][j] += sumArray[i - 1][j];
                }
            }
        }

        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= K - 1; j--) {
                int tempSum = 0;
                for (int k = 0; k < K; k++) {
                    tempSum += sumArray[i][j - k];
                }
                sumArray[i][j] = tempSum;
            }
        }
        int max = sumArray[K - 1][K - 1];
        for (int i = K - 1; i < N; i++) {
            for (int j = K - 1; j < N; j++) {
               max = Math.max(max, sumArray[i][j] - (i-K < 0 ? 0 : sumArray[i-K][j]));
            }
        }

        return max;
    }
}