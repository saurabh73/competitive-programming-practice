package competitive.programming.practice.platform.interviewbit.problem0013;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/prime-numbers/">https://www.interviewbit.com/problems/prime-numbers/</a> 
*
**/
public class PrimeNumbers implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        System.out.println(Arrays.toString(sieve(A)));

    }

    public int[] sieve(int A) {
        boolean[] primes = new boolean[A+1];
        // set all to true
        Arrays.fill(primes, true);
        primes[0]=false;
        primes[1]=false;

        for (int i=2;i<=A;i++) {
            if (primes[i]) {
                int index = 2;
                while (i*index <= A) {
                    primes[i*index] = false;
                    index++;
                }
            }
        }

        List<Integer> primeList = new ArrayList<>();
        for(int i=0;i<primes.length;i++) {
            if (primes[i]) {
                primeList.add(i);
            }
        }
        return primeList.stream().mapToInt(i ->i).toArray();
    }
}