package competitive.programming.practice.platform.geeksforgeeks.problem0007;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for ValidPairSum.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/1/">https://practice.geeksforgeeks.org/problems/3b76f77c1b2107f809b1875aa9fe929ce320be97/1/</a>
 **/
public class ValidPairSumTest extends BaseTest {

    protected ValidPairSumTest() {
        super("/geeksforgeeks/problem0007/", new ValidPairSum());
    }


    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output2.txt");
    }


    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }


    @Test
    public void case4Test() throws Exception {
        runTest("input4.txt", "output4.txt");
    }
}