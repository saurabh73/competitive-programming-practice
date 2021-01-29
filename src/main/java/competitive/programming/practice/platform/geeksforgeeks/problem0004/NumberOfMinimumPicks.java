package competitive.programming.practice.platform.geeksforgeeks.problem0004;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/620fb6456d6515faddd77050dfbf2821d7a94b8a/1/">https://practice.geeksforgeeks.org/problems/620fb6456d6515faddd77050dfbf2821d7a94b8a/1/</a> 
*
**/
public class NumberOfMinimumPicks implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] a = Utility.getIntArray(scanner.nextLine(), ",");
        int k = Integer.parseInt(scanner.nextLine());
        System.out.println(find_min(a,n, k));
    }

    public int find_min(int[] a, int n, int k) {
        int maxPairs = Arrays.stream(a).map(i -> i=i/2).reduce(0, Integer::sum);
        // not able to get k pairs
        if (maxPairs < k) {
            return -1;
        } else {
            // initial sum of pairs without exhausting any color
            int sum = Arrays.stream(a).map(i -> {
                if (i%2 == 0) {
                    return (i-1)/2;
                }
                return i/2;
            }).reduce(0, Integer::sum);
            // sum is less than k, so we pick all pairs without exhausting colors
            // so we need to take more socks,
            // then we will take n more socks (i.e, 1 sock from each color), so now each color will have 1 or 0 sock remaining,
            // then each new pick will complete a pair,
            // therefore (k-sum) more picks are required
            if (k > sum) {
                return 2*sum + n + (k-sum);
            }
            // when initial pick is equal or more than sum, we pick k-1 pairs, plus n+1 to complete k pair.
            else {
                return 2*(k-1) + n + 1;
            }
        }


    }
}