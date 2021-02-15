package competitive.programming.practice.platform.interviewbit.problem0004;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for MinimumLightsToActivate.java
 *
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/minimum-lights-to-activate/">https://www.interviewbit.com/problems/minimum-lights-to-activate/</a>
 **/
public class MinimumLightsToActivateTest extends BaseTest {

    protected MinimumLightsToActivateTest() {
        super("/interviewbit/problem0004/", new MinimumLightsToActivate());
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
    
}