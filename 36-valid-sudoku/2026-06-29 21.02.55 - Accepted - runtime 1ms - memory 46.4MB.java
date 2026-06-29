class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    board[i][j]='.';
                    if(!check(board,c,i,j)){
                        return false;
                    }
                    board[i][j]=c;
                }
            }
        }
        return true;
        
        
    }
    public boolean check(char[][] board, char v,int r,int c){
        for(int i=0;i<9;i++){
            if(board[r][i]==v){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(board[i][c]==v){
                return false;
            }
        }
        int row= r-r%3;
        int col=c-c%3;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                if(board[i][j]==v){
                    return false;
                }
            }
        }
        return true;
    }
}