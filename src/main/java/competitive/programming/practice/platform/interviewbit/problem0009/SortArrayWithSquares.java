package competitive.programming.practice.platform.interviewbit.problem0009;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/sort-array-with-squares/">https://www.interviewbit.com/problems/sort-array-with-squares/</a> 
*
**/
public class SortArrayWithSquares implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        int[] output = solve(A);
        System.out.println(Arrays.toString(output));
    }

    public int[] solve(int[] A) {
        int[] output = new int[A.length];
        // initialize
        int negativeIndex = 0;
        while (A[negativeIndex] <= 0) {
            negativeIndex++;
        }
        // adjust extra index
        negativeIndex--;
        int positiveIndex = negativeIndex + 1;

        // merge sort logic
        int index = 0;
        while (negativeIndex >= 0 && positiveIndex < A.length) {
            if (Math.abs(A[negativeIndex]) < Math.abs(A[positiveIndex])) {
                output[index] = A[negativeIndex] * A[negativeIndex];
                negativeIndex--;
            } else {
                output[index] = A[positiveIndex] * A[positiveIndex];
                positiveIndex++;
            }
            index++;
        }

        while (negativeIndex >= 0) {
            output[index] = A[negativeIndex] * A[negativeIndex];
            negativeIndex--;
            index++;
        }

        while (positiveIndex < A.length) {
            output[index] = A[positiveIndex] * A[positiveIndex];
            positiveIndex++;
            index++;
        }


        return output;
    }
}

