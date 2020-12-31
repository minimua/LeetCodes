package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 二叉树深度
 */
@SpringBootTest
public class MaxDepthTest {

    @Test
    void testMaxDepth(){
        String str = "[3,9,20,null,null,15,7]";
        TreeNode tree = TreeNode.mkTree(str);
        int i = maxDepth(tree);
        System.out.println(i);
    }

    private int maxDepth(TreeNode root){
        if (root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right) + 1;
    }


}
