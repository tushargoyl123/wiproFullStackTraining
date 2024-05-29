package task2;

import java.util.Arrays;


public class KruskalAlgorithm {
	class Edge implements Comparable<Edge> {
		int src, dest, weight;

		@Override
		public int compareTo(Edge compareEdge) {
			// TODO Auto-generated method stub
			return this.weight - compareEdge.weight;
		}
	}

	class Subset {
		int parent, rank;
	}

	int V, E;
	Edge edge[];

	public KruskalAlgorithm(int v, int e) {
		// TODO Auto-generated constructor stub
		V = v;
		E = e;
		edge = new Edge[E];
		for (int i = 0; i < e; ++i) {
			edge[i] = new Edge();
		}
	}

	int find(Subset subsets[], int i) {
		if (subsets[i].parent != i) {
			subsets[i].parent = find(subsets, subsets[i].parent);
		}
		return subsets[i].parent;
	}

	void union(Subset subsets[], int x, int y) {
		int rootX = find(subsets, x);
		int rootY = find(subsets, y);
		if (subsets[rootX].rank < subsets[rootY].rank) {
			subsets[rootX].parent = rootY;
		} else if (subsets[rootX].rank > subsets[rootY].rank) {
			subsets[rootY].parent = rootX;
		} else {
			subsets[rootY].parent = rootX;
			subsets[rootX].rank++;
		}

	}

	void KruskalMST() {
		Edge result[] = new Edge[V];
		int e = 0;
		int i = 0;
		for(i=0; i<V; ++i) {
			result[i] = new Edge();
		}
		Arrays.sort(edge);
		Subset subsets[] = new Subset[V];
		for(i=0; i<V; ++i) {
			subsets[i] = new Subset();
		}
		for(int v=0; v<V; ++v) {
			subsets[v].parent = v;
			subsets[v].rank = 0;
		}
		i=0;
		while(e<V-1) {
			Edge nextedge = new Edge();
			nextedge = edge[i++];
			int x = find(subsets,nextedge.src);
			int y = find(subsets,nextedge.dest);
			if(x!=y) {
				result[e++] = nextedge;
				union(subsets,x,y);
			}
		}
		System.out.println("Following are the edges in the constructed MST:");
		for(i=0; i<e; i++) {
			System.out.println(result[i].src+"--"+result[i].dest+"=="+result[i].weight);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V = 4;
		int E = 5;
		KruskalAlgorithm graph = new KruskalAlgorithm(V, E);
		graph.edge[0].src = 0;
		graph.edge[0].dest = 1;
		graph.edge[0].weight = 10;
		
		graph.edge[1].src = 0;
		graph.edge[1].dest = 2;
		graph.edge[1].weight = 6;
		
		graph.edge[2].src = 0;
		graph.edge[2].dest = 3;
		graph.edge[2].weight = 5;
		
		graph.edge[3].src = 1;
		graph.edge[3].dest = 3;
		graph.edge[3].weight = 15;
		
		graph.edge[4].src = 2;
		graph.edge[4].dest = 3;
		graph.edge[4].weight = 4;
		
		graph.KruskalMST();
		
	}

}
