package competitive.programming.practice.platform.interviewbit.problem0024;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/largest-number/">https://www.interviewbit.com/problems/largest-number/</a>
 **/
public class LargestNumber implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        System.out.println(largestNumber(Utility.getIntArray(scanner.nextLine(), ",")));
    }

    public String largestNumber(final int[] A) {
        String output = Arrays.stream(A).mapToObj(Integer::toString)
                .sorted((o1, o2) -> {
                    if (Long.parseLong(o1 + o2) > Long.parseLong(o2 + o1)) {
                        return -1;
                    } else {
                        return 1;
                    }
                })
                .collect(Collectors.joining(""));
        if (output.matches("[0]+")) {
            output = "0";
        }
        return output;
    }
}