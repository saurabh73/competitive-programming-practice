package competitive.programming.practice.platform.interviewbit.problem0015;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for DistributeInCircle.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/distribute-in-circle/">https://www.interviewbit.com/problems/distribute-in-circle/</a>
 **/
public class DistributeInCircleTest extends BaseTest {

    protected DistributeInCircleTest() {
        super("/interviewbit/problem0015/", new DistributeInCircle());
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