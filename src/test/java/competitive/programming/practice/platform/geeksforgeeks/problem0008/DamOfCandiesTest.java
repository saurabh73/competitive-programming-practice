package competitive.programming.practice.platform.geeksforgeeks.problem0008;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for DamOfCandies.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1/">https://practice.geeksforgeeks.org/problems/10471201e923a0b88a0c1482e6c7e8cc6fdfe93a/1/</a>
 **/
public class DamOfCandiesTest extends BaseTest {
    
    protected DamOfCandiesTest() {
        super("/geeksforgeeks/problem0008/", new DamOfCandies());
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