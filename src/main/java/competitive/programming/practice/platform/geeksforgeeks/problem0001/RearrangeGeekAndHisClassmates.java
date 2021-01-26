package competitive.programming.practice.platform.geeksforgeeks.problem0001;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/47e5aa3f32aee9e0405f04960f37c8a562d96a2f/1/">https://practice.geeksforgeeks.org/problems/47e5aa3f32aee9e0405f04960f37c8a562d96a2f/1/</a>
 **/
public class RearrangeGeekAndHisClassmates implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] a = Utility.getLongArray(scanner.nextLine(), " ");
        prank(a, n);
        Arrays.stream(a).forEach(s -> System.out.print(s + " "));
    }

    void prank(long[] a, int n) {
        int[] seating = new int[n];
        long [] b = new long[n];
        for (int i=0;i<n;i++) {
            seating[(int) a[i]] = i;
        }
        for (int i=0;i<n;i++) {
            b[seating[i]] = a[i];
        }
        if (n >= 0) System.arraycopy(b, 0, a, 0, n);
    }
}