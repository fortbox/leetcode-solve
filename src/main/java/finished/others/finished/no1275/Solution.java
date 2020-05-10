/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.others.finished.no1275;

class Solution {
    public String tictactoe(int[][] moves) {
        // Draw,Pending,A,B
        int[][] play = new int[3][3];
        for (int i = 0; i < moves.length; i++) {
            if (i % 2 == 0) {
                play[moves[i][0]][moves[i][1]] = 1;
            } else {
                play[moves[i][0]][moves[i][1]] = 2;
            }
            int type = checkOver(play);
            if (type == 1) {
                return "A";
            } else if (type == 2) {
                return "B";
            }
        }
        return isAllVisited(play);
    }

    private String isAllVisited(int[][] play) {
        for (int i = 0; i < play.length; i++) {
            for (int j = 0; j < play[0].length; j++) {
                if (play[i][j] == 0) return "Pending";
            }
        }
        return "Draw";

    }

    private int checkOver(int[][] play) {
        int type = -1;
        int a, b, c;
        for (int i = 0; i < play.length; i++) {
            a = play[i][0];
            b = play[i][1];
            c = play[i][2];
            if (a == 1 && a == b && a == c) return 1;
            if (a == 2 && a == b && a == c) return 2;
            a = play[0][i];
            b = play[1][i];
            c = play[2][i];
            if (a == 1 && a == b && a == c) return 1;
            if (a == 2 && a == b && a == c) return 2;
        }
        a = play[0][0];
        b = play[1][1];
        c = play[2][2];
        if (a == 1 && a == b && a == c) return 1;
        if (a == 2 && a == b && a == c) return 2;
        a = play[0][2];
        b = play[1][1];
        c = play[2][0];
        if (a == 1 && a == b && a == c) return 1;
        if (a == 2 && a == b && a == c) return 2;
        return -1;
    }
}
