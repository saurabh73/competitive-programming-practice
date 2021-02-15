package competitive.programming.practice.platform.geeksforgeeks.problem0001;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for RearrangeGeekAndHisClassmates.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/47e5aa3f32aee9e0405f04960f37c8a562d96a2f/1/">https://practice.geeksforgeeks.org/problems/47e5aa3f32aee9e0405f04960f37c8a562d96a2f/1/</a>
 **/
public class RearrangeGeekAndHisClassmatesTest extends BaseTest {


    public RearrangeGeekAndHisClassmatesTest() {
        super("/geeksforgeeks/problem0001/", new RearrangeGeekAndHisClassmates());
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