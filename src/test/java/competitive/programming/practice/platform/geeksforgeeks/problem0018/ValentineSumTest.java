package competitive.programming.practice.platform.geeksforgeeks.problem0018;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for ValentineSum.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/0f02fb492c69c094d94e806cba6ff8d8cd04d630/1/?">https://practice.geeksforgeeks.org/problems/0f02fb492c69c094d94e806cba6ff8d8cd04d630/1/?</a>
 **/
public class ValentineSumTest extends BaseTest {

    protected ValentineSumTest() {
        super("/geeksforgeeks/problem0018/", new ValentineSum());
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