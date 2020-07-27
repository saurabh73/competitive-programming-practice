package competitive.programming.practice.leetcode.problem0002;

import competitive.programming.annotation.leetcode.Entry;
import competitive.programming.practice.base.ISolution;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/">https://leetcode.com/explore/interview/card/top-interview-questions-medium/103/array-and-strings/777/</a>
 **/
public class ArrayAndStrings implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        String line = reader.readLine().trim();
        String[][] arr = Arrays.stream(line.substring(2, line.length() - 2).split("\\],\\["))
                .map(e -> Arrays.stream(e.split("\\s*,\\s*"))
                        .toArray(String[]::new)).toArray(String[][]::new);
        int[][] matrix = new int[arr.length][arr[0].length];
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(arr[i][j]);
            }
        }
        setZeroes(matrix);
    }

    @Entry
    public void setZeroes(int[][] matrix) {
        boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < C; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}