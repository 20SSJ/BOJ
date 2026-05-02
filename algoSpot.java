import java.io.*;
import java.util.*;

public class algoSpot {

	static class Node implements Comparable<Node>{
		int r, c, w;
		
		Node(int r, int c, int w){
			this.r = r;
			this.c = c;
			this.w = w;
		}
		
		public int compareTo(Node o) {
			return Integer.compare(w, o.w);
		}
	}
	
	static int N, M, maze[][];
	static int[] dr = new int[] {-1, 1, 0, 0};
	static int[] dc = new int[] {0, 0, -1, 1};
	private static int bfs() {
		Queue<Node> q = new PriorityQueue<>();
		q.offer(new Node(0, 0, 0));
		int[][]dist = new int[N][M];
		for(int i = 0; i < N; i++) Arrays.fill(dist[i], 10001);
		dist[0][0] = 0;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			int curR = cur.r;
			int curC = cur.c;
			int wall = cur.w;
			
			if(curR == N - 1 && curC == M - 1) {
				return wall;
			}
			
			for(int d = 0; d < 4; d++) {
				int nr = curR + dr[d];
				int nc = curC + dc[d];
				
				if(isValid(nr, nc)) {
					if(maze[nr][nc] == 1) {
						int nxtWall = wall + 1;
						if(dist[nr][nc] > dist[curR][curC] + 1) {
							dist[nr][nc] = dist[curR][curC] + 1;
							q.offer(new Node (nr, nc, nxtWall));
						}
					}
					else {
						if(dist[nr][nc] > dist[curR][curC]) {
							dist[nr][nc] = dist[curR][curC];
							q.offer(new Node (nr, nc, wall));
						}
					}
				}
			}
		}
		return dist[N-1][M-1];
	}
	
	private static boolean isValid(int r, int c) {
		return r >= 0 && r < N && c >= 0 && c < M;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		maze = new int[N][M];
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				maze[i][j] = str.charAt(j) - '0';
			}
		}
		System.out.println(bfs());
	}

}
