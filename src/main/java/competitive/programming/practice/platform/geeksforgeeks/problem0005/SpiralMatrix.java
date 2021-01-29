package competitive.programming.practice.platform.geeksforgeeks.problem0005;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.io.input.InputReader;

import java.io.InputStream;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/cd61add036272faa69c6814e34aa7007d5a25aa6/1/">https://practice.geeksforgeeks.org/problems/cd61add036272faa69c6814e34aa7007d5a25aa6/1/</a> 
*
**/
public class SpiralMatrix implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        InputReader inputReader = new InputReader(in);
        int n=inputReader.nextInt();
        int m=inputReader.nextInt();
        int k=inputReader.nextInt();
        int[][] a = inputReader.nextIntMatrix(n, m);
        System.out.println(findK(a, n, m, k));
    }

    public int findK(int a[][], int n, int m, int k) {
        int direction = 0; // 0 -> right, 1 -> down, 2 -> right, 3 -> up
        int T = 0, B = n - 1, L = 0, R = m - 1;
        int index = 0;
        int value = 0;
        while (index < k) {
            switch (direction) {
                case 0:
                    for (int i = L; i <= R; i++) {
                        value = a[T][i];
                        index++;
                        if (index == k) {
                            return value;
                        }
                    }
                    T++;
                    break;
                case 1:
                    for (int i = T; i <= B; i++) {
                        value = a[i][R];
                        index++;
                        if (index == k) {
                            return value;
                        }
                    }
                    R--;
                    break;
                case 2:
                    for (int i = R; i >= L; i--) {
                        value = a[B][i];
                        index++;
                        if (index == k) {
                            return value;
                        }
                    }
                    B--;
                    break;
                case 3:
                    for (int i = B; i >= T; i--) {
                        value = a[i][L];
                        index++;
                        if (index == k) {
                            return value;
                        }
                    }
                    L++;
                    break;
            }
            direction = (direction + 1) % 4;
        }
        return value;
    }
}