import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class shortestPath{
	static class Node implements Comparable<Node>{
		int to, weight;

		public Node(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(weight, o.weight);
		}
		
	}
	static int V, E, K, dist[];
	static final int MAXVALUE = 600000000;
	static List<Node>[] graph;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		V = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(br.readLine());
		graph = new ArrayList[V + 1];
		for(int i = 1; i <= V; i++) {
			graph[i] = new ArrayList<>();
		}
		for(int i = 1; i <= E; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			graph[u].add(new Node(v, w));
		}
		dijkstra(K);
		for(int i = 1; i <= V; i++) {
			int result = dist[i];
			if(result == MAXVALUE) System.out.println("INF");
			else {
				System.out.println(dist[i]);
			}
		}
	}
	
	private static void dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		dist = new int[V + 1];
		Arrays.fill(dist, MAXVALUE);
		dist[start] = 0;
		pq.add(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node e = pq.poll();
			
			if(dist[e.to] < e.weight) continue;
			for(Node o : graph[e.to]) {
				if(dist[o.to] > dist[e.to] + o.weight) {
					dist[o.to] = dist[e.to] + o.weight;
					pq.offer(new Node(o.to, dist[o.to]));
				}
			}
		}
		
	}

}
