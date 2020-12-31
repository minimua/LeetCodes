package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树后序遍历
 */
@SpringBootTest
public class PostorderTraversalTest {

    @Test
    void testPostorderTraversal(){
        String str = "[3,9,20,null,null,15,7]";
        TreeNode tree = TreeNode.mkTree(str);
        List<Integer> list = postorderTraversal(tree);
        System.out.println(list);


    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res){
        if(root != null){
            preorder(root.left, res);
            preorder(root.right, res);
            res.add(root.val);
        }
    }
}
