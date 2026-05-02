import java.io.*;
import java.util.*;

public class breakWallTwo {
	static class Node{
		int r, c, wall;

		public Node(int r, int c, int wall) {
			this.r = r;
			this.c = c;
			this.wall = wall;
		}
	}
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	static int N, M, K, map[][];
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String cols = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = cols.charAt(j) - '0';
			}
		}
		System.out.println(bfs(0, 0));
	}
	
	private static int bfs(int r, int c) {
		if(N == 1 && M == 1) return 1;
		
		Queue<Node> q = new ArrayDeque<>();
		int[][][] dist = new int[N][M][K + 1];
		
		q.offer(new Node(r, c, 0));
		dist[r][c][0] = 1;
		
		while(!q.isEmpty()) {
			Node e = q.poll();
			
			for(int d = 0; d < 4; d++) {
				int nr = e.r + dr[d];
				int nc = e.c + dc[d];
				
				if(isValid(nr, nc)) {
					if(map[nr][nc] == 0 && dist[nr][nc][e.wall] == 0) {
						dist[nr][nc][e.wall] = dist[e.r][e.c][e.wall] + 1;
						if(nr == N - 1 && nc == M - 1) return dist[nr][nc][e.wall];
						q.offer(new Node(nr, nc, e.wall));
					} else if(map[nr][nc] == 1 && e.wall < K && dist[nr][nc][e.wall + 1] == 0){
						dist[nr][nc][e.wall + 1] = dist[e.r][e.c][e.wall] + 1;
						if(nr == N - 1 && nc == M - 1) return dist[nr][nc][e.wall + 1];
						q.offer(new Node(nr, nc, e.wall + 1));
					}
				}
			}
		}
		return -1;
	}
	
	private static boolean isValid(int r, int c) {
		return (r >= 0 && r < N && c >= 0 && c < M);
	}

}
