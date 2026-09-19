class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> rows = new HashSet<>();
        Set<Character> columns = new HashSet<>();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j] != '.'){
                    if(!rows.add(board[i][j])){
                        System.out.println("rows - "+i+","+j);
                        return false;
                    }
                }
                if(board[j][i] != '.'){
                    if(!columns.add(board[j][i])){
                        System.out.println("Columns - "+j+","+i);
                        return false;
                    }
                }
            }
            rows.clear();
            columns.clear();
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seen.contains(board[row][col])) return false;
                    seen.add(board[row][col]);
                }
            }
        }
        System.out.println(board.length);
        return true;
        
    }
}
