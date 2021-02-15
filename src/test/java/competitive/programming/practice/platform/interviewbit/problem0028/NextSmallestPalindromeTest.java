package competitive.programming.practice.platform.interviewbit.problem0028;

import competitive.programming.practice.platform.BaseTest;
import org.junit.jupiter.api.Test;

/**
 * Test for NextSmallestPalindrome.java
 *
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/next-smallest-palindrome/">https://www.interviewbit.com/problems/next-smallest-palindrome/</a>
 **/
public class NextSmallestPalindromeTest extends BaseTest {

    protected NextSmallestPalindromeTest() {
        super("/interviewbit/problem0028/", new NextSmallestPalindrome());
    }

    @Test
    public void case1Test() throws Exception {
        runTest("input1.txt", "output1.txt");
    }


    @Test
    public void case2Test() throws Exception {
        runTest("input2.txt", "output2.txt");
    }

    @Test
    public void case3Test() throws Exception {
        runTest("input3.txt", "output3.txt");
    }
}