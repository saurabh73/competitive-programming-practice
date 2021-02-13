package competitive.programming.practice.platform.interviewbit.problem0041;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/perfect-peak-of-array/">https://www.interviewbit.com/problems/perfect-peak-of-array/</a> 
*
**/
public class PerfectPeakOfArray implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(perfectPeak(A));
    }

    public int perfectPeak(int[] A) {
        int N = A.length;
        for (int i=1; i< N-1;i++) {
            int temp =A[i];
            int k = i-1;
            int j = i+1;
            while (true) {
                if (k>=0 && A[k] < temp) {
                    k--;
                }
                if(j < N && A[j] > temp) {
                    j++;
                }
                if( (k >= 0 && A[k] >= temp) || ( j < N && A[j] <= temp))
                    break;

                if (k < 0 && j >=N) {
                    return 1;
                }
            }
        }
        return 0;
    }

}