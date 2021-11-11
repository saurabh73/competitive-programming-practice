package competitive.programming.practice.platform.geeksforgeeks.problem0012;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/974612adac31d8e35448df5879342690f841c532/1/">https://practice.geeksforgeeks.org/problems/974612adac31d8e35448df5879342690f841c532/1/</a> 
*
**/
public class RulingPair implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] arr = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(rulingPair(arr, N));

    }
    public int rulingPair(int[] arr, int n) {
        int maxSum = -1;
        Map<Integer, PriorityQueue<Integer>> sumMap = new HashMap<>();

        for (int num : arr) {
            int digitSum = calcDigitSum(num);
            PriorityQueue<Integer> integers = sumMap.get(digitSum);
            if (integers != null && !integers.isEmpty()) {
                int pairField = integers.peek();
                if (maxSum < (pairField+num)) {
                    maxSum = pairField+num;
                }
                integers.add(num);
            } else {
                integers = new PriorityQueue<>(1, Comparator.reverseOrder());
                integers.add(num);
                sumMap.put(digitSum, integers);
            }
        }

        return maxSum;
    }

    private int calcDigitSum(int num) {
        int sum=0;
        while(num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

}