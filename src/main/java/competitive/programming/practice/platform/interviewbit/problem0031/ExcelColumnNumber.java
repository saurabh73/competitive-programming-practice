package competitive.programming.practice.platform.interviewbit.problem0031;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/excel-column-number/">https://www.interviewbit.com/problems/excel-column-number/</a>
 **/
public class ExcelColumnNumber implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String A = scanner.nextLine();
        System.out.println(titleToNumber(A));
    }

    public int titleToNumber(String A) {
        int num = 0;
        for (int i = 0; i < A.length(); i++) {
            int val = (A.charAt(i) - 'A') + 1;
            num += val * Math.pow(26, A.length() - i -1);
        }
        return num;
    }
}