package competitive.programming.practice.platform.geeksforgeeks.problem0019;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for CoronaVaccine.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/d1afdbd3d49e4e7e6f9d738606cd592f63e6b0f0/1/">https://practice.geeksforgeeks.org/problems/d1afdbd3d49e4e7e6f9d738606cd592f63e6b0f0/1/</a>
 **/
public class CoronaVaccineTest extends BaseTest {

    protected CoronaVaccineTest() {
        super("/geeksforgeeks/problem0019/", new CoronaVaccine());
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