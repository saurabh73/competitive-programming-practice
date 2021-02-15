package competitive.programming.practice.platform.interviewbit.problem0038;
import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for TripletsWithSumBetweenGivenRange.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/">https://www.interviewbit.com/problems/triplets-with-sum-between-given-range/</a> 
*
**/
public class TripletsWithSumBetweenGivenRangeTest extends BaseTest {


    protected TripletsWithSumBetweenGivenRangeTest() {
        super("/interviewbit/problem0038/", new TripletsWithSumBetweenGivenRange());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

}