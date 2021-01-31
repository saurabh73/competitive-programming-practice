package competitive.programming.practice.platform.geeksforgeeks.problem0007;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/1/">https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/1/</a>
 **/
public class ValidPairSum implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = Utility.getIntArray(scanner.nextLine(), " ");
        System.out.println(ValidPair(arr, n));
    }

    public long ValidPair(int a[], int n) {
        long total = 0;
        int l = a.length;
        long ans = 0;
        int p = 0, q = l - 1;
        Arrays.sort(a);
        while (p < q) {
            if (a[p] + a[q] > 0) {
                ans += q - p;
                q--;
            } else {
                p++;
            }
        }
        return ans;
    }
}