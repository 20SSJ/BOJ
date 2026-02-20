import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class MinCost {
	static class Point {
		int node, weight;
		
		Point(int node, int weight) {
			this.node = node;
			this.weight = weight;
		}
		
	}
	static List<Point>[] BUS;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		BUS = new ArrayList[N + 1];
		for(int i = 1; i <= N; i++) {
			BUS[i] = new ArrayList<>();
		}
		StringTokenizer st;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			BUS[from].add(new Point(to, weight));
		}
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		djikstra(start, end, N);
	}
	
	static void djikstra(int start, int end, int N) {
		PriorityQueue<Point> q = new PriorityQueue<>((v1, v2) -> v1.weight - v2.weight);
		int[] dist = new int[N + 1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[start] = 0;
		q.offer(new Point(start, 0));
		
		while(!q.isEmpty()){
			Point now = q.poll();
			
			if(dist[now.node] < now.weight) continue;
			if(now.node == end) {
				System.out.println(dist[now.node]);
			}
			
			for (Point p: BUS[now.node]) {
				if (dist[p.node] > dist[now.node] + p.weight) {
					dist[p.node] = dist[now.node] + p.weight;
					q.offer(new Point(p.node, dist[p.node]));
				}
			}
			
		}
	}

}
