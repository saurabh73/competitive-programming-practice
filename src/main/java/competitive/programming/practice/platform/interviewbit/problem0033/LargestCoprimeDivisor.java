package competitive.programming.practice.platform.interviewbit.problem0033;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.math.MathUtility;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/largest-coprime-divisor/">https://www.interviewbit.com/problems/largest-coprime-divisor/</a>
 **/
public class LargestCoprimeDivisor implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = Integer.parseInt(scanner.nextLine());
        int B = Integer.parseInt(scanner.nextLine());
        System.out.println(cpFact(A, B));
    }

    public int cpFact(int A, int B) {
        if (MathUtility.gcd(A, B) == 1) {
            return A;
        } else {
            int max = -1;
            for (int i = 2; i < Math.sqrt(A); i++) {
                // If there is no remainder, then the number is a factor.
                if (A % i == 0) {
                    int num = i;
                    if (MathUtility.gcd(num, B)==1 && num > max) {
                        max = num;
                    }
                    num = A/i;
                    if (MathUtility.gcd(num, B)==1 && num > max) {
                        max = num;
                    }
                }
            }
            return max;
        }
    }
}