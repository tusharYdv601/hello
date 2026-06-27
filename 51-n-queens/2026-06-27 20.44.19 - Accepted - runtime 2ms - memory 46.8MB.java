class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] c = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = '.';
            }

        }
        List<List<String>> result = new ArrayList<>();

        queen(c, n, 0, result);
        return result;

    }

    private static List<String> constructBoard(char[][] board) {
        List<String> currentBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            currentBoard.add(new String(board[i]));
        }
        return currentBoard;
    }

    public static void queen(char[][] board, int tq, int r, List<List<String>> result) {
        if (tq == 0) {
            result.add(constructBoard(board));
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (isSafe(board, r, i)) {
                board[r][i] = 'Q';
                queen(board, tq - 1, r + 1, result);
                board[r][i] = '.';
            }
        }
    }

    public static boolean isSafe(char[][] board, int r, int c) {
        for (int i = r; i >= 0; i--) {
            if (board[i][c] == 'Q') {
                return false;
            }
        }
        int row = r;
        int col = c;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }
        row = r;
        col = c;
        while (row >= 0 && col < board[0].length) {
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}