package competitive.programming.practice.platform.interviewbit.problem0001;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://www.interviewbit.com/problems/pick-from-both-sides/">https://www.interviewbit.com/problems/pick-from-both-sides/</a> 
*
**/
public class PickFromBothSides implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        //TODO: Implement Solution
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        int B = scanner.nextInt();
        System.out.println(solve(A, B));
    }

    public int solve(int[] A, int B) {
        int N = A.length;
        int[] prefixArr = Arrays.copyOf(A, N);
        int[] suffixArr = Arrays.copyOf(A, N);

        for (int i=1; i< N;i++) {
            prefixArr[i] = prefixArr[i-1] + prefixArr[i];
            suffixArr[N-i-1]=suffixArr[N-i-1] + suffixArr[N-i];
        }
        int max = Math.max(prefixArr[B-1], suffixArr[N-B]);
        for(int i=0;i<B-1;i++) {
            max = Math.max(max, prefixArr[i] + suffixArr[N-B+i+1]);
        }
        return max;
    }
}