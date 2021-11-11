package competitive.programming.practice.platform.interviewbit.problem0037;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.interviewbit.com/problems/maximum-area-of-triangle/">https://www.interviewbit.com/problems/maximum-area-of-triangle/</a>
 **/
public class MaximumAreaOfTriangle implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String[] A = Utility.getStringArray(scanner.nextLine(), ",");
        System.out.println(solve(A));
    }

    public int solve(String[] A) {
        List<Map.Entry<Integer, Integer>> rMap = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> gMap = new ArrayList<>();
        List<Map.Entry<Integer, Integer>> bMap = new ArrayList<>();

        int N = A.length;
        int M = A[0].length();

        // only keep two entry min and max for each column
        for (int col = 0; col < M; col++) {
            int rCount = 0, bCount = 0, gCount = 0;
            for (int row = 0; row < N; row++) {
                AbstractMap.SimpleEntry<Integer, Integer> coordinate = new AbstractMap.SimpleEntry<>(col, row);
                switch (A[row].charAt(col)) {
                    case 'r':
                        rCount++;
                        if (rCount>2) {
                            rMap.remove(rMap.size()-1);
                        }
                        rMap.add(coordinate);
                        break;
                    case 'g':
                        gCount++;
                        if (gCount>2) {
                            gMap.remove(gMap.size()-1);
                        }
                        gMap.add(coordinate);
                        break;
                    case 'b':
                        bCount++;
                        if (bCount>2) {
                            bMap.remove(bMap.size()-1);
                        }
                        bMap.add(coordinate);
                        break;
                }
            }
        }


        if (rMap.isEmpty() || bMap.isEmpty() || gMap.isEmpty()) {
            return 0;
        } else {
            int maxSum = 0;
            int maxPossible = (int) Math.ceil(A.length * A[0].length() * 0.5);
            maxSum = Math.max(maxSum, findMax(rMap, gMap, bMap, maxPossible));
            maxSum = Math.max(maxSum, findMax(gMap, bMap, rMap, maxPossible));
            maxSum = Math.max(maxSum, findMax(bMap, rMap, gMap, maxPossible));
            return maxSum;
        }
    }

    private int findMax(List<Map.Entry<Integer, Integer>> first,
                        List<Map.Entry<Integer, Integer>> second,
                        List<Map.Entry<Integer, Integer>> third,
                        int maxPossible) {
        int maxSum = 0;
        for (Map.Entry<Integer, Integer> firstEntry : first) {
            // find parallel other color pair.
            int sum = findMaxFromEntry(firstEntry, second, third, maxPossible);
            if (sum == maxPossible) {
                return maxPossible;
            }
            sum = Math.max(sum, findMaxFromEntry(firstEntry, third, second, maxPossible));
            if (sum == maxPossible) {
                return maxPossible;
            }
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    private int findMaxFromEntry(Map.Entry<Integer, Integer> firstEntry, List<Map.Entry<Integer, Integer>> second, List<Map.Entry<Integer, Integer>> third, int maxPossible) {
        int maxSum = 0;
        for (Map.Entry<Integer, Integer> secondEntry : second) {
            // ignore others.
            if (secondEntry.getKey().equals(firstEntry.getKey())) {
                for (Map.Entry<Integer, Integer> thirdEntry : third) {
                    if (!secondEntry.getKey().equals(thirdEntry.getKey())) {
                        int area = (int) Math.ceil(0.5 * (Math.abs(secondEntry.getValue() - firstEntry.getValue()) + 1) * (Math.abs(thirdEntry.getKey() - firstEntry.getKey()) + 1));
                        if (area == maxPossible) {
                            return maxPossible;
                        }
                        maxSum = Math.max(maxSum, area);
                    }
                }
            }
        }
        return maxSum;
    }
}