class Solution {
    public int totalNQueens(int n) {
        int [][] board =new int [n][n];
        return quees(board,n,0);
        
    }
    public int quees(int[][] board,int tq,int r){
        if(tq==0){
            return 1;
        }
        int count=0;
        for(int i=0;i<board.length;i++ ){
            if(isSafe(board,r,i)){
                board[r][i]=1;
                count+=quees(board,tq-1,r+1);
                board[r][i]=0;
            }
        }
        return count;
    }
    public boolean isSafe(int [][] board,int r,int c){
        for(int i=r;i>=0;i--){
            if(board[i][c]==1){
                return false;
            }
        }
        int row=r;
        int col=c;
        while(row>=0&&col>=0){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col--;
        }
        row=r;
        col=c;
        while(row>=0&&col<board.length){
            if(board[row][col]==1){
                return false;
            }
            row--;
            col++;
        }
        return true;
    }
}