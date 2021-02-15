package competitive.programming.practice.platform.geeksforgeeks.problem0011;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for CheckTreeTraversal.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/cb02d40f50b0113c47cd9036e5f340bb51b32289/1/">https://practice.geeksforgeeks.org/problems/cb02d40f50b0113c47cd9036e5f340bb51b32289/1/</a>
 **/
public class CheckTreeTraversalTest extends BaseTest {

    protected CheckTreeTraversalTest() {
        super("/geeksforgeeks/problem0011/", new CheckTreeTraversal());
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