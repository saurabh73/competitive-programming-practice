package competitive.programming.practice.platform.interviewbit.problem0016;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for IsRectangle.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/is-rectangle/">https://www.interviewbit.com/problems/is-rectangle/</a>
 **/
public class IsRectangleTest extends BaseTest {

    protected IsRectangleTest() {
        super("/interviewbit/problem0016/", new IsRectangle());
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