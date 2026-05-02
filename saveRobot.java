import java.io.*;
import java.util.*;

public class saveRobot {

	static int dr[] = {-1, 1, 0, 0};
	static int dc[] = {0, 0, -1, 1};
	static int n, map[][];
	static class Node implements Comparable<Node>{
		int r, c, weight;
		
		public Node(int r, int c, int weight) {
			this.r = r;
			this.c = c;
			this.weight = weight;
		}
		
		public int compareTo(Node o) {
			return Integer.compare(weight, o.weight);
		}
	}
	
	public static int dijkstra() {
		int[][] dist = new int[n][n];
		for(int i = 0; i < n; i++) Arrays.fill(dist[i], n * 10 * 10);
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.offer(new Node(0, 0, 0));
		dist[0][0] = 0;
		
		while(!pq.isEmpty()) {
			Node cur = pq.poll();
			if(cur.r == n - 1 && cur.c == n-1) {
				return cur.weight;
			}
			
			if(cur.weight > dist[cur.r][cur.c]) continue;
			
			for(int d = 0; d < 4; d++) {
				int nr = cur.r + dr[d];
				int nc = cur.c + dc[d];
				
				if(isValid(nr, nc)) {
					int value = 0; // 낮은 곳일 때
					// 같은 곳일 때
					if(map[nr][nc] == map[cur.r][cur.c]) {
						value = 1;
						// 높은 곳일 때
					} else if(map[nr][nc] > map[cur.r][cur.c]) {
						value = 2 * (map[nr][nc] - map[cur.r][cur.c]);
					}
					if(dist[nr][nc] > dist[cur.r][cur.c]+ value) {
						dist[nr][nc] = dist[cur.r][cur.c] + value;
						pq.offer(new Node(nr, nc, dist[nr][nc]));
					}
				}
			}
		}
		return -1;
	}
	
	public static boolean isValid(int r, int c) {
		return r >= 0 && r < n && c >= 0 && c < n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tc = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int t = 1; t <= tc; t++) {
			n = Integer.parseInt(br.readLine());
			map = new int[n][n];
			for(int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			sb.append("#").append(t).append(" ").append(dijkstra()).append("\n");
		}
		System.out.println(sb);
	}

}
