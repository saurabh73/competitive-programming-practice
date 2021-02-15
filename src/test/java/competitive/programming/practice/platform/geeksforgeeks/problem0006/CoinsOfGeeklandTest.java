package competitive.programming.practice.platform.geeksforgeeks.problem0006;
import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for CoinsOfGeekland.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/">https://practice.geeksforgeeks.org/problems/257a9e27fb3e58255622c8dcb06e0919cc1c6c11/1/</a> 
*
**/
public class CoinsOfGeeklandTest extends BaseTest {


    protected CoinsOfGeeklandTest() {
        super("/geeksforgeeks/problem0006/", new CoinsOfGeekland());
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