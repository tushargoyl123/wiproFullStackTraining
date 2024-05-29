package com.graph;

public class UnionFind {
	int[] parent, rank;

	public UnionFind(int n) {
		parent = new int[n];
		rank = new int[n];
		for (int i = 0; i < n; i++) {
			parent[i] = i;
			rank[i] = 0;
		}
	}

	public int find(int x) {
		if (parent[x] != x) {
			parent[x] = find(parent[x]);
		}
		return parent[x];

	}

	public boolean union(int x, int y) {
		int rootX = find(x);
		int rootY = find(y);
		if (rootX == rootY)
			return false;
		if (rank[rootX] > rank[rootY]) {
			parent[rootY] = rootX;
		} else if (rank[rootX] < rank[rootY]) {
			parent[rootX] = rootY;
		} else {
			parent[rootY] = rootX;
			rank[rootX]++;
		}
		return true;
	}

	public boolean hasCycle(int[][] edges) {
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			int rootU = find(u);
			int rootV = find(v);
			if (rootU == rootV) {
				return true;
			}
			union(u, v);
		}
		return false;
	}
}
