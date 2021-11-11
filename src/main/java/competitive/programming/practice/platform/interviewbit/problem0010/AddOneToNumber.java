package competitive.programming.practice.platform.interviewbit.problem0010;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/add-one-to-number/">https://www.interviewbit.com/problems/add-one-to-number/</a>
 **/
public class AddOneToNumber implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(Arrays.toString(plusOne(A)));
    }

    public int[] plusOne(int[] A) {
        int N = A.length - 1;
        int[] output = new int[N+2];
        int carry = 0;
        for (int i = N+1; i >= 1; i--) {
            int number = A[i-1];
            if (i == N+1) {
                number++;
            }
            output[i] = (number + carry) % 10;
            carry = (number + carry) / 10;
        }
        if (carry > 0) {
            output[0]= carry;
        }
        int index=0;
        while (output[index] == 0) {
            index++;
        }

        return  Arrays.copyOfRange(output, index, N+2);
    }
}