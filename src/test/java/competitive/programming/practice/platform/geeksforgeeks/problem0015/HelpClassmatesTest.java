package competitive.programming.practice.platform.geeksforgeeks.problem0015;

import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for HelpClassmates.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1/">https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1/</a>
 **/
public class HelpClassmatesTest extends BaseTest {

    protected HelpClassmatesTest() {
        super("/geeksforgeeks/problem0015/", new HelpClassmates());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }
    
}