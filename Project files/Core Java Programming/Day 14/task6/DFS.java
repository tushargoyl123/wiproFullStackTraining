package task6;

import java.util.*;

public class DFS {
	private Map<Integer, List<Integer>> adjacencyList;
	public DFS() {
		adjacencyList = new HashMap<>();
	}
	public void addEdge(int node1, int node2) {
		adjacencyList.putIfAbsent(node1, new ArrayList<Integer>());
		adjacencyList.putIfAbsent(node2, new ArrayList<Integer>());
		adjacencyList.get(node1).add(node2);
		adjacencyList.get(node2).add(node1);
	}
	public void dfs(int startNode) {
		Set<Integer> visited = new HashSet<Integer>();
		dfsHelper(startNode, visited);
	}
	public void dfsHelper(int node, Set<Integer> visited) {
		visited.add(node);
		System.out.print(node+" ");
		List<Integer> neighbours = adjacencyList.get(node);
		if(neighbours!=null) {
			for(int neighbour : neighbours) {
				if(!visited.contains(neighbour)) {
					dfsHelper(neighbour, visited);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS graph = new DFS();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		graph.dfs(2);

	}

}
