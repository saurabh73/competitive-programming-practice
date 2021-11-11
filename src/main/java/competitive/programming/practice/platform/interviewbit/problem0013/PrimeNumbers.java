package competitive.programming.practice.platform.interviewbit.problem0013;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.math.PrimeUtility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/prime-numbers/">https://www.interviewbit.com/problems/prime-numbers/</a> 
*
**/
public class PrimeNumbers implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(Arrays.toString(sieve(A)));

    }

    public int[] sieve(int A) {
        PrimeUtility primeUtility = new PrimeUtility(A);
        return primeUtility.getPrimes();
    }
}