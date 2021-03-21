package competitive.programming.practice.platform.geeksforgeeks.problem0004;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for NumberOfMinimumPicks.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/620fb6456d6515faddd77050dfbf2821d7a94b8a/1/">https://practice.geeksforgeeks.org/problems/620fb6456d6515faddd77050dfbf2821d7a94b8a/1/</a>
 **/
public class NumberOfMinimumPicksTest extends BaseTest {

    protected NumberOfMinimumPicksTest() {
        super("/geeksforgeeks/problem0004/", new NumberOfMinimumPicks());
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