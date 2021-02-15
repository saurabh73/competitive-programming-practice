package competitive.programming.practice.platform.interviewbit.problem0040;
import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for MergeIntervals.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/merge-intervals/">https://www.interviewbit.com/problems/merge-intervals/</a> 
*
**/
public class MergeIntervalsTest extends BaseTest {


    protected MergeIntervalsTest() {
        super("/interviewbit/problem0040/", new MergeIntervals());
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