class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       if (sr == 0 && sc == 0 && color == 0) return image;
       int [][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
       int m = image.length;
       int n = image[0].length;
       int startValue = image[sr][sc];
       if (startValue == color) return image;
       Queue<int[]> q = new LinkedList<>();
       q.offer(new int[]{sr,sc});
       image[sr][sc] = color;
       while(!q.isEmpty()){
        int [] curr = q.poll();
        int r = curr[0];
        int c = curr[1];
        for(int []dis : dir){
            int nr = r+dis[0];
            int nc = c+dis[1];
            if (nr < m && nr>=0 && nc<n&& nc >=0 && image[nr][nc] == startValue){
                image[nr][nc] = color;
                q.offer(new int[]{nr,nc});
            }
        }
       }
       return image;
    }
}