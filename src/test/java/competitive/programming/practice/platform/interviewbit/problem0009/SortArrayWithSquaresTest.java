package competitive.programming.practice.platform.interviewbit.problem0009;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for SortArrayWithSquares.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/sort-array-with-squares/">https://www.interviewbit.com/problems/sort-array-with-squares/</a>
 **/
public class SortArrayWithSquaresTest extends BaseTest {


    protected SortArrayWithSquaresTest() {
        super("/interviewbit/problem0009/", new SortArrayWithSquares());
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