package competitive.programming.practice.platform.interviewbit.problem0026;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PalindromeInteger.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/palindrome-integer/">https://www.interviewbit.com/problems/palindrome-integer/</a>
 **/
public class PalindromeIntegerTest extends BaseTest {


    protected PalindromeIntegerTest() {
        super("/interviewbit/problem0026/", new PalindromeInteger());
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