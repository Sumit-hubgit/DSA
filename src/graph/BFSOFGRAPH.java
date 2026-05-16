package graph;

import java.util.*;

public class BFSOFGRAPH {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // Number of vertices and edges
        int ve = inp.nextInt();
        int e = inp.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();

        // Reading edges
        for (int i = 0; i < e; i++) {
            int u = inp.nextInt();
            int v = inp.nextInt();

            ArrayList<Integer> edge = new ArrayList<>();
            edge.add(u);
            edge.add(v);
            edges.add(edge);
        }

        bfsTraversal(ve, edges);
        inp.close();
    }

    public static void bfsTraversal(int vertices, ArrayList<ArrayList<Integer>> edges) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }

        // Populate adjacency list
        for (ArrayList<Integer> edge : edges) {
            int u = edge.get(0);
            int v = edge.get(1);

            adjList.get(u).add(v);
            adjList.get(v).add(u); // Undirected graph
        }

        // Sort neighbors to ensure BFS traversal in sorted order
        for (int i = 0; i < vertices; i++) {
            Collections.sort(adjList.get(i));
        }

        // Visited array to track visited nodes
        boolean[] visited = new boolean[vertices];
        ArrayList<Integer> bfsResult = new ArrayList<>();

        // BFS for all components
        for (int start = 0; start < vertices; start++) {
            if (!visited[start]) {
                bfs(start, adjList, visited, bfsResult);
            }
        }

        // Print the BFS result
        System.out.println(bfsResult);
    }

    public static void bfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            result.add(currNode);

            for (int neighbor : adjList.get(currNode)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
