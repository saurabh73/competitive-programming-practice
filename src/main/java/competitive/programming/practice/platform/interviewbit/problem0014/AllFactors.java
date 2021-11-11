package competitive.programming.practice.platform.interviewbit.problem0014;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/all-factors/">https://www.interviewbit.com/problems/all-factors/</a> 
*
**/
public class AllFactors implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(Arrays.toString(allFactors(A)));
    }

    public int[] allFactors(int A) {
        Set<Integer> factors = new TreeSet<>();
        factors.add(1);
        factors.add(A);
        for (int i=2;i<=Math.ceil(Math.sqrt(A)); i++) {
            if (A%i == 0) {
                factors.add(i);
                factors.add(A/i);
            }
        }

        return factors.stream().mapToInt(i ->i).toArray();
    }
}