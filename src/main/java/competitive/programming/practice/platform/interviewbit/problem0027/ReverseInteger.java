package competitive.programming.practice.platform.interviewbit.problem0027;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/reverse-integer/">https://www.interviewbit.com/problems/reverse-integer/</a> 
*
**/
public class ReverseInteger implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(reverse(A));
    }

    public int reverse(int A) {
        int sign = A > 0 ? 1: -1;
        A = A*sign;
        StringBuilder ans = new StringBuilder();
        while(A>0) {
            ans.append(A%10);
            A =A/10;
        }
        try {
            return sign*Integer.parseInt(ans.toString());
        } catch (Exception ex ) {
            return 0;
        }
    }
}