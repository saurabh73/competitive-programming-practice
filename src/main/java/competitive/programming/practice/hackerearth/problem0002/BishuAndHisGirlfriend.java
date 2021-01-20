package competitive.programming.practice.hackerearth.problem0002;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.commons.io.input.InputReader;

import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/bishu-and-his-girlfriend/">https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/bishu-and-his-girlfriend/</a>
 **/
public class BishuAndHisGirlfriend implements ISolution {
    public static void main(String[] args) throws Exception {
        BishuAndHisGirlfriend bishuAndHisGirlfriend = new BishuAndHisGirlfriend();
        bishuAndHisGirlfriend.solve(System.in);
    }

    @Override
    public void solve(InputStream in) throws Exception {
        InputReader inputReader = new InputReader(in);
        int N = inputReader.nextInt();
        boolean[][] arr = new boolean[N + 1][N + 1];
        for (int i = 1; i < N; i++) {
            int[] input = inputReader.nextIntArray(2);
            arr[input[0]][input[1]] = arr[input[1]][input[0]] = true;
        }
        int Q = inputReader.nextInt();
        Map<Integer, Boolean> girls = new TreeMap<>();
        for (int i = 0; i < Q; i++) {
            int girl = inputReader.nextInt();
            girls.put(girl, false);
        }
        findGirl(arr, girls);
    }

    private void findGirl(boolean[][] arr, Map<Integer, Boolean> girls) {
        boolean[] visited = new boolean[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        visited[1] = true;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            for (int i = 1; i < arr.length; i++) {
                if (arr[node][i] && !visited[i]) {
                    stack.add(i);
                    visited[i] = true;
                    if (girls.containsKey(i)) {
                        girls.put(i, true);
                    }
                }
            }
            Optional<Map.Entry<Integer, Boolean>> girl =
                    girls.entrySet().parallelStream().filter(Map.Entry::getValue).findFirst();
            if (girl.isPresent()) {
                System.out.println(girl.get().getKey());
                break;
            }
        }
    }
}