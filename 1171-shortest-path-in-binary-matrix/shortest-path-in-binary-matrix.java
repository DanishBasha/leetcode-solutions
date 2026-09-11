class Solution {
    private int [][] dir = {{-1,0},{-1,-1},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        } 
        Queue<int []> queue = new LinkedList<>();
        queue.offer(new int []{0,0,1});
        grid[0][0] = 1;
        while(!queue.isEmpty()){
          int [] curr = queue.poll();
          int newR = curr[0];
          int newC = curr[1];
          int distance = curr[2];
          if (newR == n-1 && newC == n-1){
            return distance;
          }
          for(int [] dist : dir){
            int currR = dist[0]+newR;
            int currC = dist[1]+newC;
            if (currR >= 0 && currR <n && currC >= 0 && currC <n && grid[currR][currC] == 0){
                grid[currR][currC] = 1;
                queue.offer(new int[]{currR,currC,distance+1});
            }
          }
        }
        return -1;
    }
}