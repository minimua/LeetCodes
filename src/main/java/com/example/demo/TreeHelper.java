package com.example.demo;

public class TreeHelper {
    static int index;
    static String[] values;

    public TreeHelper(){}

    // 根据形如”1，2，#，4，5，#，7，#“的字符串建立二叉树，其中#代表该节点为空
    public void setValues(String treeValues) {
        values = treeValues.split(",");
        index = 0;

    }

    // 递归建立二叉树
    public TreeNode createTree() {
        TreeNode node = null;
        if(index < values.length){
            if (values[index].equals("#")) {
                index++;
                return null;
            }
            node = new TreeNode(Integer.parseInt(values[index]));
            index++;
            node.left = createTree();
            node.right = createTree();
        }
        return node;
    }
}
