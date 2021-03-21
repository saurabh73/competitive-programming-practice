package competitive.programming.practice.platform.interviewbit.problem0042;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for KthRowOfPascalTriangle.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/">https://www.interviewbit.com/problems/kth-row-of-pascals-triangle/</a>
 **/
public class KthRowOfPascalTriangleTest extends BaseTest {

    protected KthRowOfPascalTriangleTest() {
        super("/interviewbit/problem0042/", new KthRowOfPascalTriangle());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
}