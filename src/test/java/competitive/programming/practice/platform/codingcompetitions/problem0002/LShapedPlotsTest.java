package competitive.programming.practice.platform.codingcompetitions.problem0002;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for LShapedPlots.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c509">https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068c509</a> 
*
**/
public class LShapedPlotsTest extends BaseTest {

    public LShapedPlotsTest() {
        super("/codingcompetitions/problem0002/", new LShapedPlots());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}