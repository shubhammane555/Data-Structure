package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphdfs {

	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	public Graphdfs(int nodes) {
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
	
	public void dfs(int s) {
		boolean []visited =new boolean[V];
		Stack<Integer> stack=new Stack<>();
		stack.push(s);
		
		
		
		while(!stack.isEmpty()) {
			int u=stack.pop();
			
			if(!visited[u]) {
				visited[u]=true;
			
			
			System.out.println(u);
			for(int v:adj[u]) {
				if(!visited[v]) {
					
		stack.push(v);
				
				
					
				}
			}
		}
		
	}
	}
	public static void main(String[] args) {
		Graphdfs g=new Graphdfs(5);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		g.addEdge(2, 4);
		g.dfs(0);
		
	
	
	
	}
}