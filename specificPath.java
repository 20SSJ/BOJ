import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class specificPath {
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
	static int N, v1, v2;
	static final int MAXVALUE = 2400000;
	static List<Node>[] graph;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		graph = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			graph[i] = new ArrayList<>();
		}
		while(E-- > 0) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			graph[a].add(new Node(b, c));
			graph[b].add(new Node(a, c));
		}
		st = new StringTokenizer(br.readLine());
		v1 = Integer.parseInt(st.nextToken());
		v2 = Integer.parseInt(st.nextToken());
		
		int[] distFromOne = dijstra(1);
		int[] distFromVOne = dijstra(v1);
		int[] distFromVTwo = dijstra(v2);
		
		int res1 = distFromOne[v1] + distFromVOne[v2] + distFromVTwo[N];
		int res2 = distFromOne[v2] + distFromVTwo[v1] + distFromVOne[N];
		
		int ans = Math.min(res1, res2);
		if(ans > MAXVALUE) System.out.println(-1);
		else {
			System.out.println(ans);
		}
	}
	
	private static int[] dijstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int dist[] = new int[N + 1];
		Arrays.fill(dist, MAXVALUE);
		dist[start] = 0;
		pq.add(new Node(start, 0));
		while(!pq.isEmpty()) {
			Node now = pq.poll();
			
			if(dist[now.to] < now.weight) continue;
			
			for(Node o : graph[now.to]) {
				if(dist[o.to] > dist[now.to] + o.weight) {
					dist[o.to] = dist[now.to] + o.weight;
					pq.offer(new Node(o.to, dist[o.to]));
				}
			}
		}
		return dist;
	}

}
