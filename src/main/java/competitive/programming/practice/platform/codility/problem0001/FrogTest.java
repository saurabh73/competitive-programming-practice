package competitive.programming.practice.platform.codility.problem0001;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://app.codility.com/c/run/UA5ZD3-QG6/">https://app.codility.com/c/run/UA5ZD3-QG6/</a>
 **/
public class FrogTest implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] A = Utility.getIntArray(scanner.nextLine());
        int ans = this.solution(A);
        System.out.println(ans);
    }

    public int solution(int[] blocks) {
        int N = blocks.length;
        if (N == 1) {
            return 1;
        }
        int maxJump = 0;
        for (int i = 0; i < N; i++) {
            int jumpDistance = findDistance(i, blocks);
            maxJump = Math.max(jumpDistance, maxJump);
            if (maxJump == N) {
                return maxJump;
            }
        }
        return maxJump;
    }


    private static int findDistance(int startingBlock, int[] blocks) {
        int left = findLeftBoundary(blocks, startingBlock);
        int right = findRightBoundary(blocks, startingBlock);
        return right - left + 1;
    }

    private static int findLeftBoundary(int[] blocks, int startingBlock) {
        int left = startingBlock;
        boolean leftSide = false;
        while (!leftSide) {
            if (left > 0 && canJump(blocks[left], blocks[left - 1])) {
                left--;
            } else {
                leftSide = true;
            }
        }
        return left;
    }

    private static int findRightBoundary(int[] blocks, int startingBlock) {
        final int total = blocks.length;
        int right = startingBlock;
        boolean rightSide = false;
        while (!rightSide) {
            if (right < (total - 1) && canJump(blocks[right], blocks[right + 1])) {
                right++;
            } else {
                rightSide = true;
            }
        }
        return right;
    }

    private static boolean canJump(int block1, int block2) {
        return block2 >= block1;
    }
}