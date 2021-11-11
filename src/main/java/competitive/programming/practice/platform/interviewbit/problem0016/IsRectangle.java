package competitive.programming.practice.platform.interviewbit.problem0016;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/is-rectangle/">https://www.interviewbit.com/problems/is-rectangle/</a> 
*
**/
public class IsRectangle implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        System.out.println((solve(A,B,C,D) == 1? "true": "false"));
    }

    public int solve(int A, int B, int C, int D) {
        if ((A==B && C==D) || (A == C && B == D) || (A == D && B == C)) {
            return 1;
        }

        return 0;
    }
}