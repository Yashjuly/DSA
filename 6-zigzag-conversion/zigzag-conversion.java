class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;

        StringBuilder[] row = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            row[i] = new StringBuilder();
        }
        int currentRow = 0;
        int direction = 1; // 1 = down, -1 = up
        for (int i = 0; i < s.length(); i++) {
            row[currentRow].append(s.charAt(i));

            if (currentRow == 0)
                direction = 1;
            else if (currentRow == numRows - 1)
                direction = -1;

            currentRow += direction;
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            ans.append(row[i]);
        }
        
        return ans.toString();
    }
}