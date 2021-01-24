package competitive.programming.practice.platform.interviewbit.problem0003;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/maximum-sum-triplet/">https://www.interviewbit.com/problems/maximum-sum-triplet/</a>
 **/
public class MaximumSumTriplet implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine();
        ArrayList<Integer> A = (ArrayList<Integer>) Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(solve(A));
    }

    public int solve(ArrayList<Integer> A) {
        if (A.size() < 3) {
            return 0;
        } else {
            int max = 0;
            for (int i = 1; i < A.size() - 1; i++) {
                int current = A.get(i);
                int maxLeft = 0;
                int maxRight = 0;

                for (int j = 0; j < i; j++) {
                    if (A.get(j) < current) {
                        maxLeft = Math.max(maxLeft, A.get(j));
                    }
                }

                if (maxLeft > 0) {
                    for (int j = i + 1; j < A.size(); j++) {
                        if (A.get(j) > current) {
                            maxRight = Math.max(maxRight, A.get(j));
                        }
                    }
                    if (maxRight > 0) {
                        max = Math.max(max, current + maxLeft + maxRight);
                    }
                }
            }
            return max;
        }
    }
}