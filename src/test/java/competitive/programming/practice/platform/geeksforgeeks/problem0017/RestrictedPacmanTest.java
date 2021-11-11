package competitive.programming.practice.platform.geeksforgeeks.problem0017;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for RestrictedPacman.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/2caf0501a39567d653197364a2b5c8a9f5943b7e/1/">https://practice.geeksforgeeks.org/problems/2caf0501a39567d653197364a2b5c8a9f5943b7e/1/</a>
 **/
public class RestrictedPacmanTest extends BaseTest {

    protected RestrictedPacmanTest() {
        super("/geeksforgeeks/problem0017/", new RestrictedPacman());
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