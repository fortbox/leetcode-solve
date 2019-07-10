package finished.No257_二叉树的所有路径;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new ArrayList<String>();
		if (root == null) {
			return new ArrayList<String>();
		}
		StringBuilder sb = new StringBuilder();
		sb.append(root.val);
		System.out.println("root.val:" + root.val);
		List<String> lleft = binaryTreePaths(root.left);
		System.out.println("lleft.size()" + lleft.size());
		List<String> lright = binaryTreePaths(root.right);
		System.out.println("lright.size()" + lright.size());
		if (lleft.size() == 0&&lright.size()==0) {
			if (!list.contains(sb.toString())) {
				list.add(sb.toString());
				System.out.println("list------"+list.toString());
			}
		} else {
			for (String string : lleft) {
				list.remove(sb.toString());
				System.out.println("lleft" + sb.toString() + "->" + string);
				if (!list.contains(sb.toString() + "->" + string)) {
					list.add(sb.toString() + "->" + string);
					System.out.println("list------"+list.toString());
				}
			}
		}
		if (lleft.size() == 0&&lright.size()==0) {
			if (!list.contains(sb.toString())) {
				list.add(sb.toString());
				System.out.println("list------"+list.toString());
			}
		} else {
			for (String string : lright) {
				list.remove(sb.toString());
				System.out.println("lright:" + sb.toString() + "->" + string);
				if (!list.contains(sb.toString() + "->" + string)) {
					list.add(sb.toString() + "->" + string);
					System.out.println("list------"+list.toString());
				}
			}
		}
		return list;
	}
	
	/**
	 * 新的方法
	 * @param root
	 * @return
	 */
	public List<String> binaryTreePaths_new(TreeNode root) {
		if (root==null) {
			return new ArrayList<>();
		}
		List<String> list =new ArrayList<>();
		String s=new String();
		dfs(root,list,s);
		return list;
	}
	
	public void dfs(TreeNode root,List<String> list,String s) {
		if (root.left==null&&root.right==null) {
			System.out.println("s----------"+s);
			s=s+root.val;
			list.add(s);
		}
		if (root.left!=null) {
			dfs(root.left,list,s+root.val+"->");
		}
		if (root.right!=null) {
			dfs(root.right,list,s+root.val+"->");
		}
	}
	
	

}
