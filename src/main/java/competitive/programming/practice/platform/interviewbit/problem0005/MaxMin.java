package competitive.programming.practice.platform.interviewbit.problem0005;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/">https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/</a> 
*
**/
public class MaxMin implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(solve(A));
    }

    public int solve(int[] A) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int a : A) {
            max = Math.max(max, a);
            min = Math.min(min, a);
        }
        return max+min;
    }
}