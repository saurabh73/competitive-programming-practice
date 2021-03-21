package competitive.programming.practice.platform.interviewbit.problem0017;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PrimeSum.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/prime-sum/">https://www.interviewbit.com/problems/prime-sum/</a>
 **/
public class PrimeUtilitySumTest extends BaseTest {


    protected PrimeUtilitySumTest() {
        super("/interviewbit/problem0017/", new PrimeSum());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

}