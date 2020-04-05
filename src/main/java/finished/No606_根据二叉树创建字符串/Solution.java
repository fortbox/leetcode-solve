/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.No606_根据二叉树创建字符串;


import java.util.Stack;

class Solution {
    public String tree2str(TreeNode t) {
        StringBuilder builder = new StringBuilder();
        if(t == null){
            return builder.toString();
        }
        Stack<Object> stack = new Stack<Object>();
        //根节点入栈
        stack.push(t);
        while(!stack.empty()){
            //栈中包含TreeNode类型的二叉树节点，也包含String类型的括号
            Object temp = stack.pop();
            //判断是否为TreeNode类型
            if(temp instanceof TreeNode){
                TreeNode node = (TreeNode) temp;
                builder.append(node.val);
                //如果该节点左右节点都为空，则不执行任何代码，否则，执行以下代码
                if(node.left != null || node.right != null){
                    if(node.right != null){
                        stack.push(")");
                        stack.push(node.right);
                        stack.push("(");
                    }
                    if(node.left != null){
                        stack.push(")");
                        stack.push(node.left);
                        stack.push("(");
                    }else{
                        stack.push(")");
                        stack.push("(");
                    }

                }
            }
            //判断是否为String类型
            if(temp instanceof String){
                //String类型直接拼接到builder
                builder.append((String) temp);
            }
        }
        return builder.toString();

    }




    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
