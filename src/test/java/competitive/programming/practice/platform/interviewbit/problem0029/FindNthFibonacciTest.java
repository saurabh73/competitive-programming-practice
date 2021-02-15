package competitive.programming.practice.platform.interviewbit.problem0029;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for FindNthFibonacci.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/find-nth-fibonacci/">https://www.interviewbit.com/problems/find-nth-fibonacci/</a>
 **/
public class FindNthFibonacciTest extends BaseTest {


    protected FindNthFibonacciTest() {
        super("/interviewbit/problem0029/", new FindNthFibonacci());
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