package competitive.programming.practice.platform.interviewbit.problem0033;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.math.MathUtility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        List<Integer> collect = Arrays.stream(MathUtility.factors(A))
                .filter(i -> MathUtility.gcd(i, B) == 1).boxed()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return collect.get(0);
    }
}