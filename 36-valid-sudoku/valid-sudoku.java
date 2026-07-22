import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<Character>[] row_set = new HashSet[9];
        HashSet<Character>[] col_set = new HashSet[9];
        HashSet<Character>[] mat_set = new HashSet[9];

        // Initialize all sets
        for (int i = 0; i < 9; i++) {
            row_set[i] = new HashSet<>();
            col_set[i] = new HashSet<>();
            mat_set[i] = new HashSet<>();
        }

        // Traverse the board
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                if (board[row][col] == '.') {
                    continue;
                }

                char num = board[row][col];

                // Find the 3x3 box number
                int box = (row / 3) * 3 + (col / 3);

                if (row_set[row].contains(num) ||
                    col_set[col].contains(num) ||
                    mat_set[box].contains(num)) {
                    return false;
                }

                row_set[row].add(num);
                col_set[col].add(num);
                mat_set[box].add(num);
            }
        }

        return true;
    }
}