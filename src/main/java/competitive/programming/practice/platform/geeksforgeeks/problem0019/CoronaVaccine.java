package competitive.programming.practice.platform.geeksforgeeks.problem0019;
import competitive.programming.practice.base.ISolution;
import competitive.programming.practice.common.tree.Node;

import java.io.InputStream;
import java.util.Scanner;

/**
*
* @author Saurabh Dutta(saurabh73)
*
* @see <a href="https://practice.geeksforgeeks.org/problems/d1afdbd3d49e4e7e6f9d738606cd592f63e6b0f0/1/">https://practice.geeksforgeeks.org/problems/d1afdbd3d49e4e7e6f9d738606cd592f63e6b0f0/1/</a> 
*
**/
public class CoronaVaccine implements ISolution {
    @Override
    public void solve(InputStream in) throws Exception {
        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine();
        Node root = Node.gfgBuildTree(line);
        System.out.println(supplyVaccine(root));
    }

    public int supplyVaccine(Node root){
        return 0;
    }
}