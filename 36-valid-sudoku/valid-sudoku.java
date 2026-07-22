class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] col_set = new HashSet[9];
        HashSet<Character>[] row_set = new HashSet[9];
        HashSet<Character>[] box_set = new HashSet[9];

        for(int k=0;k<9;k++){
            row_set[k] = new HashSet<>();        
            col_set[k] = new HashSet<>();
            box_set[k] = new HashSet<>();
        }

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]=='.'){
                    continue;
                }

                char num = board[row][col];
                int boxi =(row/3)*3 +(col/3);

                if(row_set[row].contains(num)||
                   col_set[col].contains(num)||
                   box_set[boxi].contains(num) ){
                    return false;
                }

                row_set[row].add(num);
                col_set[col].add(num);
                box_set[boxi].add(num); 

            }
        }
        return true;
    }
}