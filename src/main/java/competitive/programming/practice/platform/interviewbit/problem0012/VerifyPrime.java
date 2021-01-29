package competitive.programming.practice.platform.interviewbit.problem0012;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/verify-prime/">https://www.interviewbit.com/problems/verify-prime/</a> 
*
**/
public class VerifyPrime implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(isPrime(A));
    }

    public boolean isPrime(int A) {

        for (int i=2;i <= Math.ceil(Math.sqrt(A)); i++) {
            if (A%i == 0) {
                return false;
            }
        }

        return true;
    }
}