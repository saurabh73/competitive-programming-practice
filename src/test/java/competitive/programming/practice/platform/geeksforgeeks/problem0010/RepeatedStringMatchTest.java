package competitive.programming.practice.platform.geeksforgeeks.problem0010;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for RepeatedStringMatch.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1/">https://practice.geeksforgeeks.org/problems/0cba668df04d657fde4d1bd28b626a01e61097f1/1/</a>
 **/
public class RepeatedStringMatchTest extends BaseTest {

    protected RepeatedStringMatchTest() {
        super("/geeksforgeeks/problem0010/", new RepeatedStringMatch());
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