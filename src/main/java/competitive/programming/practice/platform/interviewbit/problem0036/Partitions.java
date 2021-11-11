package competitive.programming.practice.platform.interviewbit.problem0036;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/partitions/">https://www.interviewbit.com/problems/partitions/</a>
 **/
public class Partitions implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = Integer.parseInt(scanner.nextLine());
        int[] B = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(solve(A, B));
    }

    public int solve(int N, int[] A) {

        int sum = Arrays.stream(A).reduce(0, Integer::sum);
        if (sum % 3 != 0)
            return 0;
        int target = sum / 3;
        int[] prefixArr = Arrays.copyOf(A, N);
        int[] suffixArr = Arrays.copyOf(A, N);
        for (int i = 1; i < N; i++) {
            prefixArr[i] = prefixArr[i - 1] + prefixArr[i];
            suffixArr[N - i - 1] = suffixArr[N - i - 1] + suffixArr[N - i];
        }
        int count = 0; // initializing answer
        for (int i = 0; i < N; i++) {
            if (prefixArr[i] == target) {
                count+= IntStream.range(i+2, N).filter(j -> suffixArr[j] == target).count();
            }
        }
        return count;
    }
}