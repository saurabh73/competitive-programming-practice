package competitive.programming.practice.platform.geeksforgeeks.problem0008;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1/">https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1/</a> 
*
**/
public class DamOfCandies implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] height = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(maxCandy(height, n));
    }

    public int maxCandy(int[] arr, int n) {
        int maxCandies = Integer.MIN_VALUE;
        int left = 0;
        int right = n-1;
        while(left < right) {
            int width = right - left -1;
            int height = Math.min(arr[left], arr[right]);
            maxCandies = Math.max(maxCandies, width*height);
            if (arr[left] > arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        left = 0;
        right = n-1;
        while(left < right) {
            int width = right - left -1;
            int height = Math.min(arr[left], arr[right]);
            maxCandies = Math.max(maxCandies, width*height);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxCandies;
    }
}