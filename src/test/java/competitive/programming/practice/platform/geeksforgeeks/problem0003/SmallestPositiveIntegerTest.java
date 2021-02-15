package competitive.programming.practice.platform.geeksforgeeks.problem0003;
import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;
/**
*
* Test for SmallestPositiveInteger.java 
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/">https://practice.geeksforgeeks.org/problems/b6b608d4eb1c45f2b5cace77c4914f302ff0f80d/1/</a> 
*
**/
public class SmallestPositiveIntegerTest  extends BaseTest {


    protected SmallestPositiveIntegerTest() {
        super("/geeksforgeeks/problem0003/", new SmallestPositiveInteger());
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