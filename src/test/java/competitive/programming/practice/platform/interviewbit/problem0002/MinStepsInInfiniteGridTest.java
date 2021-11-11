package competitive.programming.practice.platform.interviewbit.problem0002;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for MinStepsInInfiniteGrid.java
 *
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/min-steps-in-infinite-grid/">https://www.interviewbit.com/problems/min-steps-in-infinite-grid/</a>
 **/
public class MinStepsInInfiniteGridTest extends BaseTest {

    protected MinStepsInInfiniteGridTest() {
        super("/interviewbit/problem0002/", new MinStepsInInfiniteGrid());
    }


    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
}