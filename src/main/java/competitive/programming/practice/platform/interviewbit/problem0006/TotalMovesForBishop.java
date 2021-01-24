package competitive.programming.practice.platform.interviewbit.problem0006;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta<saurabh73> 
*
* @see <a href="https://www.interviewbit.com/problems/total-moves-for-bishop/">https://www.interviewbit.com/problems/total-moves-for-bishop/</a> 
*
**/
public class TotalMovesForBishop implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        //TODO: Implement Solution
        Scanner scanner = new Scanner(in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(solve(A, B));
    }

    public int solve(int A, int B) {
        int xLeftDiff = A - 1; // 3
        int xRightDiff = 8 - A; // 4
        int yTopDiff = B - 1; // 3
        int yBottomDiff = 8 - B; // 4

        int movesRightBottom = Math.min(xRightDiff, yBottomDiff);
        int movesLeftBottom = Math.min(xLeftDiff, yBottomDiff);
        int movesRightTop = Math.min(xRightDiff, yTopDiff);
        int movesLeftTop = Math.min(xLeftDiff, yTopDiff);

        return movesLeftBottom+movesRightBottom+movesLeftTop+movesRightTop;
    }
}