package competitive.programming.practice.platform.interviewbit.problem0032;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for ExcelColumnTitle.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/excel-column-title/">https://www.interviewbit.com/problems/excel-column-title/</a>
 **/
public class ExcelColumnTitleTest extends BaseTest {

    protected ExcelColumnTitleTest() {
        super("/interviewbit/problem0032/", new ExcelColumnTitle());
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

}