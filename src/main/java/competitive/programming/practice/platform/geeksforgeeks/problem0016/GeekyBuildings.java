package competitive.programming.practice.platform.geeksforgeeks.problem0016;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;
import java.util.Stack;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/355f731797ea1acbd5ab698b19eb1c3c469aa837/1/">https://practice.geeksforgeeks.org/problems/355f731797ea1acbd5ab698b19eb1c3c469aa837/1/</a> 
*
**/
public class GeekyBuildings implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(recreationalSpot(arr, N));
    }

    public boolean recreationalSpot(int[] arr , int n){
        Stack<Integer> b1 = new Stack<>();
        Stack<Integer>  b2 = new Stack<>();
        b1.push(arr[0]);
        b2.push(arr[0]);

        for (int i=1;i < n;i++) {
            if (arr[i]> b1.peek() && arr[i] < b2.peek()) {
                return true;
            }
            if (arr[i] < b1.peek()) {
                b1.push(arr[i]);
            }
            if (arr[i] > b2.peek()) {
                b2.push(arr[i]);
            }
        }
        return false;
    }
}