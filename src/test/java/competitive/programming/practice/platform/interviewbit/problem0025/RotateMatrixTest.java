package competitive.programming.practice.platform.interviewbit.problem0025;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for RotateMatrix.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/rotate-matrix/">https://www.interviewbit.com/problems/rotate-matrix/</a>
 **/
public class RotateMatrixTest extends BaseTest {

    protected RotateMatrixTest() {
        super("/interviewbit/problem0025/", new RotateMatrix());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }
}