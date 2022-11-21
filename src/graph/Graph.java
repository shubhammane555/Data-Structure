package graph;

public class Graph {
	private int V; //number of vertices in graph
private int E; //number of Edges in garph
	private int [][] adjmatrix;
	 
	public Graph(int nodes) {
		this.V=nodes;
		this.E=0;
		this.adjmatrix=new int[nodes][nodes];
	}
	
public void addEdge(int u ,int v) {
	adjmatrix[u][v]=1;
	adjmatrix[v][u]=1; //beacoz this is an undirected graph
	E++;
}

public String toString() {
	StringBuilder sb=new StringBuilder();
	sb.append(V +" vertices "+ E + "Edge" + "\n");
			for(int i=0;i<V;i++) {
				sb.append(i+":");
				
				for(int m:adjmatrix[i]) {
					
					sb.append(m+" ");
				}
				sb.append("\n");
			}
			return sb.toString();
}
public static void main(String[] args) {
Graph g=new Graph(4);
g.addEdge(0,1);
g.addEdge(1,2);
g.addEdge(2,3);
g.addEdge(3,0);
System.out.println(g);
}
}