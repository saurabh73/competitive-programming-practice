package competitive.programming.practice.platform.leetcode.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for TwoSum.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://leetcode.com/problems/two-sum/">https://leetcode.com/problems/two-sum/</a> 
*
**/
public class TwoSumTest extends BaseTest {

    public TwoSumTest() {
        super("/leetcode/problem0001/", new TwoSum());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}