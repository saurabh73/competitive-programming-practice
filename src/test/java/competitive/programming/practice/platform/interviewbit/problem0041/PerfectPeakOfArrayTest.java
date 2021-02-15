package competitive.programming.practice.platform.interviewbit.problem0041;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PerfectPeakOfArray.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/perfect-peak-of-array/">https://www.interviewbit.com/problems/perfect-peak-of-array/</a>
 **/
public class PerfectPeakOfArrayTest extends BaseTest {

    protected PerfectPeakOfArrayTest() {
        super("/interviewbit/problem0041/", new PerfectPeakOfArray());
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