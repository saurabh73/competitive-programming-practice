package competitive.programming.practice.platform.interviewbit.problem0038;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/">https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/</a>
 **/
public class TripletsWithSumBetweenGivenRange implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String[] A = Utility.getStringArray(scanner.nextLine(), ",");
        System.out.println(solve(A));
    }

    public int solve(String[] A) {
        double[] arr = Arrays.stream(A).mapToDouble(Double::parseDouble).toArray();
        double a = arr[0], b = arr[1], c = arr[2];

        for (int i = 3; i < A.length; i++) {
            // found numbers
            if ((a + b + c < 2) && (a + b + c > 1)) {
                return 1;
            } else if (a + b + c > 2) {  // sum is greater than 2, replace largest number
                if (a > b && a > c) {
                    a = arr[i];
                } else if (b > a && b > c) {
                    b = arr[i];
                } else {
                    c = arr[i];
                }
            } else {  // sum is smaller than 1, replace smallest number
                if (a < b && a < c) {
                    a = arr[i];
                } else if (b < a && b < c) {
                    b = arr[i];
                } else {
                    c = arr[i];
                }
            }
        }
        if ((a + b + c) > 1 && (a + b + c < 2)) {
            return 1;
        } else {
            return 0;
        }
    }
}