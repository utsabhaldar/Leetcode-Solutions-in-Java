// 847. Shortest Path Visiting All Nodes

// You have an undirected, connected graph of n nodes labeled from 0 to n - 1. 
// You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.
// Return the length of the shortest path that visits every node. You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.
// Example 1:
// Input: graph = [[1,2,3],[0],[0],[0]]
// Output: 4
// Explanation: One possible path is [1,0,2,0,3]
// Example 2:
// Input: graph = [[1],[0,2,4],[1,3,4],[2],[1,2]]
// Output: 4
// Explanation: One possible path is [0,1,4,2,3]
// Constraints:
// n == graph.length
// 1 <= n <= 12
// 0 <= graph[i].length < n
// graph[i] does not contain i.
// If graph[a] contains b, then graph[b] contains a.
// The input graph is always connected.



// Optimal Approach
import java.util.PriorityQueue;

public class Q847_shortest_path_visiting_all_nodes {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int minLen = Integer.MAX_VALUE;
        
        for (int i = 0; i < graph.length; i++) {
            
            int[] visited = new int[n];
            getLen(graph, visited, i);
            if(!isValid(visited)) continue;
            minLen = Math.min(calLen(visited), minLen);
        }

        return minLen != Integer.MIN_VALUE ? minLen : -1;
    }
    
    private int calLen(int[] visited) {
        int len = 0;
        for(int curr : visited) {
            len+=curr;
        }
        return len - 1;
    }

    private boolean isValid(int[] visited) {
        for(int curr : visited) {
            if(curr == 0) return false;
        }
        return true;
    }

    private void getLen(int[][] graph, int[] visited, int index) {
        visited[index]++;
        if(isValid(visited)) return;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> graph[a].length -
                graph[b].length);
        for (int i = 0; i < graph[index].length; i++) {
            queue.add(graph[index][i]);
        }

        while(!queue.isEmpty()) {
            int curr = queue.poll();
            if(queue.size() > 0 && visited[curr] > 0) {
                continue;
            }
            if(!isValid(visited) && visited[curr] < graph[curr].length) {
                getLen(graph, visited, curr);
            }
        }
    }
}
