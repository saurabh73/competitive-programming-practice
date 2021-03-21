package competitive.programming.practice.platform.geeksforgeeks.problem0012;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for RulingPair.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/974612adac31d8e35448df5879342690f841c532/1/">https://practice.geeksforgeeks.org/problems/974612adac31d8e35448df5879342690f841c532/1/</a>
 **/
public class RulingPairTest extends BaseTest {

    protected RulingPairTest() {
        super("/geeksforgeeks/problem0012/", new RulingPair());
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