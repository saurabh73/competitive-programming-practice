package competitive.programming.practice.platform.interviewbit.problem0002;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.geometry.Coordinate;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        ArrayList<Integer> A = (ArrayList<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        ArrayList<Integer> B = (ArrayList<Integer>) Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(coverPoints(A, B));
    }

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int steps = 0;
        int index = 0;

        while(index < A.size()-1) {
            Coordinate current = new Coordinate(A.get(index), B.get(index));
            Coordinate next = new Coordinate(A.get(index+1), B.get(index+1));
            steps += Math.max(Math.abs(next.getX() - current.getX()), Math.abs(next.getY() - current.getY()));
            index++;
        }
        return steps;
    }
}