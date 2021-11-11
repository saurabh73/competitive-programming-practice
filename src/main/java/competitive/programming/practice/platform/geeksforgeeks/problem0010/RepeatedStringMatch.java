package competitive.programming.practice.platform.geeksforgeeks.problem0010;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1/">https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1/</a>
 **/
public class RepeatedStringMatch implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        System.out.println(repeatedStringMatch(A, B));
    }

    public int repeatedStringMatch(String A, String B) {
        int count = 1;
        int N = B.length() / A.length();
        String temp = A;
        for (int i = 0; i <= N + 2; i++) {
            if (A.contains(B)) {
                return count + i;
            }
            A += temp;
        }
        return -1;
    }
}