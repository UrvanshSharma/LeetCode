class Solution {

    boolean rowMap[][] = new boolean[9][9];
    boolean colMap[][] = new boolean[9][9];
    boolean boxMap[][] = new boolean[9][9];

    public void solveSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == '.') continue;

                int num = board[i][j] - '1';
                int b = (i / 3) * 3 + (j / 3);

                rowMap[i][num] = true;
                colMap[j][num] = true;
                boxMap[b][num] = true;
            }
        }

        helper(board);
    }

    boolean helper(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] != '.') continue;

                int b = (i / 3) * 3 + (j / 3);

                for (int k = 0; k < 9; k++) {
                    if (!rowMap[i][k] &&
                        !colMap[j][k] &&
                        !boxMap[b][k]) {

                        board[i][j] = (char) ('1' + k);

                        rowMap[i][k] = true;
                        colMap[j][k] = true;
                        boxMap[b][k] = true;

                        if (helper(board)) {
                            return true;
                        }

                        board[i][j] = '.';
                        rowMap[i][k] = false;
                        colMap[j][k] = false;
                        boxMap[b][k] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }
}