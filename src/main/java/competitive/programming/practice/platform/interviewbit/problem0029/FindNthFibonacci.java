package competitive.programming.practice.platform.interviewbit.problem0029;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/find-nth-fibonacci/">https://www.interviewbit.com/problems/find-nth-fibonacci/</a>
 **/
public class FindNthFibonacci implements ISolution {



    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(solve(A));
    }

    private final static int MODULO = 1000_000_007;
    public int solve(int A) {
        if (A == 1)
            return 1;
        long[][] a = {{1, 1}, {1, 0}};
        long[][] ans = matPow(a, A - 1);
        return (int) (ans[0][0]%MODULO);
    }

    private long[][] matPow(long[][] a, int n) {
        if (n == 1)
            return a;
        long[][] temp = matPow(a, n / 2);
        temp = matMul(temp, temp);
        if (n % 2 != 0) { // for odd power, multiply once more
            return matMul(temp, a);
        }
        return temp;

    }

    private long[][] matMul(long[][] a, long[][] b) {
        long i = ((a[0][0] * b[0][0]) % MODULO + (a[0][1] * b[1][0]) % MODULO) % MODULO;
        long j = ((a[0][0] * b[0][1]) % MODULO + (a[0][1] * b[1][1]) % MODULO) % MODULO;
        long k = ((a[1][0] * b[0][0]) % MODULO + (a[1][1] * b[1][0]) % MODULO) % MODULO;
        long l = ((a[1][0] * b[0][1]) % MODULO + (a[1][1] * b[1][1]) % MODULO) % MODULO;
        return new long[][]{{i,j}, {k,l}};
    }
}