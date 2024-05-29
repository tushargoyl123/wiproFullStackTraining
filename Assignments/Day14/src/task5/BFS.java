package task5;
import java.util.*;
public class BFS {
	private Map<Integer, List<Integer>> adjacencyList;
	public BFS() {
		adjacencyList = new HashMap<>();
	}
	public void addEdge(int node1, int node2) {
		adjacencyList.putIfAbsent(node1, new ArrayList<Integer>());
		adjacencyList.putIfAbsent(node2, new ArrayList<Integer>());
		adjacencyList.get(node1).add(node2);
		adjacencyList.get(node2).add(node1);
	}
	public void bfs(int startNode) {
		Set<Integer> visited = new HashSet<Integer>();
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(startNode);
		visited.add(startNode);
		while(!queue.isEmpty()) {
			int currentNode = queue.poll();
			System.out.print(currentNode+" ");
			List<Integer> neighbours = adjacencyList.get(currentNode);
			if(neighbours!=null) {
				for(int neighbour : neighbours) {
					if(!visited.contains(neighbour)) {
						visited.add(neighbour);
						queue.add(neighbour);
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS graph = new BFS();
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 1);
		graph.addEdge(2, 3);
		graph.bfs(2);

	}

}
