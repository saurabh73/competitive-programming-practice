package competitive.programming.practice.platform.geeksforgeeks.problem0005;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for SpiralMatrix.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/cd61add036272faa69c6814e34aa7007d5a25aa6/1/">https://practice.geeksforgeeks.org/problems/cd61add036272faa69c6814e34aa7007d5a25aa6/1/</a>
 **/
public class SpiralMatrixTest extends BaseTest {


    protected SpiralMatrixTest() {
        super("/geeksforgeeks/problem0005/", new SpiralMatrix());
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