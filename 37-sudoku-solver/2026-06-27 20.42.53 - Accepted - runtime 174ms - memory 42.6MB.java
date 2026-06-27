class Solution {
    public void solveSudoku(char[][] board) {
        solver(board, 0, 0);
    }

    public boolean solver(char[][] board, int row, int col) {
        if (col == 9) {
            col = 0;
            row++;
        }
        if (row == 9) {
            return true;
        }
        if (board[row][col] != '.') {
            return solver(board, row, col + 1);
        } else {
            for (char val = '1'; val <= '9'; val++) {
                if (isSafe(board, row, col, val)) {
                    board[row][col] = val;
                    boolean ans = solver(board, row, col + 1);
                    if (ans) {
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, char val) {
        for (int c = 0; c < 9; c++) {
            if (board[row][c] == val) {
                return false;
            }
        }
        for (int r = 0; r < 9; r++) {
            if (board[r][col] == val) {
                return false;
            }
        }
        int startRow = row - row % 3;
        int startCol = col - col % 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == val) {
                    return false;
                }
            }
        }
        return true;
    }
}