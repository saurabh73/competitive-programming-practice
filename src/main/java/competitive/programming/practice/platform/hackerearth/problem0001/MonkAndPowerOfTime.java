package competitive.programming.practice.platform.hackerearth.problem0001;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.queue.CircularQueue;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/">https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/</a>
 **/
public class MonkAndPowerOfTime implements ISolution {

    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] callingOrder = Utility.getIntArray(scanner.nextLine(), " ");
        int[] idealOrder = Utility.getIntArray(scanner.nextLine(), " ");


        CircularQueue queue = new CircularQueue(N, callingOrder);

        int total = 0;
        int current = 0;
        while (!queue.isEmpty()) {
            while (idealOrder[current] != queue.frontElement()) {
                int frontElement = queue.frontElement();
                queue.dequeue();
                queue.enqueue(frontElement);
                total++;
            }

            queue.dequeue();
            current++;
            total++;
        }
        System.out.println(++total);
    }
}