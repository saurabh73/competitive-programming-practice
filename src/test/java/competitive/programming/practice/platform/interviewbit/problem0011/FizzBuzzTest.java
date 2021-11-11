package competitive.programming.practice.platform.interviewbit.problem0011;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for FizzBuzz.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/fizzbuzz/">https://www.interviewbit.com/problems/fizzbuzz/</a>
 **/
public class FizzBuzzTest extends BaseTest {

    protected FizzBuzzTest() {
        super("/interviewbit/problem0011/", new FizzBuzz());
    }


    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

}