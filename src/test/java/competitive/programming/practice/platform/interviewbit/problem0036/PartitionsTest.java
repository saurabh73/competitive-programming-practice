package competitive.programming.practice.platform.interviewbit.problem0036;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for Partitions.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/partitions/">https://www.interviewbit.com/problems/partitions/</a>
 **/
public class PartitionsTest extends BaseTest {


    protected PartitionsTest() {
        super("/interviewbit/problem0036/", new Partitions());
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