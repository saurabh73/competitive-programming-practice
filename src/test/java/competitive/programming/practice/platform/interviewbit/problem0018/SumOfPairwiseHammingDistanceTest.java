package competitive.programming.practice.platform.interviewbit.problem0018;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for SumOfPairwiseHammingDistance.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/">https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/</a>
 **/
public class SumOfPairwiseHammingDistanceTest extends BaseTest {


    protected SumOfPairwiseHammingDistanceTest() {
        super("/interviewbit/problem0018/", new SumOfPairwiseHammingDistance());
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