class Solution {

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                bfs(isConnected,i,visited);
            }
        }
        return count;
    }

    private void bfs(int[][] grid, int v, boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(v);

        while(!queue.isEmpty()){

            int u = queue.poll();
            visited[u] = true;
            for(int i = 0; i < grid.length; i++){
                if(grid[u][i] == 1 && !visited[i]){
                    queue.offer(i);
                }
            }
        }
    }
}