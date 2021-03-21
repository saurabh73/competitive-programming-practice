package competitive.programming.practice.platform.interviewbit.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for PickFromBothSides.java
 *
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.interviewbit.com/problems/pick-from-both-sides/">https://www.interviewbit.com/problems/pick-from-both-sides/</a>
 **/
public class PickFromBothSidesTest extends BaseTest {

    protected PickFromBothSidesTest() {
        super("/interviewbit/problem0001/", new PickFromBothSides());
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