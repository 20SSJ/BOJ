import java.util.*;
import java.io.*;

public class getMinWage {
	static class Node implements Comparable<Node>{
		int to, value;

		public Node(int to, int value) {
			this.to = to;
			this.value = value;
		}

		@Override
		public int compareTo(Node o) {
			return Integer.compare(value, o.value);
		}
	}

	static int n, m;
	static List<Node>[] city;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine().trim());
		m = Integer.parseInt(br.readLine().trim());
		
		city = new ArrayList[n+1];
		for(int i = 0; i <= n; i++) {
			city[i] = new ArrayList<>();
		}
		
		StringTokenizer st;
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			city[from].add(new Node(to, weight));
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		dijstra(start, end);
	}
	
	private static void dijstra(int start, int end) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		int[] dist = new int[n+1];
		int[] path = new int[n+1];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[start] = 0;
		pq.offer(new Node(start, 0));
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			
			if (cur.value > dist[cur.to]) continue;
			
			for(Node next: city[cur.to]) {
				if(dist[next.to] > dist[cur.to] + next.value) {
					dist[next.to] = dist[cur.to]+ next.value;
					path[next.to]= cur.to; 
					pq.offer(new Node(next.to, dist[next.to]));
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(dist[end]).append("\n");
		
		Stack<Integer> stck = new Stack<>();
		int now = end;
		while(now != 0) {
			stck.push(now);
			now = path[now];
		}
		
		sb.append(stck.size()).append("\n");
		while(!stck.isEmpty()) {
			sb.append(stck.pop()).append(" ");
		}
		System.out.println(sb.toString());
	}
}
