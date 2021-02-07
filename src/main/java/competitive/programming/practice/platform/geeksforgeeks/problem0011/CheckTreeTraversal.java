package competitive.programming.practice.platform.geeksforgeeks.problem0011;

import competitive.programming.annotation.Entry;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.tree.Node;
import competitive.programming.practice.common.utils.Utility;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Saurabh Dutta(saurabh73)
 * @see <a href="https://practice.geeksforgeeks.org/problems/cb02d40f50b0113c47cd9036e5f340bb51b32289/1/">https://practice.geeksforgeeks.org/problems/cb02d40f50b0113c47cd9036e5f340bb51b32289/1/</a>
 **/
public class CheckTreeTraversal implements ISolution {
    private int preIndex = 0;

    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] preorder = Utility.getIntArray(scanner.nextLine(), ",");
        int[] inorder = Utility.getIntArray(scanner.nextLine(), ",");
        int[] postorder = Utility.getIntArray(scanner.nextLine(), ",");
        System.out.println(checktree(preorder, inorder, postorder, N) ? "YES" : "NO");
    }

    @Entry
    public boolean checktree(int preorder[], int inorder[], int postorder[], int N) {
        try {
            Node tree = buildTree(preorder,inorder, 0, N-1);
            StringBuilder postorderString = new StringBuilder();
            postOrderTraversal(tree, postorderString);
            int[] constructedPostorder = Utility.getIntArray(postorderString.toString(), ",");
            return Arrays.equals(postorder, constructedPostorder);
        } catch (Exception ex) {
            return false;
        }
    }

    private void postOrderTraversal(Node node, StringBuilder ans) {
        if (node == null) {
            return;
        }
        postOrderTraversal(node.left, ans);
        postOrderTraversal(node.right, ans);
        ans.append(node.value).append(",");
    }

    private Node buildTree(int[] preorder, int[] inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        Node node = new Node(preorder[preIndex++]);
        if (start == end) {
            return node;
        }
        //
        int index = searchIndex(inorder, start, end, node.value);
        node.left = buildTree(preorder, inorder, start, index - 1);
        node.right = buildTree(preorder, inorder, index + 1, end);
        return node;
    }

    private int searchIndex(int[] inorder, int start, int end, int value) {
        for (int i = start; i<= end; i++) {
            if (value == inorder[i]) {
                return i;
            }
        }
        return -1;
    }
}