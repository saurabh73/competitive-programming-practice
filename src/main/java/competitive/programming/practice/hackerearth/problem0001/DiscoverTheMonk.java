package competitive.programming.practice.hackerearth.problem0001;

import competitive.programming.practice.base.ISolution;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
/**
 *
 * @author Saurabh Dutta<saurabh73>
 *
 * @see <a href="https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/discover-the-monk/">https://www.hackerearth.com/practice/algorithms/searching/binary-search/practice-problems/algorithm/discover-the-monk/</a>
 *
 **/
public class DiscoverTheMonk implements ISolution {

    @Override
    public void solve(InputStream in) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = br.readLine();

        int N = convertIntoIntArray(line)[0];
        int Q = convertIntoIntArray(line)[1];

        line = br.readLine();
        int[] arr = convertIntoIntArray(line);

        Arrays.sort(arr);
        StringBuilder result = new StringBuilder("");
        int index = 0;

        for (int i = 0; i < Q; i++) {
        index = Arrays.binarySearch(arr, Integer.parseInt(br.readLine()));
        if (index >= 0) {
            result.append("YES\n");
        } else {
            result.append("NO\n");
        }
        }

        System.out.println(result);
    }

    public int[] convertIntoIntArray(String arr, String seperator) {
        arr = arr.trim();
        String arrEle[] = arr.split(seperator);
        int[] inputArray = new int[arrEle.length];
        for (int i = 0; i < arrEle.length; i++) {
        inputArray[i] = Integer.parseInt(arrEle[i]);
        }
        return inputArray;
    }

    public int[] convertIntoIntArray(String arr) {
        return convertIntoIntArray(arr, " ");
    }
}
