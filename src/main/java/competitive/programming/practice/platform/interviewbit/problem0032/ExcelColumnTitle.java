package competitive.programming.practice.platform.interviewbit.problem0032;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/excel-column-title/">https://www.interviewbit.com/problems/excel-column-title/</a> 
*
**/
public class ExcelColumnTitle implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(convertToTitle(A));
    }

    public String convertToTitle(int A) {
        StringBuilder ans = new StringBuilder();
        while(A>0) {
            int val = (A-1)%26;
            char ch = (char) ('A' + val);
            ans.append(ch);
            A = (A-1)/26;
        }
        return ans.reverse().toString();
    }
}