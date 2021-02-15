package competitive.programming.practice.platform.interviewbit.problem0031;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for ExcelColumnNumber.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/excel-column-number/">https://www.interviewbit.com/problems/excel-column-number/</a>
 **/
public class ExcelColumnNumberTest extends BaseTest {

    protected ExcelColumnNumberTest() {
        super("/interviewbit/problem0031/", new ExcelColumnNumber());
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