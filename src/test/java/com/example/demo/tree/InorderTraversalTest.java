package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 */
@SpringBootTest
public class InorderTraversalTest {

    @Test
    void testInorderTraversal(){
        String str = "[3,9,20,null,null,15,7]";
        TreeNode tree = TreeNode.mkTree(str);
        System.out.println(tree);
        List<Integer> list = inorderTraversal(tree);
        System.out.println(list);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res){
        if(root != null){
            preorder(root.left, res);
            res.add(root.val);
            preorder(root.right, res);
        }
    }

}
