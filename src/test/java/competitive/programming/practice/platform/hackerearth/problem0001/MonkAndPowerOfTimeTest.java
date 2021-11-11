package competitive.programming.practice.platform.hackerearth.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for MonkAndPowerOfTime.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/">https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/</a> 
*
**/
public class MonkAndPowerOfTimeTest extends BaseTest {

    public MonkAndPowerOfTimeTest() {
        super("/hackerearth/problem0001/", new MonkAndPowerOfTime());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}