package competitive.programming.practice.hackerearth.problem0004;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.commons.utils.Utility;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Saurabh Dutta<saurabh73>
 * @see <a href="https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/happy-vertices/?utm_source=header&utm_medium=search&utm_campaign=he-search">https://www.hackerearth.com/practice/algorithms/graphs/depth-first-search/practice-problems/algorithm/happy-vertices/?utm_source=header&utm_medium=search&utm_campaign=he-search</a>
 **/
public class HappyVertices implements ISolution {

    @Override
    public void solve(InputStream in) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int[] nodeEdges = Utility.getIntArray(br.readLine());

        int N = nodeEdges[0];
        int M = nodeEdges[1];

        boolean[][] Nodes = new boolean[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int[] intArray = Utility.getIntArray(br.readLine());
            Nodes[intArray[0]][intArray[1]] = true;
            Nodes[intArray[1]][intArray[0]] = true;
        }
        Stack<Map.Entry<Integer, Integer>> Q = new Stack<>();
        Map<Integer, Integer> visited = new HashMap<>();
        int happynodes = 0;
        visited.put(-1, Integer.MAX_VALUE);

        for (int j=1; j<=N;j++) {
            if (!visited.containsKey(j)) {
                // mark it as master node
                Q.add(new AbstractMap.SimpleEntry<>(j, -1));
                while (!Q.isEmpty()) {
                    Map.Entry<Integer, Integer> poll = Q.pop();
                    int value = poll.getKey();
                    int parent = poll.getValue();
                    int children = 0;
                    for (int i = 1; i < N + 1; i++) {
                        if (Nodes[i][value]) {
                            children++;
                            if (!visited.containsKey(i)) {
                                Q.add(new AbstractMap.SimpleEntry<>(i, value));
                            }
                        }
                    }
                    if (visited.get(parent) < children) {
                        happynodes++;
                    }
                    visited.put(value, children);
                }
            }
        }
        System.out.println(happynodes);
    }

}