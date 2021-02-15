package competitive.programming.practice.platform.interviewbit.problem0010;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for AddOneToNumber.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/add-one-to-number/">https://www.interviewbit.com/problems/add-one-to-number/</a>
 **/
public class AddOneToNumberTest extends BaseTest {

    protected AddOneToNumberTest() {
        super("/interviewbit/problem0010/", new AddOneToNumber());
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