package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IsBalancedTest {

    @Test
    void testIsBalanced(){
        String str = "[1,2]";
        TreeNode treeNode = TreeNode.mkTree(str);
        int height = height(treeNode);
        System.out.println(height >= 0);

    }

    private int height(TreeNode root){
        if (root == null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if (left >= 0 && right >= 0 && Math.abs(left - right) <= 1){
            return Math.max(left,right) + 1;
        }else {
            return -1;
        }

    }
}
