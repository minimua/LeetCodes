package com.example.demo.tree;

import com.example.demo.TreeHelper;
import com.example.demo.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class LevelOrderTest {

    @Test
    void testLevelOrder(){
        List<List<Integer>> lists = new ArrayList<>();
        String str = "3,9,20,#,#,15,7";
        TreeHelper treeHelper = new TreeHelper();
        treeHelper.setValues(str);
        TreeNode tree = treeHelper.createTree();

        if (tree == null) System.out.println("null");
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(tree);}};

    }

}
