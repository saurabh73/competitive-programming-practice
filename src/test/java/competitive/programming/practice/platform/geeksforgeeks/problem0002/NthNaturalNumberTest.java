package competitive.programming.practice.platform.geeksforgeeks.problem0002;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for NthNaturalNumber.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/nth-natural-number/1">https://practice.geeksforgeeks.org/problems/nth-natural-number/1</a>
 **/
public class NthNaturalNumberTest extends BaseTest {

    protected NthNaturalNumberTest() {
        super("/geeksforgeeks/problem0002/", new NthNaturalNumber());
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