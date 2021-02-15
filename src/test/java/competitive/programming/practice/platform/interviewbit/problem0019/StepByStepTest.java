package competitive.programming.practice.platform.interviewbit.problem0019;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

/**
 * Test for StepByStep.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/step-by-step/">https://www.interviewbit.com/problems/step-by-step/</a>
 **/
public class StepByStepTest extends BaseTest {

    private ByteArrayOutputStream buffer;

    protected StepByStepTest() {
        super("/interviewbit/problem0019/", new StepByStep());
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