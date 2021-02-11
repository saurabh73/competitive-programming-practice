package competitive.programming.practice.platform.geeksforgeeks.problem0013;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/87f12e5c728d69a5322634776b54c75897d14daa/1/">https://practice.geeksforgeeks.org/problems/87f12e5c728d69a5322634776b54c75897d14daa/1/</a>
 **/
public class CountTriplets implements ISolution {

    private Node insert(Node head, int a) {
        if (head == null) {
            return new Node(a);
        }
        head.next = insert(head.next, a);
        return head;
    }

    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int[] a = Utility.getIntArray(scanner.nextLine(), "->");
        int X = Integer.parseInt(scanner.nextLine());
        Node head = null;
        for (int num : a) {
            if (head == null) {
                head = new Node(num);
            } else {
                insert(head, num);
            }
        }
        System.out.println(countTriplets(head, X));

    }

    public int countTriplets(Node head, int x) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.data);
            head = head.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        Arrays.sort(arr);
        int[] sumArray = Arrays.stream(arr).map(i -> x - i).toArray();
        int count = 0;
        for (int i = 0; i < sumArray.length; i++) {
            int targetSum = sumArray[i];
            for (int j = i + 1; j < arr.length - 1; j++) {
                int num1 = arr[j];
                int num2 = targetSum - num1;
                if (Arrays.binarySearch(arr, j + 1, arr.length, num2) >= 0) {
                    count++;
                }
            }
        }
        // target sum
        return count;
    }

    static class Node {
        int data;
        Node next;

        Node(int a) {
            this.data = a;
            next = null;
        }
    }
}