package Lecture19;

public class NQueens {
    static int[][] board;
    //display
    static void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }
    }
    //Recursive Code
    static boolean nQueens(int[][] board, int i, int n){
        if(i==n){
            //display
            display(board);
            System.out.println();
            return false;
        }

        for(int j=0;j<n;j++){
            if(check(board, i, j, n)){
                board[i][j]=1;
                if(nQueens(board, i+1, n))
                    return true;
                //backtrack
                board[i][j]=0;
            }
        }
        return false;
    }
    //Check Safe
    static boolean check(int[][] board, int i, int j, int n){
        //col
        for(int k=0;k<i;k++)
            if(board[k][j]==1)
                return false;
        //left diagonal
        int x=i-1, y=j-1;
        while(x>=0 && y>=0){
            if(board[x--][y--]==1)
                return false;
        }
        //Right diagonal
        x=i-1; y=j+1;
        while(x>=0 && y<n){
            if(board[x--][y++]==1)
                return false;
        }
        return true;
    }

    //Main Function
    public static void main(String[] args) {
        int n=5;
        board= new int[n][n];

        nQueens(board, 0,n);
    }
}
