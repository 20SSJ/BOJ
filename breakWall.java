import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class breakWall {
	
	static int dr[] = {-1, 1, 0, 0};
	static int dc[] = {0, 0, -1, 1};
	static int[][] map;
	static int N, M;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		for(int i = 0; i < N; i++) {
			String col = br.readLine();
			for(int j = 0; j < M; j++) {
				map[i][j] = col.charAt(j) - '0';
			}
		}
		System.out.println(bfs(0,0));
	}
	
	private static int bfs(int r, int c) {
		Queue<int[]>q = new ArrayDeque<>();
		boolean[][][] visited = new boolean[N][M][2];
		q.offer(new int[] {r, c, 0, 1});
		visited[r][c][0] = true;
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowR = now[0];
			int nowC = now[1];
			int wall = now[2];
			int dist = now[3];
			
			if(nowR == N -1 && nowC == M - 1) {
				return dist;
			}
			
			for(int d = 0; d < 4; d++) {
				int nr = nowR + dr[d];
				int nc = nowC + dc[d];
				if(isValid(nr, nc)) {
					if(map[nr][nc] == 0) {
						if(!visited[nr][nc][wall]) {
							visited[nr][nc][wall] = true;
							q.offer(new int[] {nr, nc, wall, dist + 1});
						}
					} else { // 다음 칸이 벽임
						if(wall == 0 && !visited[nr][nc][1]) { // 벽 부신 적 없음
							visited[nr][nc][1] = true;
							q.offer(new int[] {nr, nc, 1, dist + 1});
						}
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
