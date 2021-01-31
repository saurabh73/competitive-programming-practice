package competitive.programming.practice.platform.interviewbit.problem0018;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/">https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/</a> 
*
**/
public class SumOfPairwiseHammingDistance implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(hammingDistance(A));
    }

    public int hammingDistance(final int[] A) {
        final long PRIME_MODULO = 1000000007;
        long n = A.length;
        long sum = 0;
        for (int i=0;i<32;i++) {
            long count = 0;
            for (int k : A) {
                if ((k & 1 << i) != 0) {
                    count++;
                }
            }
            sum = (sum + (count * (n - count) * 2)%PRIME_MODULO)%PRIME_MODULO;
        }
        return (int) sum;
    }
}