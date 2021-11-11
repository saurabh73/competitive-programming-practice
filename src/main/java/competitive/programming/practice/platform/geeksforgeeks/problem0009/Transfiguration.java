package competitive.programming.practice.platform.geeksforgeeks.problem0009;
import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/b6b3297ccfb1ad5f66a9c2b92979170417adf114/1/">https://practice.geeksforgeeks.org/problems/b6b3297ccfb1ad5f66a9c2b92979170417adf114/1/</a> 
*
**/
public class Transfiguration implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        System.out.println(transfigure(A, B));
    }

    int transfigure (String A, String B) {
        if (A.length() != B.length()) {
            return -1;
        } else {

            int N = A.length();
            int aPointer = N-1;
            int bPointer = N-1;
            int count = 0;
            while (aPointer >= 0 && bPointer >= 0) {
                char a = A.charAt(aPointer);
                char b = B.charAt(bPointer);
                if (a != b) {
                    count++;
                    aPointer--;
                } else {
                    aPointer--;
                    bPointer--;
                }
            }
            return count;
        }
    }
}