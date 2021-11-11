package competitive.programming.practice.platform.codingcompetitions.problem0002;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.geometry.Coordinate;
import competitive.programming.practice.common.io.input.InputReader;

import java.io.InputStream;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c509">https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c509</a>
 **/
public class LShapedPlots implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        InputReader inputReader = new InputReader(in);
        int T = inputReader.nextInt();

        for (int t = 1; t <= T; t++) {
            int R = inputReader.nextInt();
            int C = inputReader.nextInt();
            int[][] grid = inputReader.nextIntMatrix(R, C);
            System.out.printf("Case #%d: %d\n", t, findLPlots(R, C, grid));
        }
    }

    private int findLPlots(int r, int c, int[][] grid) {
        // find all good segments of length more than 2
        return 0;
    }

    static class L {

        private final Coordinate start;
        private final Coordinate end;
        private final int[][] grid;

        public L(Coordinate start, Coordinate end, int[][] grid) {
            this.start = start;
            this.end = end;
            this.grid = grid;
        }




    }
}