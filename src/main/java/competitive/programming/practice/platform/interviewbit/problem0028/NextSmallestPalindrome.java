package competitive.programming.practice.platform.interviewbit.problem0028;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/next-smallest-palindrome/">https://www.interviewbit.com/problems/next-smallest-palindrome/</a>
 **/
public class NextSmallestPalindrome implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String A = scanner.nextLine();
        System.out.println(solve(A));
    }

    public String solve(String A) {
        if (A.length() == 1) {
            int num = Integer.parseInt(A);
            if (num < 9) {
                return String.valueOf(num+1);
            } else {
                return "11";
            }
        }
        if (A.matches("9+")) { // if all 999 -> 1000
            return  "1" + String.format("%0" + (A.length()-1) + "d", 0) +"1";
        }

        int N = A.length();
        String firstHalf = A.substring(0, N / 2);
        String secondHalf = A.substring(N/2 + N%2);
        StringBuilder temp = new StringBuilder(firstHalf);
        int offset = temp.reverse().toString().compareTo(secondHalf) <= 0 ? 1: 0;
        int num = Character.getNumericValue(A.charAt(firstHalf.length() -1 + N%2));
        StringBuilder ans = new StringBuilder();
        if (offset == 0) {
            ans.append(firstHalf);
            if (N%2 != 0) {
                ans.append(num);
            }
            ans.append(temp);
        } else {

            if (N%2 == 0) { // if number is even
                // check last number
                temp = new StringBuilder(new BigInteger(firstHalf).add(BigInteger.ONE).toString());
                ans.append(temp);
                ans.append(temp.reverse());
            } else {
                // check
                String firstPart = new BigInteger(String.format("%s%d", firstHalf,num)).add(BigInteger.ONE).toString();
                StringBuilder secondPart = new StringBuilder(firstPart.substring(0, firstPart.length()-1));
                ans.append(firstPart);
                ans.append(secondPart.reverse());
            }
        }
        return ans.toString();
    }

}