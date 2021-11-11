package competitive.programming.practice.platform.interviewbit.problem0011;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/fizzbuzz/">https://www.interviewbit.com/problems/fizzbuzz/</a> 
*
**/
public class FizzBuzz implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        String[] ans = fizzBuzz(A);
        Arrays.stream(ans).forEach(i -> System.out.printf("%s ", i));
    }

    public String[] fizzBuzz(int A) {
        return IntStream.range(1, A + 1).mapToObj(i -> {
            if (i % 15 == 0) {
                return "FizzBuzz";
            } else if (i % 5 == 0) {
                return "Buzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else {
                return Integer.toString(i);
            }
        }).collect(Collectors.toList()).toArray(new String[A]);
    }
}