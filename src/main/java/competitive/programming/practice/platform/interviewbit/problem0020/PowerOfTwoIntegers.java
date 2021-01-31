package competitive.programming.practice.platform.interviewbit.problem0020;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/power-of-two-integers/">https://www.interviewbit.com/problems/power-of-two-integers/</a>
 **/
public class PowerOfTwoIntegers implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println(isPower(scanner.nextInt()));
    }

    public boolean isPower(int A) {
        if (A == 1) {
            return true;
        }
        Set<Integer> powerSet = new HashSet<>();
        for (int i = 2; i <= Math.sqrt(A); i++) {
            int power = i * i;
            while (power > 0) {
                powerSet.add(power);
                power = power * i;
            }
        }

        return powerSet.contains(A);
    }
}