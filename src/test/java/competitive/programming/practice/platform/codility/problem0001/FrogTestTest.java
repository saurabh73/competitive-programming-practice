package competitive.programming.practice.platform.codility.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for FrogTest.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://app.codility.com/c/run/UA5ZD3-QG6/">https://app.codility.com/c/run/UA5ZD3-QG6/</a> 
*
**/
public class FrogTestTest extends BaseTest {

    public FrogTestTest() {
        super("/codility/problem0001/", new FrogTest());
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