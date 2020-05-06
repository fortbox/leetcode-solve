/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished;

import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        char[] array = s.toCharArray();
        for (char c : array) {
            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '(') return false;
            } else if (c == '[') {
                stack.add(c);
            } else if (c == ']') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '[') return false;
            } else if (c == '{') {
                stack.add(c);
            } else if (c == '}') {
                if (stack.isEmpty()) return false;
                if (stack.pop() != '{') return false;
            }
        }
        return stack.isEmpty();
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(list, root);
        return list;
    }

    private void dfs(ArrayList<Integer> list, TreeNode root) {
        if (root == null) return;
        dfs(list, root.left);
        list.add(root.val);
        dfs(list, root.right);


    }

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int height = image.length;
        int width = image[0].length;
        boolean[][] visited = new boolean[height][width];
        int origin = image[sr][sc];
        final int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        // bfs
        Queue<Axis> queue = new LinkedList<>();
        queue.add(new Axis(sr, sc));
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Axis axis = queue.poll();
                if (image[axis.x][axis.y] == origin) image[axis.x][axis.y] = newColor;
                visited[axis.x][axis.y] = true;
                int x = axis.x;
                int y = axis.y;
                // insert director
                if (x - 1 >= 0 && !visited[x - 1][y]) {
                    queue.add(new Axis(x - 1, y));
                }
                if (x + 1 < height && !visited[x + 1][y]) {
                    queue.add(new Axis(x + 1, y));
                }
                if (y - 1 >= 0 && !visited[x][y - 1]) {
                    queue.add(new Axis(x, y - 1));
                }
                if (y + 1 < width && !visited[x][y + 1]) {
                    queue.add(new Axis(x, y + 1));
                }
            }
        }
        return image;
    }

    public int[][] updateMatrix(int[][] matrix) {
        Queue<int[]> queue = new LinkedList<>();
        // 对每个点bfs
        final int[][] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    queue.add(new int[]{i, j});
                } else {
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] axis = queue.poll();
                int x = axis[0];
                int y = axis[1];
                for (int[] ints : direction) {
                    int a = ints[0] + x;
                    int b = ints[1] + y;
                    if (a >= 0 && a < matrix.length && b >= 0 && b < matrix[0].length) {
                        if (matrix[a][b] > matrix[x][y] + 1) {
                            matrix[a][b] = matrix[x][y] + 1;
                            queue.add(new int[]{a, b});
                        }
                    }
                }
            }
        }
        return matrix;
    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int size = rooms.size();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        return myDfs(list, rooms, 0, size);
    }

    private boolean myDfs(ArrayList<Integer> list, List<List<Integer>> rooms, int index, int size) {
        if (list.size() == size) return true;
        List<Integer> ll = rooms.get(index);
        // ll.forEach(nn-> System.out.println("n1 = " + nn));
//        list.forEach(nn-> System.out.println("n2 = " + nn));
        for (int i = 0; i < ll.size(); i++) {
            int n = ll.get(i);
//            System.out.println("n = " + n);
            if (!list.contains(n)) {
                list.add(n);
                boolean f = myDfs(list, rooms, n, size);
                if (f) return true;
            }
        }
        return false;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    class Axis {
        int x;
        int y;

        Axis(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
