package competitive.programming.practice.platform.geeksforgeeks.problem0002;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/nth-natural-number/1">https://practice.geeksforgeeks.org/problems/nth-natural-number/1</a>
 **/
public class NthNaturalNumber implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        long N = scanner.nextLong();
        System.out.println(findNth(N));
    }

    long findNth(long N) {
        long ans = 0;
        int i = 0;
        while (N > 0) {
            ans += ((long) Math.pow(10, i) * (N % 9));
            N /= 9;
            i++;
        }
        return ans;
    }

}