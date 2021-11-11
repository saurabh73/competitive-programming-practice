package competitive.programming.practice.platform.interviewbit.problem0002;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.geometry.Coordinate;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://www.interviewbit.com/problems/min-steps-in-infinite-grid/">https://www.interviewbit.com/problems/min-steps-in-infinite-grid/</a> 
*
**/
public class MinStepsInInfiniteGrid implements ISolution {

    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine(), ",");
        int[] B = Utility.getIntArray(scanner.nextLine(), ",");

        System.out.println(coverPoints(A, B));
    }

    public int coverPoints(int[] A, int[] B) {
        int steps = 0;
        int index = 0;
        while(index < A.length-1) {
            Coordinate current = new Coordinate(A[index], B[index]);
            Coordinate next = new Coordinate(A[index+1], B[index+1]);
            steps += Math.max(Math.abs(next.getX() - current.getX()), Math.abs(next.getY() - current.getY()));
            index++;
        }
        return steps;
    }
}