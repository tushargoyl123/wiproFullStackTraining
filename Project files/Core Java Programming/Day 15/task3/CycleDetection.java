package task3;

import com.graph.UnionFind;

public class CycleDetection {
	private int V;
	private int[][] edges;
	public CycleDetection(int V, int[][] edges) {
		this.V = V;
		this.edges = edges;
	}
	public boolean hasCycle() {
		UnionFind uf = new UnionFind(V);
		for(int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			if(!uf.union(u, v)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 4;
		int[][] edges = {
				{0,1},
				{1,2},
				{2,3},
				{3,0}
		};
		CycleDetection graph = new CycleDetection(V, edges);
		if(graph.hasCycle()) System.out.println("Graph contains a cycle");
		else System.out.println("Graph does not contains a cycle");
	}

}
