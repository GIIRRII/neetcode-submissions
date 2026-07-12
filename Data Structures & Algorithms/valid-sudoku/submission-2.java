class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(int i = 0;i<9;i++ ){
            Set<Character> uniqueElement  = new HashSet<>(); 
            for (int j=0; j<9;j++){
                 if( board[i][j] != '.'  && !uniqueElement.add(board[i][j]))
                 {
                    return false;
                 }
            }

            uniqueElement  = new HashSet<>(); 
            for (int j=0; j<9;j++){
                 if( board[j][i] != '.'  && !uniqueElement.add(board[j][i]))
                 {
                    return false;
                 }
            }
        }

        int row = 0, col = 0;
        while(row<9){
        while(col<9){
        Set<Character> uniqueElement  = new HashSet<>();
        for(int i = 0; i<3; i++){
            for(int j=0;j<3;j++){
                if( board[i+row][j+col] != '.'  && !uniqueElement.add(board[i+row][j+col]))
                 {return false;}
            }
        }
        col=col+3;
        }
        row=row+3;col=0; 
        }

        return true;
        
    }
}
