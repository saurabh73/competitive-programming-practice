package competitive.programming.practice.platform.codingcompetitions.problem0001;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.io.input.InputReader;

import java.io.InputStream;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3">https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3</a>
 **/
public class KGoodnessString implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        InputReader inputReader = new InputReader(in);
        int T = inputReader.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = inputReader.nextInt();
            int K = inputReader.nextInt();
            String S = inputReader.nextString();
            System.out.printf("Case #%d: %d\n", t, solve(N, K, S));
        }
    }

    private int solve(int n, int k, String s) {
        int score = n % 2 == 0 ? 0 : 1;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                score++;
            }
        }
        return Math.abs(k - score);
    }
}