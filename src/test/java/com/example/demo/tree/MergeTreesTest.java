package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MergeTreesTest {

    @Test
    void testMergeTrees(){
        String str1 = "[1,3,2,5]";
        TreeNode treeNode1 = TreeNode.mkTree(str1);
        String str2 = "[2,1,3,null,4,null,7]";
        TreeNode treeNode2 = TreeNode.mkTree(str2);
        TreeNode treeNode = mergeTrees(treeNode1, treeNode2);

    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        int i = t1.val + t2.val;
        TreeNode treeNode = new TreeNode(i);
        treeNode.left = mergeTrees(t1.left,t2.left);
        treeNode.right = mergeTrees(t1.right,t2.right);
        return treeNode;
    }
}
