package competitive.programming.practice.platform.interviewbit.problem0006;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for TotalMovesForBishop.java
 *
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/total-moves-for-bishop/">https://www.interviewbit.com/problems/total-moves-for-bishop/</a>
 **/
public class TotalMovesForBishopTest extends BaseTest {


    protected TotalMovesForBishopTest() {
        super("/interviewbit/problem0006/", new TotalMovesForBishop());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output2.txt");
    }
}