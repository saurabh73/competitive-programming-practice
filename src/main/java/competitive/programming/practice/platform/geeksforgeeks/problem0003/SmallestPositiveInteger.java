package competitive.programming.practice.platform.geeksforgeeks.problem0003;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/">https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/</a> 
*
**/
public class SmallestPositiveInteger implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        long[] array = Utility.getLongArray(scanner.nextLine(), ",");
        System.out.println(smallestPositive(array, n));
    }

    long smallestPositive(long[] array, int n){
        // Sort Array
        Arrays.sort(array);
        // if empty array of first element is greater than 1
        if (n ==0 || array[0] > 1) {
            return 1L;
        } else {
            long ans = 1;
            // if array[i] > ans, then ans lies in gap of sorted array
            // because array is sorted, ans can grow min of last two consecutive values.
            for (int i=0; i< n && array[i] <= ans; i++) {
                ans+=array[i];
            }
            return ans;
        }

    }
}