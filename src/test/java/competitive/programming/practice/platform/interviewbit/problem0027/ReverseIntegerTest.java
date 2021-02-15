package competitive.programming.practice.platform.interviewbit.problem0027;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for ReverseInteger.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/reverse-integer/">https://www.interviewbit.com/problems/reverse-integer/</a>
 **/
public class ReverseIntegerTest extends BaseTest {


    protected ReverseIntegerTest() {
        super("/interviewbit/problem0027/", new ReverseInteger());
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