class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character>[] row= new HashSet[9];
        Set<Character>[] col= new HashSet[9];
        Set<Character>[] box= new HashSet[9];

        for(int i=0; i<9; i++){
            row[i]= new HashSet<>();
            col[i]= new HashSet<>();
            box[i]= new HashSet<>();
        }

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                char value = board[i][j];

                if(value=='.')
                    continue;

                int boxIndex = (i/3)*3 + (j/3);

                if(row[i].contains(value)||
                    col[j].contains(value)||
                    box[boxIndex].contains(value)){
                        return false;
                    }

                row[i].add(value);
                col[j].add(value);
                box[boxIndex].add(value);
            }

        }
        return true;
    }
}
