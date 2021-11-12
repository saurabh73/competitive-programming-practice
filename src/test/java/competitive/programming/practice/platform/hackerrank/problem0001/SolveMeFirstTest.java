package competitive.programming.practice.platform.hackerrank.problem0001;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
* Test for SolveMeFirst.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.hackerrank.com/challenges/solve-me-first/problem">https://www.hackerrank.com/challenges/solve-me-first/problem</a> 
*
**/
public class SolveMeFirstTest extends BaseTest {

    public SolveMeFirstTest() {
        super("/hackerrank/problem0001/", new SolveMeFirst());
    }

        

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }
    
}