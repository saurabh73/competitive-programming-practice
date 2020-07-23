package competitive.programming.practice.leetcode.problem0001;


import competitive.programming.annotation.leetcode.Entry;
import competitive.programming.practice.base.ISolution;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://leetcode.com/problems/3sum/">https://leetcode.com/problems/3sum/</a> 
*
**/
public class Problem3sum implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in, StandardCharsets.UTF_8));
        String line = reader.readLine().trim();
        String[] input = line.substring(1, line.length() - 1).split(",");
        int[] arr = Arrays.stream(input)
                .map(String::trim)
                .mapToInt(Integer::parseInt)
                .toArray();
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }

    @Entry
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0 || i + 3 > n) return result; // only choose negative numbers as target
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip same numbers
            int target = -nums[i];

            // search for target
            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int actual = nums[l] + nums[r];
                if (actual == target) {
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    while (l < r && nums[l] == nums[++l]); // skip all same values from l till r
                    while (l < r && nums[r] == nums[--r]); // skip all same values from r till l
                } else if (actual < target) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}