package competitive.programming.practice.platform.interviewbit.problem0022;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.math.MathUtility;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/rearrange-array/">https://www.interviewbit.com/problems/rearrange-array/</a>
 **/
public class RearrangeArray implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] arr = Utility.getIntArray(scanner.nextLine(), ",");
        ArrayList<Integer> a = (ArrayList<Integer>) Arrays.stream(arr).boxed().collect(Collectors.toList());
        arrange(a);
        System.out.println(Arrays.toString(a.toArray()));
    }

    public void arrange(ArrayList<Integer> a) {
        for (int i=0;i < a.size();i++) {
            int num;
            if (a.get(i) < i) {
                num = MathUtility.decodeWithSzudzikFunction(a.get(a.get(i)))[0];
            } else {
                num =  a.get(a.get(i));
            }
            a.set(i, MathUtility.encodeWithSzudzikFunction(a.get(i), num));
        }
        for (int i=0;i < a.size();i++) {
            a.set(i, MathUtility.decodeWithSzudzikFunction(a.get(i))[1]);
        }
    }
}