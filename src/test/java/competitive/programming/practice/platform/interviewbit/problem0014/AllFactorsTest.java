package competitive.programming.practice.platform.interviewbit.problem0014;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for AllFactors.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/all-factors/">https://www.interviewbit.com/problems/all-factors/</a>
 **/
public class AllFactorsTest extends BaseTest {

    protected AllFactorsTest() {
        super("/interviewbit/problem0014/", new AllFactors());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
}