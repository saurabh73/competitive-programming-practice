package competitive.programming.practice.platform.interviewbit.problem0015;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/distribute-in-circle/">https://www.interviewbit.com/problems/distribute-in-circle/</a> 
*
**/
public class DistributeInCircle implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        System.out.println(solve(A,B,C));
    }

    public int solve(int A, int B, int C) {
        return (A+C-1)%B;
    }
}