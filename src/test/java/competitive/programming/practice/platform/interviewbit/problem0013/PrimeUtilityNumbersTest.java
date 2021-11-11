package competitive.programming.practice.platform.interviewbit.problem0013;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PrimeNumbers.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/prime-numbers/">https://www.interviewbit.com/problems/prime-numbers/</a>
 **/
public class PrimeUtilityNumbersTest extends BaseTest {


    protected PrimeUtilityNumbersTest() {
        super("/interviewbit/problem0013/", new PrimeNumbers());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

}