package competitive.programming.practice.platform.geeksforgeeks.problem0018;

import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.tree.Node;

import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/0f02fb492c69c094d94e806cba6ff8d8cd04d630/1/?">https://practice.geeksforgeeks.org/problems/0f02fb492c69c094d94e806cba6ff8d8cd04d630/1/?</a> 
*
**/
public class ValentineSum implements ISolution {



    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner =new Scanner(in);
        String line = scanner.nextLine();
        Node root = Node.gfgBuildTree(line);
        int target = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(sumAtDistK(root, target, K));
    }

    public int sumAtDistK(Node root, int target, int K){
        // Traverse tree and build map
        HashMap<Node, Node> parentMap = new HashMap<>();
        parentMap.put(root, null);
        buildParentMap(root, parentMap);

        // find target node

        Node targetNode = findTargetNode(root, target);
        int sum = targetNode.data;
        Set<Node> processedSet = new HashSet<>();
        Queue<Node> processingQueue = new LinkedList<>();
        processedSet.add(targetNode);
        processingQueue.add(targetNode);
        for (int i=1;i<=K;i++) {
            int size =  processingQueue.size();
            for (int j=0;j < size;j++) {
                Node node = processingQueue.poll();
                if (node != null) {
                    Node left = node.left;
                    Node right = node.right;
                    Node parent = parentMap.get(node);
                    if (left != null && !processedSet.contains(left)) {
                        processingQueue.add(left);
                        processedSet.add(left);
                        sum+=left.data;
                    }
                    if (right!= null && !processedSet.contains(right)) {
                        processingQueue.add(right);
                        processedSet.add(right);
                        sum+=right.data;
                    }
                    if (parent!= null && !processedSet.contains(parent)) {
                        processingQueue.add(parent);
                        processedSet.add(parent);
                        sum+=parent.data;
                    }
                }
            }
        }
        return sum;
    }

    private Node findTargetNode(Node node, int target) {
        if (node == null) {
            return null;
        }
        if (node.data == target) {
            return node;
        } else {
            Node left = findTargetNode(node.left, target);
            Node right = findTargetNode(node.right, target);
            return Optional.ofNullable(left).orElse(right);
        }
    }

    private void buildParentMap(Node node, HashMap<Node, Node> parentMap) {
        if (node == null) {
            return;
        }
        if (node.left != null) {
            parentMap.put(node.left , node);
            buildParentMap(node.left, parentMap);
        }
        if (node.right != null) {
            parentMap.put(node.right, node);
            buildParentMap(node.right, parentMap);
        }
    }
}

