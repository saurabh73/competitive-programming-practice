package competitive.programming.practice.platform.interviewbit.problem0026;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/palindrome-integer/">https://www.interviewbit.com/problems/palindrome-integer/</a> 
*
**/
public class PalindromeInteger implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println(isPalindrome(scanner.nextInt()) == 1);
    }
    public int isPalindrome(int A) {
        char[] arr = Integer.toString(A).toCharArray();
        for (int i=0;i<arr.length/2;i++) {
            if (arr[i] != arr[arr.length-i-1]) {
                return 0;
            }
        }
        return 1;
    }
}