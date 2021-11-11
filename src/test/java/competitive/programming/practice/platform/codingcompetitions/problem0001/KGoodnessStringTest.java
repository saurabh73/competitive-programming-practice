package competitive.programming.practice.platform.codingcompetitions.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for KGoodnessString.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3">https://codingcompetitions.withgoogle.com/kickstart/round/0000000000436140/000000000068cca3</a> 
*
**/
public class KGoodnessStringTest extends BaseTest {

    public KGoodnessStringTest() {
        super("/codingcompetitions/problem0001/", new KGoodnessString());
    }



    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }

    
}