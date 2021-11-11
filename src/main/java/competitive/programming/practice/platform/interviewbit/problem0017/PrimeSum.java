package competitive.programming.practice.platform.interviewbit.problem0017;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.math.PrimeUtility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/prime-sum/">https://www.interviewbit.com/problems/prime-sum/</a> 
*
**/
public class PrimeSum implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(Arrays.toString(primesum(A)));
    }

    public int[] primesum(int A) {
        int[] ans = new int[2];
        // generate all prime upto A
        PrimeUtility primeUtility = new PrimeUtility(A);
        for (int i=2;i<A;i++) {
            if (primeUtility.isPrime(i) && primeUtility.isPrime(A-i)) {
                ans[0] = i;
                ans[1] = A-i;
                break;
            }
        }
        return ans;
    }
}