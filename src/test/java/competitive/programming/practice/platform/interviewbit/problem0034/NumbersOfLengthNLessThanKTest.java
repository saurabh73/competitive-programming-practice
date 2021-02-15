package competitive.programming.practice.platform.interviewbit.problem0034;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for NumbersOfLengthNLessThanK.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/">https://www.interviewbit.com/problems/numbers-of-length-n-and-value-less-than-k/</a>
 **/
public class NumbersOfLengthNLessThanKTest extends BaseTest {

    protected NumbersOfLengthNLessThanKTest() {
        super("/interviewbit/problem0034/", new NumbersOfLengthNLessThanK());
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