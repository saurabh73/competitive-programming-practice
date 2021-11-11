package competitive.programming.practice.platform.interviewbit.problem0023;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/max-sum-contiguous-subarray/">https://www.interviewbit.com/problems/max-sum-contiguous-subarray/</a> 
*
**/
public class MaxSumContiguousSubarray implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] arr = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(maxSubArray(Arrays.stream(arr).boxed().collect(Collectors.toList())));
    }

    public int maxSubArray(final List<Integer> A) {
        int maxValue = Integer.MIN_VALUE;
        int sum = 0;
        for (Integer integer : A) {
            sum += integer;
            if (sum > maxValue) {
                maxValue = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxValue;
    }
}