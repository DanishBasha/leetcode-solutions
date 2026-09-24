class Solution {
    int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    Queue<int[]> q = new LinkedList<>();
    int m;
    int n;
    private void BFS(char [][] grid, int row ,int col){
        q.offer(new int[]{row,col});
        grid[row][col] = '0';
        while(!q.isEmpty()){
            int []curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for (int []dis:dir){
                int nr = r+dis[0];
                int nc = c+dis[1];
                if (nr<m && nr>=0 && nc < n && nc >=0 && grid[nr][nc] != '0'){
                    grid[nr][nc] = '0';
                    q.offer(new int[]{nr,nc});
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count = 0;
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                   count++;
                   BFS(grid,i,j);
                }
            }
        }
        return count;
    }
}