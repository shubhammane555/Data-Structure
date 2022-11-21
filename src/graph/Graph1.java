package graph;

import java.util.LinkedList;

public class Graph1 {

	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	public Graph1(int nodes) {
		this.V=nodes;
		this.E=0;
		this.adj=new LinkedList[nodes];
		for(int i=0;i<V;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	public void addEdge(int u,int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(V+"verties"+E+"edges"+"\n");
		for(int i=0;i<V;i++) {
			sb.append(i+":");
			for(int s:adj[i]) {
				sb.append(s+" ");
			}
		sb.append("\n");
		}
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Graph1 g=new Graph1(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);
	
	
	
	}
}