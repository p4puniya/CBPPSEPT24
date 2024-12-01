package Lecture18;

public class RatInAMaze {
    static int[][] ans= new int[100][100];
    static int count=1;

    static int[][] miniPath= new int[100][100];
    static int mini=Integer.MAX_VALUE;

    static void display(int[][]arr, int x,int y){

        for(int i=0;i<=x;i++){
            for(int j= 0; j<=y; j++)
                System.out.print(arr[i][j]+"      ");
            System.out.println();
            System.out.println();
        }
    }

    static void copyPath(int x, int y){
        mini= count;
        for(int i=0;i<=x;i++){
            for(int j= 0; j<=y; j++)
                miniPath[i][j]= ans[i][j];
        }
    }
    static boolean findCheeze(int[][] maze, int i, int j, int x, int y){
        if(i==x && j==y){
            ans[i][j]= count;
            if(count<mini)
                copyPath(maze.length, maze[0].length);
            // display(maze.length-1,maze[0].length-1);
            // System.out.println();
            // System.out.println();
            return false;
        }
        // Mark the curr loc

        if(i>=0 && j >= 0 && i<maze.length && j<maze[0].length && maze[i][j]==0 && ans[i][j]==0){
                
            ans[i][j]=count++;
            //move down
            if(findCheeze(maze, i+1, j, x, y))
                return true;
            //move right
            if(findCheeze(maze, i, j+1, x, y))
                return true;
            //Move left
            if(findCheeze(maze, i, j-1, x, y))
                return true;
            // Move up
            if(findCheeze(maze, i-1, j, x, y))
                return true;
            
            ans[i][j]=0; //backtracking
            count--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] maze= {
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,1,0,1},
            {0,0,0,0,0}
        };
        int x=0,y=0; //pos of cheeze
        int i=3,j=4; //pos of mouse
        findCheeze(maze, i, j, x, y);

        display(miniPath, maze.length-1,maze[0].length-1);
    }
}
