package competitive.programming.practice.platform.interviewbit.problem0043;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for SpiralOrderMatrix.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/spiral-order-matrix-ii/">https://www.interviewbit.com/problems/spiral-order-matrix-ii/</a>
 **/
public class SpiralOrderMatrixTest extends BaseTest {

    protected SpiralOrderMatrixTest() {
        super("/interviewbit/problem0043/", new SpiralOrderMatrix());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }
}