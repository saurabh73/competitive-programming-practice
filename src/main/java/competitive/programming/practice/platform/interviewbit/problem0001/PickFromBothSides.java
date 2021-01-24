package competitive.programming.practice.platform.interviewbit.problem0001;

import competitive.programming.practice.base.ISolution;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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
        String line = scanner.nextLine();
        ArrayList<Integer> A = (ArrayList<Integer>) Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int B = scanner.nextInt();
        System.out.println(solve(A, B));
    }

    public int solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> prefixArr = new ArrayList<>(A);
        ArrayList<Integer> suffixArr = new ArrayList<>(A);
        int N = A.size();
        for (int i=1; i< N;i++) {
            prefixArr.set(i, prefixArr.get(i-1)+ prefixArr.get(i));
            suffixArr.set(N-i-1, suffixArr.get(N-i-1)+ suffixArr.get((N-i)));
        }
        int max = Math.max(prefixArr.get(B-1), suffixArr.get(N-B));
        for(int i=0;i<B-1;i++) {
            max = Math.max(max, prefixArr.get(i) + suffixArr.get(N-B+i+1));
        }
        return max;
    }
}