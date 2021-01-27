package competitive.programming.practice.platform.interviewbit.problem0008;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/large-factorial/">https://www.interviewbit.com/problems/large-factorial/</a> 
*
**/
public class LargeFactorial implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(solve(A));
    }

    public String solve(int A) {
        int[] result = new int[160];
        result[159] = 1;
        for (int i=2;i<=A;i++) {
            multiply(result, i);
        }
        return Arrays.toString(result).replace(",", "")  //remove the commas
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .replace(" ", "")
                .replaceFirst("^0+(?!$)", "")
                .trim();

    }

    private void multiply(int[] result, int N) {
        int carry = 0;
        for (int i=result.length-1;i>0;i--) {
            int multiply = (result[i]*N);
            result[i] = (multiply + carry)%10;
            carry =  (multiply + carry)/10;
        }
    }
}