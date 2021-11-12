package competitive.programming.practice.platform.codechef.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for LifeTheUniverseAndEverything.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.codechef.com/problems/TEST">https://www.codechef.com/problems/TEST</a> 
*
**/
public class LifeTheUniverseAndEverythingTest extends BaseTest {

    public LifeTheUniverseAndEverythingTest() {
        super("/codechef/problem0001/", new LifeTheUniverseAndEverything());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}