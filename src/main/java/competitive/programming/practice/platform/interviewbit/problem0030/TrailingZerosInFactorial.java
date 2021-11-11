package competitive.programming.practice.platform.interviewbit.problem0030;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/trailing-zeros-in-factorial/">https://www.interviewbit.com/problems/trailing-zeros-in-factorial/</a> 
*
**/
public class TrailingZerosInFactorial implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(trailingZeroes(A));
    }

    public int trailingZeroes(int A) {
        int count = 0;

        for(int i=1; Math.pow(5, i) <= A; i++) {
            count += (A/ (int) Math.pow(5,i));
        }

        return count;
    }
}