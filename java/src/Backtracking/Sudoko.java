package Backtracking;

public class Sudoko {
    public static void main(String[] args) {
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
       if(solver(board)){
           display(board);
       }else{
           System.out.println("cannot solve the board");
       }
    }

    private static void display(int[][] board) {
        for(int[] row: board){
            for(int num: row){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    public static boolean solver(int[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyleft = true;
        // this is how we are replacing the r,c from arguments
        for(int i = 0; i < n; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    emptyleft = false;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if(emptyleft == false){
                break;
            }
        }
        if(emptyleft == true){
             return true;
             // sudoko is solved
        }

        for(int num = 1; num<= 9; num++){
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                if(solver(board)){
                    //found the ans
                    return true;
                }else{
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }
    public static boolean isSafe(int[][] board,int row, int col, int num){
        //checking for num is in the row.
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num){
                return false;
            }
        }
        //checking for num is in the col.
        for(int i = 0; i < board.length; i++){
            if(board[i][col] == num){
                return false;
            }
        }
        //checking for num is in the row X col matrix.
        int sq = (int)(Math.sqrt(board.length));
        int rowStart = row - row % sq;
        int colStart = col - col % sq;
        for(int r = rowStart; r < rowStart + sq; r++){
            for(int c = colStart ; c < colStart + sq; c++){
                if(board[r][c] == num){
                    return false;
                }
            }
        }
        return true;

    }
}
