import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class ground {
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
	
	static List<Node>[] road;
	static int n, m, r, item[];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		item = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= n; i++) {
			item[i] = Integer.parseInt(st.nextToken());
		}
		road = new ArrayList[n+1];
		for(int i = 1; i <= n; i++) {
			road[i] = new ArrayList<>();
		}
		for(int i = 0; i < r; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			road[a].add(new Node(b, l));
			road[b].add(new Node(a, l));
		}
		int mxItem , value;
		mxItem = value = 0;
		for(int i = 1; i <= n; i++) {
			value = dijkstra(i);
			if(mxItem < value) mxItem = value;
		}
		System.out.println(mxItem);
	}
	
	private static int dijkstra(int start) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(start, 0));
		int[] res = new int[n + 1];
		int idx = 0;
		int[] dist = new int[n + 1];
		Arrays.fill(dist, 1501);
		dist[start] = 0;
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(cur.weight > dist[cur.to]) continue;
			for(Node next: road[cur.to]) {
				int nextDis = cur.weight + next.weight;
				if(nextDis <= m && nextDis < dist[next.to]) {
					dist[next.to] = nextDis;
					pq.offer(new Node(next.to, nextDis));
				}
			}
		}
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(dist[i] <= m) {
				ans += item[i];
			}
		}
		return ans;
	}
}
