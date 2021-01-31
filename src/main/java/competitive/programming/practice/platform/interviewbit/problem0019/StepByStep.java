package competitive.programming.practice.platform.interviewbit.problem0019;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/step-by-step/">https://www.interviewbit.com/problems/step-by-step/</a> 
*
**/
public class StepByStep implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(solve(A));
    }
    public int solve(int A) {
        if (A == 0) {
            return 0;
        }
        A = Math.abs(A);
        int sum = 0;
        int step = 0;
        while (sum < A || (sum-A)%2 == 0) {
            step++;
            sum+=step;
        }
        return step;
    }

}