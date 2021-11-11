package competitive.programming.practice.platform.interviewbit.problem0021;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for NextSimilarNumber.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/next-similar-number/">https://www.interviewbit.com/problems/next-similar-number/</a>
 **/
public class NextSimilarNumberTest extends BaseTest {

    protected NextSimilarNumberTest() {
        super("/interviewbit/problem0021/", new NextSimilarNumber());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }


    @Test
    public void case4Test() throws Exception {
        runTest("input4.txt", "output4.txt");
    }

    @Test
    public void case5Test() throws Exception {
        runTest("input5.txt", "output5.txt");
    }
    
}