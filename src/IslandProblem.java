import java.util.Stack;

public class IslandProblem {

    public int numIslands(char[][] grid) {

        int rows = grid.length; int cols = grid[0].length;
        int count = 0;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {
                    explore(i,j,rows,cols,grid);
                    count++;
                }

            }
        }

        return count;
    }

    public void addNeighbors(int i, int j,int rows,int cols,Stack<int[]> stk) {

        if(i + 1 < rows) {
            stk.push(new int[]{i+1, j});
        }
        if(i - 1 >= 0) {
            stk.push(new int[]{i-1,j});
        }
        if(j + 1 < cols) {
            stk.push(new int[]{i,j+1});
        }
        if(j - 1 >= 0) {
            stk.push(new int[]{i,j-1});
        }

    }
    public void explore(int r, int c, int rows, int cols, char[][] arr) {
        arr[r][c] = 'v';
        Stack<int[]> stk = new Stack<>();
        addNeighbors(r,c,rows,cols,stk);
        while(!stk.isEmpty()){
            int[] coord = stk.pop();
            int i = coord[0];
            int j = coord[1];
            if(arr[i][j] == '1') {
                arr[i][j] ='v';
                addNeighbors(i,j,rows,cols,stk);

            }

        }

    }
}
