package competitive.programming.practice.platform.interviewbit.problem0025;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/rotate-matrix/">https://www.interviewbit.com/problems/rotate-matrix/</a> 
*
**/
public class RotateMatrix implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[N][N];
        for (int i=0;i<N;i++) {
            arr[i]= Utility.getIntArray(scanner.nextLine(), ",");
        }
        Arrays.stream(arr).forEach(a -> System.out.println(Arrays.toString(a)));
    }

    public void rotate(int[][] a) {
        int N = a.length;
        while (N > 1) {


            N--;
        }

    }

    int[][] findNext(int i, int j, int N) {
        return null;
    }
}