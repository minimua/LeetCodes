package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 对称
 */
@SpringBootTest
public class IsSymmetricTest {

    @Test
    void testIsSymmetric(){
        String str = "[1,2,2,3,4,4,3]";
        TreeNode root = TreeNode.mkTree(str);
        boolean symmetric = isSymmetric(root.left, root.right);
        System.out.println(symmetric);
    }

    boolean isSymmetric(TreeNode left, TreeNode right){
        if (left == null && right == null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return (isSymmetric(left.left,right.right) && isSymmetric(left.right, right.left));

    }

}
