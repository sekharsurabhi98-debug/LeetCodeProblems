class Solution {

    void dfs(int[][] graph, boolean[] visited, int v){

        Stack<Integer> stack = new Stack();
        stack.push(v);

        while(!stack.isEmpty()){

            int u = stack.pop();
    
                visited[u] = true;
                for(int i = 0; i < graph.length; i++){
                    if(graph[u][i] == 1 && !visited[i]){
                        stack.push(i);
                    }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int v = 0; v < n; v++){

            if(!visited[v]){

                dfs(isConnected, visited, v);
                count++;

            }
        }
        return count;
    }
}