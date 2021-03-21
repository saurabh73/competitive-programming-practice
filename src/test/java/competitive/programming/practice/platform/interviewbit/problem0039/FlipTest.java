package competitive.programming.practice.platform.interviewbit.problem0039;
import competitive.programming.practice.base.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for Flip.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://www.interviewbit.com/problems/flip/">https://www.interviewbit.com/problems/flip/</a> 
*
**/
public class FlipTest extends BaseTest {

    protected FlipTest() {
        super("/interviewbit/problem0039/", new Flip());
    }
    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output1.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }

}