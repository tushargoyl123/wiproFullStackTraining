package task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DirectedGraph {

	private Map<Integer, List<Integer>> adjacencyList;
	public DirectedGraph() {
		adjacencyList = new HashMap<>();
	}
	public void addNode(int node) {
		adjacencyList.putIfAbsent(node, new ArrayList<>());
	}
	public boolean addEdge(int from, int to) {
		addNode(from);
		addNode(to);
		adjacencyList.get(from).add(to);
		if(hasCycle()) {
			adjacencyList.get(from).remove((Integer) to);
			return false;
		}
		return true;
	}
	private boolean hasCycle() {
		Set<Integer> visited = new HashSet<Integer>();
		Set<Integer> recStack = new HashSet<Integer>();
		for(Integer node: adjacencyList.keySet()) {
			if(dfs(node,visited,recStack)) {
				return true;
			}
		}
		return false;
		
	}
	private boolean dfs(int node, Set<Integer> visited,Set<Integer> recStack) {
		if(recStack.contains(node)) {
			return true;
		}
		if(visited.contains(node)) {
			return false;
		}
		visited.add(node);
		recStack.add(node);
		for(Integer neighbour: adjacencyList.get(node)) {
			if(dfs(neighbour, visited, recStack)) {
				return true;
			}
		}
		recStack.remove(node);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectedGraph graph = new DirectedGraph();
		graph.addNode(1);
		graph.addNode(2);
		graph.addNode(3);
		
		System.out.println(graph.addEdge(1, 2));
		System.out.println(graph.addEdge(2, 3));
		System.out.println(graph.addEdge(3, 1));

		System.out.println(graph.addEdge(1, 3));
		System.out.println(graph.addEdge(3, 2));
		System.out.println(graph.addEdge(2, 1));
		
	}

}
