import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class EZPath {
	static class Point{
		int r, c;

		public Point(int r, int c) {
			super();
			this.r = r;
			this.c = c;
		}
	}
	
	static int N, M, map[][], dist[][];
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int start[] = new int[2];
		map = new int[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 2) {
					start = new int[]{i, j};
					map[i][j] = 0;
				}
			}
		}
		bfs(start[0], start[1]);
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				if(map[r][c] != 0 && dist[r][c] == 0) {
					dist[r][c] = -1;
				}
			}
		}
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < M; c++) {
				System.out.print(dist[r][c] + " ");
			} System.out.println();
		}
	}
	
	private static void bfs(int r, int c) {
		Queue<Point> q = new ArrayDeque<Point>();
		boolean[][] v = new boolean[N][M];
		dist = new int[N][M];
		q.offer(new Point(r, c));
		v[r][c] = true;
		dist[r][c] = 0;
		while(!q.isEmpty()) {
			Point cur = q.poll();
			for(int d = 0 ; d < 4; d++) {
				int nr = dr[d] + cur.r;
				int nc = dc[d] + cur.c;
				if(isValid(nr, nc)) {
					if(map[nr][nc] != 0 && !v[nr][nc]) {
						dist[nr][nc] = dist[cur.r][cur.c] + 1;
						v[nr][nc] = true;
						q.offer(new Point(nr, nc));
					}
				}
			}
		}
	}
	
	private static boolean isValid(int nr, int nc) {
		return (nr >= 0 && nr < N && nc >= 0 && nc < M);
	}
}
