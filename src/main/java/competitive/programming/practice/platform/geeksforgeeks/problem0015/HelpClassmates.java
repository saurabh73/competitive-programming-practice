package competitive.programming.practice.platform.geeksforgeeks.problem0015;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1/">https://practice.geeksforgeeks.org/problems/fab3dbbdce746976ba35c7b9b24afde40eae5a04/1/</a>
 **/
public class HelpClassmates implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(Arrays.toString(helpClassmate(arr, N)));
    }

    public int[] helpClassmate(int arr[], int n) {

        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int num: arr) {
            stack.push(num);
        }

        for (int i=n-1; i>=0;i--) {
            int top = stack.pop();
            ans[i] = -1;
            for (int j=i+1;j<n;j++) {
                if (arr[j] < top) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}