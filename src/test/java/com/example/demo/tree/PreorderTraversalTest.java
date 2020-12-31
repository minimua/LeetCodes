package com.example.demo.tree;
import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树前序遍历
 */
@SpringBootTest
public class PreorderTraversalTest {
    @Test
    void preorderTraversalTest(){
        String str = "[3,9,20,null,null,15,7]";
        TreeNode tree = TreeNode.mkTree(str);
        System.out.println(tree);
        List<Integer> list = preorderTraversal(tree);
        System.out.println(list);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res){
        if(root != null){
            res.add(root.val);
            preorder(root.left, res);
            preorder(root.right, res);
        }
    }




}
