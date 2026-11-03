class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            adj[u].add(v);
            adj[v].add(u);
        }

        boolean[] visited = new boolean[n];

        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while (!q.isEmpty()) {

            int curr = q.poll();

            if (curr == destination) {
                return true;
            }

            for (int neighbour : adj[curr]) {

                if (!visited[neighbour]) {
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;
    }
}