package competitive.programming.practice.platform.interviewbit.problem0021;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/next-similar-number/">https://www.interviewbit.com/problems/next-similar-number/</a>
 **/
public class NextSimilarNumber implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println(solve(scanner.nextLine()));
    }

    public String solve(String A) {
        char[] arr = A.toCharArray();
        int found = -1;
        // I) Start from the right most digit and find the first digit that is
        // smaller than the digit next to it.
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                found = i;
                break;
            }
        }
        // If no such digit is found, then all digits are in descending order
        // means there cannot be a greater number with same set of digits
        if (found < 0) {
            return "-1";
        }
        // II) Find the smallest digit on right side of (found-1)'th digit that is
        // greater than arr[found]
        char minChar = Character.MAX_VALUE;
        int index = found + 1;
        for (int i = found + 1; i < arr.length; i++) {
            if (arr[found] < arr[i] && arr[i] < minChar) {
                index = i;
            }
        }
        // III) Swap the above found smallest digit with arr[found-1]
        char temp = arr[found];
        arr[found] = arr[index];
        arr[index] = temp;

        // IV) Sort the digits after found in ascending order
        Arrays.sort(arr, found+1, arr.length);
        return String.valueOf(arr);
    }
}