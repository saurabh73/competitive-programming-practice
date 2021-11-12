package competitive.programming.practice.platform.hackerearth.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for SumOfTwo.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.hackerearth.com/practice-onboarding/sum-of-two-1/">https://www.hackerearth.com/practice-onboarding/sum-of-two-1/</a> 
*
**/
public class SumOfTwoTest extends BaseTest {

    public SumOfTwoTest() {
        super("/hackerearth/problem0001/", new SumOfTwo());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}