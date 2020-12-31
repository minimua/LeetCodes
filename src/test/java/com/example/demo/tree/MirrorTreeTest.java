package com.example.demo.tree;

import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MirrorTreeTest {
    @Test
    void testMirrorTree(){
        String str1 = "[4,2,7,1,3,6,9]";
        TreeNode treeNode1 = TreeNode.mkTree(str1);
        TreeNode res = mirrorTree(treeNode1);
        System.out.println(res);

    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(tmp);
        return root;
    }
}
